/**
 * JourneyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface JourneyService extends java.rmi.Remote {
    public boolean bookJourney(edu.sjsu.fly5.pojos.Traveller[] traveller, edu.sjsu.fly5.pojos.FlightInstance[] flightInstance, edu.sjsu.fly5.pojos.PaymentDetails paymentDetails, edu.sjsu.fly5.pojos.Person[] person) throws java.rmi.RemoteException;
    public boolean cancelJourney(int bookingId) throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Journey[] listAllJourneys() throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Journey[] listAllJourney(java.lang.String userName) throws java.rmi.RemoteException;
    public boolean rescheduleJourney(java.lang.String bookingId, edu.sjsu.fly5.pojos.Journey journey) throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Journey generateItinerary(long bookingReferenceNo, java.lang.String lastName) throws java.rmi.RemoteException;
}
