package edu.sjsu.fly5.controller;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sjsu.fly5.pojos.Flight;
import edu.sjsu.fly5.services.FlightServiceProxy;
import edu.sjsu.fly5.util.Fly5Exception;
import edu.sjsu.fly5.util.Patterns;

/**
 * Servlet implementation class FlightServlet
 */
public class FlightServlet extends HttpServlet {
	private static final String ERROR = "error";
	private static final long serialVersionUID = 1L;
	private FlightServiceProxy flightProxy = new FlightServiceProxy();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()
    {
    	flightProxy.setEndpoint("http://localhost:8080/fly5/services/FlightService");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		switch(action)
		{
			case "add":
				addFlight(request, response);
				break;
			case "update":
				updateFlight(request,response);
				break;
			case "delete":
				deleteFlight(request,response);
				break;
		}
		
		
	}

	private void deleteFlight(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String flightID = request.getParameter("dflightno");
		flightProxy.deleteFlightDetails(flightID);
		request.getRequestDispatcher("admin/flight.jsp").forward(request, response);
	}

	private void updateFlight(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String source = request.getParameter("esource");
		String destination = request.getParameter("edestination");
		String departureTime = request.getParameter("edeparture");
		String journeyTime = request.getParameter("ejourney");
		String frequency = request.getParameter("efrequency");
		String seats = request.getParameter("eseats");
		String baseFare = request.getParameter("efare");
		String distance = request.getParameter("edistance");
		Flight flight = getValidFlight(request, response,source,destination,departureTime,journeyTime,frequency,seats,baseFare,distance);
		flightProxy.updateFlightDetails(flight);
		request.getRequestDispatcher("admin/flight.jsp").forward(request, response);
	}

	private void addFlight(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			RemoteException, Fly5Exception {
		
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departureTime = request.getParameter("departure");
		String journeyTime = request.getParameter("journey");
		String frequency = request.getParameter("frequency");
		String seats = request.getParameter("seats");
		String baseFare = request.getParameter("fare");
		String distance = request.getParameter("distance");
		Flight flight = getValidFlight(request, response,source,destination,departureTime,journeyTime,frequency,seats,baseFare,distance);
		flightProxy.addFlightDetails(flight);
		request.getRequestDispatcher("admin/flight.jsp").forward(request, response);

	}

	private Flight getValidFlight(HttpServletRequest request,
			HttpServletResponse response, String source, String destination, String departureTime, String journeyTime, String frequency, String seats, String baseFare, String distance) throws ServletException, IOException {
		
		validateFlightParameters(source,destination,departureTime,journeyTime,frequency,seats,baseFare,distance,request,response);

		Flight flight = new Flight();
		flight.setCrewID(100);
		flight.setBaseFare(Double.parseDouble(baseFare));
		flight.setDepartureTime(departureTime);
		flight.setDestination(destination);
		flight.setDistance(Long.parseLong(distance));
		flight.setFlightStatus("available");
		flight.setNoOfSeats(Integer.parseInt(seats));
		flight.setSource(source);
		flight.setAirline("Fly5");
		flight.setJourneyTime(journeyTime);
		flight.setFrequency(frequency);
		return flight;
	}

	private boolean validateFlightParameters(String source, String destination,
			String departureTime, String journeyTime, String frequency, String seats, String baseFare, 
			String distance, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pattern pattern = Pattern.compile(Patterns.STRING_PATTERN);
		Matcher matcher = pattern.matcher(source);
		StringBuilder errorMessage = new StringBuilder();
		boolean flag = true;
		
		if(!matcher.find())
		{
			errorMessage.append("Invalid Source.");
			errorMessage.append("\n");
			flag = false;
		}
		matcher = pattern.matcher(destination);
		if(!matcher.find())
		{
			errorMessage.append("Invalid Destination.");
			errorMessage.append("\n");
			flag = false;
		}
		pattern = Pattern.compile(Patterns.TIME_PATTERN);
		matcher = pattern.matcher(departureTime);
		if(!matcher.find())
		{
			errorMessage.append("Invalid departure time. Format should be hh:mm");
			errorMessage.append("\n");
			flag = false;
		}
		matcher = pattern.matcher(journeyTime);
		if(!matcher.find())
		{
			errorMessage.append("Invalid journey time. Format should be hh:mm");
			errorMessage.append("\n");
			flag = false;
		}
		try{
			Integer.parseInt(seats);
			}catch(NumberFormatException e)
			{
				errorMessage.append("Seats should be numeric.");
				errorMessage.append("\n");
				flag = false;
			}
			try{
			Long.parseLong(distance);
			}catch(NumberFormatException e)
			{
				errorMessage.append("Distance should be numeric");
				errorMessage.append("\n");
				flag = false;
			}
			
			try{
			Double.parseDouble(baseFare);
			}catch(NumberFormatException e)
			{
				errorMessage.append("Base fare should be numeric");
				errorMessage.append("\n");
				flag = false;
			}
			
		if(!flag)
		{
			request.setAttribute(ERROR, errorMessage.toString());
			request.getRequestDispatcher("admin\flight.jsp").forward(request, response);;
		}
		return flag;
	}

}
