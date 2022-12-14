package metier.rep;

import java.util.Date;
import java.util.List;

import metier.entities.Carburant;
import metier.entities.HistoCarb;
import metier.entities.Station;

public interface Imetier {
	//crud station
	public void addStation(Station s) ;
	public Station getStation(Long id) ;
	public List<Station> getAllStation() ;
	public void deleteStation(Station s) ;
	public Station updateStation(Long id) ;
	//crud carburant
	public void addCarburant(Carburant c) ;
	public Carburant getCarburant(Long id) ;
	public List<Carburant> getAllCarburant() ;
	public void deleteCrburant(Carburant c) ;
	//prix carburant
	public void addHistoCarb(HistoCarb hb) ;
	public String getNomStation(Long id) ; 
	public List<Double> retournerPrix(String s,Date date) ;
}
