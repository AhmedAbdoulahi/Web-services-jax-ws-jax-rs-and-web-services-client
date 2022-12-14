package serveur;

import jakarta.xml.ws.Endpoint;
import ws.StationService;

public class serveurJWS {
	public static void main(String[] args) {
		
		String url = "http://0.0.0.0:8080/" ;
		Endpoint.publish(url,new StationService()) ;
		System.out.println("serveur deployer sur l'adresse : "+url);
	}
}
