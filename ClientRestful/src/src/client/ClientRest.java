package src.client;

import java.net.URI;



public class ClientRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cli = Client.create(new DefaultClientConfig()) ;
		URI uri = UriBuilder.fromUri("http://localhost:8080/jaxrs").build() ;
		//list des stations
		ClientResponse response = cli.ressource(uri).Path("/Station").get(ClientResponse.class);
		//pour recuperer la list ......
		String c = response.getEntity(String.class) ;
		//les prix sachant nom et date
		ClientResponse prix = client.ressource(uri).path("").post(ClientResponse.class,"nomstat","01/01/1425");
	}

}
