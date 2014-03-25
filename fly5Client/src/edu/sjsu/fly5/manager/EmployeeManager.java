package edu.sjsu.fly5.manager;

import java.rmi.RemoteException;

import edu.sjsu.fly5.pojos.Attribute;
import edu.sjsu.fly5.pojos.Employee;
import edu.sjsu.fly5.pojos.Person;
import edu.sjsu.fly5.services.EmployeeServiceProxy;
import edu.sjsu.fly5.util.Fly5Exception;

public class EmployeeManager 
{
	private static final String FLY5_EMPLOYEE_SERVICE = "http://localhost:8080/fly5/services/EmployeeService?wsdl";
	EmployeeServiceProxy proxy = new EmployeeServiceProxy();
	
	public boolean addEmployee(Employee employee) throws Fly5Exception, RemoteException
	{
		boolean flag=false;
		try
		{
		proxy.setEndpoint(FLY5_EMPLOYEE_SERVICE);
		flag=proxy.addEmployee(employee);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public Employee[] listOfEmployees() throws Fly5Exception, RemoteException
	{
		Employee[] listOfEmployees=null;
		proxy.setEndpoint(FLY5_EMPLOYEE_SERVICE);
		listOfEmployees=proxy.listEmployees();
		return listOfEmployees;
	}
	
	public Employee viewEmployeeInfo(long employeeID) throws Fly5Exception, RemoteException
	{
		proxy.setEndpoint(FLY5_EMPLOYEE_SERVICE);
		Employee employee=proxy.viewEmployeeInfo(employeeID);
		return employee;
	}
	
	public boolean updateEmployee(Employee employee) throws Fly5Exception, RemoteException
	{
		proxy.setEndpoint(FLY5_EMPLOYEE_SERVICE);
		boolean flag=proxy.updateEmployee(employee);
		return flag;
	
	}
	public Employee[] listEmployeesBasedOnAttributes(Attribute[] listOfAttributes) throws Fly5Exception, RemoteException
	{
		proxy.setEndpoint(FLY5_EMPLOYEE_SERVICE);
		Employee[] listOfEmployees=proxy.searchEmployeesBasedOnAttributes(listOfAttributes);
		return listOfEmployees;
	}
	
	public boolean removeEmployee(long employeeID) throws Fly5Exception, RemoteException
	{
		proxy.setEndpoint(FLY5_EMPLOYEE_SERVICE);
		boolean flag=proxy.removeEmployee(employeeID);
		return flag;
	
	}
	
	

}
