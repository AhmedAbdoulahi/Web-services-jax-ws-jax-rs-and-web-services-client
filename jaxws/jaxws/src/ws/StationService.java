package ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import metier.entities.Carburant;

import metier.entities.Station;
import metier.rep.Imetier;
import metier.rep.metierImpl;

//webservice sont des classe pojo plein old java object et on utilise les anotayion ci_dessous
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class StationService {
	
	//@Autowired
	Imetier metier ;
	//private metierImpl metier = new metierImpl() ;
	
	@WebMethod
	public String message() {
		return "bonjour" ;
	}
	
	@WebMethod
	public void addCarburant(@WebParam(name="id_carburant") Long id_carburant,@WebParam(name="nom")  String nom, 
			@WebParam(name="description") String description) {
		Carburant c = new Carburant(id_carburant,nom,description) ;
		metier.addCarburant(c) ;
	}
	
	@WebMethod
	public void addStation(@WebParam(name="id_station") int id_station,@WebParam(name="nom")  String nom, 
			@WebParam(name="ville") String ville, @WebParam(name="adresse") String adresse) {
		Station s = new Station(id_station,nom,ville,adresse) ;
		metier.addStation(s); ;
	}
	
	//la liste des station
	@WebMethod
	public List<Station> getAllStation(){
		return metier.getAllStation() ;
	}
	
	//la liste de carburant
	@WebMethod
	public List<Carburant> getAllCarburant(){
		return metier.getAllCarburant() ;
	}
	
	@WebMethod
	public double retourner(String nomStation, Date date) {
		return 10.5 ;
	}
	@WebMethod
	public List<Station> lister(){
		return metier.getAllStation() ;
	}
	/*@WebMethod
	public double retourner(String nomStation, Date date) {
		return 10.5 ;
	}*/
	@WebMethod
	public List<Double> retournerPrix(@WebParam(name="nom_station") String s , @WebParam(name="date") Date date){
		
		return metier.retournerPrix(s, date)  ;
	}
}
