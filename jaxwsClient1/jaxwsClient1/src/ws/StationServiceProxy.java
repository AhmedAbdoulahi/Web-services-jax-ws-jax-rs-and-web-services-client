package ws;

public class StationServiceProxy implements ws.StationService {
  private String _endpoint = null;
  private ws.StationService stationService = null;
  
  public StationServiceProxy() {
    _initStationServiceProxy();
  }
  
  public StationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initStationServiceProxy();
  }
  
  private void _initStationServiceProxy() {
    try {
      stationService = (new ws.StationServiceServiceLocator()).getStationServicePort();
      if (stationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stationService != null)
      ((javax.xml.rpc.Stub)stationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.StationService getStationService() {
    if (stationService == null)
      _initStationServiceProxy();
    return stationService;
  }
  
  public java.lang.String message() throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    return stationService.message();
  }
  
  public double[] retournerPrix(java.lang.String nom_station, java.util.Calendar date) throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    return stationService.retournerPrix(nom_station, date);
  }
  
  public void addStation(int id_station, java.lang.String nom, java.lang.String ville, java.lang.String adresse) throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    stationService.addStation(id_station, nom, ville, adresse);
  }
  
  public void addCarburant(java.lang.Long id_carburant, java.lang.String nom, java.lang.String description) throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    stationService.addCarburant(id_carburant, nom, description);
  }
  
  public ws.Carburant[] getAllCarburant() throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    return stationService.getAllCarburant();
  }
  
  public ws.Station[] lister() throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    return stationService.lister();
  }
  
  public double retourner(java.lang.String arg0, java.util.Calendar arg1) throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    return stationService.retourner(arg0, arg1);
  }
  
  public ws.Station[] getAllStation() throws java.rmi.RemoteException{
    if (stationService == null)
      _initStationServiceProxy();
    return stationService.getAllStation();
  }
  
  
}