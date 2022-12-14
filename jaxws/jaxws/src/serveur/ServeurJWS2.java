package serveur;

import jakarta.xml.ws.Endpoint;
import ws.StationService;

public class ServeurJWS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://0.0.0.0:8284/service2" ;
		Endpoint.publish(url,new StationService()) ;
		System.out.println("serveur deployer sur l'adresse : "+url);
	}

}
