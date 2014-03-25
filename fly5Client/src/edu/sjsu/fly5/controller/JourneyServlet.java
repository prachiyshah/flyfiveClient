package edu.sjsu.fly5.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.glassfish.gmbal.ManagedAttribute;

import edu.sjsu.fly5.manager.JourneyManager;
import edu.sjsu.fly5.pojos.FlightInstance;
import edu.sjsu.fly5.pojos.PaymentDetails;
import edu.sjsu.fly5.pojos.Person;
import edu.sjsu.fly5.pojos.Traveller;

/**
 * Servlet implementation class JourneyServlet
 */
public class JourneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JourneyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		HttpSession userSession = request.getSession();
		
		if(action.equals("insertPassengerDetails")){
			int noOfAdults = (Integer) userSession.getAttribute("adults");
			int noOfChild = (Integer) userSession.getAttribute("children");
			int noOfInfant = (Integer) userSession.getAttribute("infants");
			int noOfPassengers = (Integer) userSession.getAttribute("noOfPassenger") ;
			
			Traveller[] travellers = new Traveller[noOfAdults+noOfChild+noOfInfant];
			Person[] persons = new Person[noOfAdults+noOfChild+noOfInfant];
			
			String firstName="";
			for(int i=0; i<travellers.length;i++)
			{
				int count=i+1;
				
				String dateOfBirth = request.getParameter("dob"+count);
				String newMonth = dateOfBirth.substring(0, dateOfBirth.length()-8);
				String newDate = dateOfBirth.substring(3,dateOfBirth.length()-5);
				String newYear = dateOfBirth.substring(6, dateOfBirth.length());
				
				String newDateFormat = newYear + "-" + newMonth+"-"+newDate;
				
				java.util.Date date =null;
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				
				try
				{
					date = dateFormat.parse(newDateFormat);
				}
				catch(ParseException e)
				{
					e.printStackTrace();
				}
				
				Calendar calender = Calendar.getInstance();
				calender.setTime(date);
				System.out.println("Calender Date"+calender);
				firstName=request.getParameter("fn"+count);
				persons[i] = new Person();
				persons[i].setFirstName(firstName);
				System.out.println("fname"+i+":"+persons[i].getFirstName());
				persons[i].setLastName(request.getParameter("ln"+count));
				System.out.println("lname"+i+":"+persons[i].getLastName());
				persons[i].setDateOfBirth(calender);
				travellers[i]= new Traveller();
				travellers[i].setNationality(request.getParameter("ntly"+count));
				System.out.println("Ntly"+i+":"+travellers[i].getNationality());
				travellers[i].setPassportNumber(request.getParameter("pspt"+count));
				System.out.println("pspt"+i+":"+travellers[i].getPassportNumber());
				
				System.out.println("traveller class"+request.getParameter("type"));
				
				travellers[i].setTravellerType(request.getParameter("type"+count));
				
			}
			
			for(int j=0;j<travellers.length;j++)
			{
				int count=j+1;
				userSession.setAttribute("fn"+count, persons[j].getFirstName());
				userSession.setAttribute("ln"+count, persons[j].getLastName());
				userSession.setAttribute("dob"+count, persons[j].getDateOfBirth());
				userSession.setAttribute("pspt"+count, travellers[j].getPassportNumber());
				userSession.setAttribute("ntly"+count, travellers[j].getNationality());
				userSession.setAttribute("type"+count, travellers[j].getTravellerType());
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("payment.jsp");
			rd.forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("insertPaymentDetails"))
		{
			int length = (Integer) userSession.getAttribute("noOfPassenger");
			Person[] persons = new Person[length];
			Traveller[] travellers = new Traveller[length];
			
			for(int i=0;i<length;i++)
			{
				int count = i+1;
				persons[i] = new Person();
				String firstName = (String) userSession.getAttribute("fn"+count);
				persons[i].setFirstName(firstName);
				String lastName = (String)userSession.getAttribute("ln"+count);
				persons[i].setLastName(lastName);
				Calendar date = (Calendar) userSession.getAttribute("dob"+count);
				persons[i].setDateOfBirth(date);
				
				travellers[i]=new Traveller();
				String passportNo = (String)userSession.getAttribute("pspt"+count);
				travellers[i].setPassportNumber(passportNo);
				String nationality = (String)userSession.getAttribute("ntly"+count);
				travellers[i].setNationality(nationality);
				//String travellerClass = (String)userSession.getAttribute("travellerClass");
				//travellers[i].setTravellerClass(travellerClass);
				travellers[i].setTravellerClass("Economic");
				String travellerType = (String) userSession.getAttribute("type"+count);
				System.out.println("traveller typr from session: "+travellerType);
				travellers[i].setTravellerType(travellerType);
			}
			    FlightInstance [] flights = new FlightInstance[1];
				FlightInstance flightInstance = (FlightInstance)userSession.getAttribute("selectedFlight");
				flights[0] = flightInstance;
				
				PaymentDetails paymentDetails =null;
				
				JourneyManager managerObj = new JourneyManager();
				boolean flag =  managerObj.bookJourney(travellers, flights, paymentDetails, persons);
				
				//System.out.println("flag" + flag);
				RequestDispatcher rd = request.getRequestDispatcher("confirmation.jsp");
				rd.forward(request, response);
			}
		
		}
		
	}





