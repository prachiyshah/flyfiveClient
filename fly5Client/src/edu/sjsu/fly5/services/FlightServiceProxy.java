package edu.sjsu.fly5.services;

public class FlightServiceProxy implements edu.sjsu.fly5.services.FlightService {
  private String _endpoint = null;
  private edu.sjsu.fly5.services.FlightService flightService = null;
  
  public FlightServiceProxy() {
    _initFlightServiceProxy();
  }
  
  public FlightServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightServiceProxy();
  }
  
  private void _initFlightServiceProxy() {
    try {
      flightService = (new edu.sjsu.fly5.services.FlightServiceServiceLocator()).getFlightService();
      if (flightService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightService != null)
      ((javax.xml.rpc.Stub)flightService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.sjsu.fly5.services.FlightService getFlightService() {
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService;
  }
  
  public boolean updateFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.updateFlightDetails(flight);
  }
  
  public boolean deleteFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.deleteFlightDetails(flightId);
  }
  
  public boolean addFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.addFlightDetails(flight);
  }
  
  public boolean viewFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.viewFlightDetails(flightId);
  }
  
  public edu.sjsu.fly5.pojos.Flight[] listFlights() throws java.rmi.RemoteException{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.listFlights();
  }
  
  public edu.sjsu.fly5.pojos.Flight searchFlight(edu.sjsu.fly5.pojos.Attribute[] searchAttributes) throws java.rmi.RemoteException{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.searchFlight(searchAttributes);
  }
  
  
}