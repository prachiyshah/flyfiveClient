package edu.sjsu.fly5.manager;

import java.rmi.RemoteException;

import edu.sjsu.fly5.pojos.Crew;
import edu.sjsu.fly5.pojos.Employee;
import edu.sjsu.fly5.services.CrewServiceProxy;
import edu.sjsu.fly5.util.Fly5Exception;

public class CrewManager
{
	private static final String FLY5_CREW_MANAGER = "http://localhost:8080/fly5/services/CrewService?wsdl";
	CrewServiceProxy proxy = new CrewServiceProxy();
	
	public Crew[] listOfCrews() throws Fly5Exception, RemoteException
	{
		Crew[] listOfCrews=null;
		proxy.setEndpoint(FLY5_CREW_MANAGER);
		listOfCrews=proxy.listcrews();
		return listOfCrews;
	}
	
	
	
}
