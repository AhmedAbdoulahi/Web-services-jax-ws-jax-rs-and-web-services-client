package service;

import java.util.Date;
import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import metier.entities.Carburant;
import metier.entities.Station;
import metier.rep.metierImpl;

//pour creer un service restful on utilise l'anotation suivante
@Singleton
@Path("/jaxrs")
@Produces(MediaType.APPLICATION_JSON )
public class ApplicationRest {
	private metierImpl metier ;
	
	public ApplicationRest() {
		metier = new metierImpl() ;
	}
	
	@GET
	@Path("/Stations")
	public List<Station> getAllStation(){
		return metier.getAllStation() ;
	}
	
	@GET
	@Path("/Carburants")
	public List<Carburant> getAllCarburant(){
		return metier.getAllCarburant() ;
	}
	
	@GET
	@Path("/Station/{id}")
	public Station getStation(@PathParam(value="id") Long id) {
		return metier.getStation(id) ;
	}
	
	@POST
	@Path("/Station")
	public void addStation(Station s) {
		metier.addStation(s);
	}
	
	@POST
	@Path("/Carburant")
	public void addCarburant(Carburant c) {
		metier.addCarburant(c) ;
	}
	
	//methode qui retourne les prix de carburants sachant nom_station et date
	@GET
	@Path("/prix/{nom}/{date}")
	public List<Double> retournerPrix( @QueryParam("nom") String nom, @QueryParam("date") Date date){
		return metier.retournerPrix(nom, date) ;
	}
}
