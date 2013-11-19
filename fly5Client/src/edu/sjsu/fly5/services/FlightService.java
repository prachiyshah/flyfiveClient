/**
 * FlightService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface FlightService extends java.rmi.Remote {
    public boolean updateFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException;
    public boolean deleteFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException;
    public boolean addFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException;
    public boolean viewFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Flight[] listFlights() throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Flight searchFlight(edu.sjsu.fly5.pojos.Attribute[] searchAttributes) throws java.rmi.RemoteException;
}
