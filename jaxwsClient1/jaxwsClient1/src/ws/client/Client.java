package ws.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ws.StationService;
import ws.StationServiceServiceLocator;

public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		StationService stub = new StationServiceServiceLocator().getStationServicePort() ; 
		//String message = stub.message() ;
		//System.out.println(stub.getCarburant((long) 2, "bon", "produit fluide") ) ;
		System.out.println(stub.message());
		stub.addCarburant((long)1, "essence", "s'evapore et flamable");
	}

}
