/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface EmployeeService extends java.rmi.Remote {
    public boolean addEmployee(edu.sjsu.fly5.pojos.Employee employee) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public boolean updateEmployee(edu.sjsu.fly5.pojos.Employee employee) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.Employee viewEmployeeInfo(long employeeID) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.Employee[] listEmployees() throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public boolean removeEmployee(long employeeID) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.Employee[] searchEmployeesBasedOnAttributes(edu.sjsu.fly5.pojos.Attribute[] attributes) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
}
