package metier.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class HistoCarb {
	
	private Date date ;
	private double prix ;
	
	@ManyToOne
	@JoinColumn(name = "id_station")
	private Station station ;
	
	@ManyToOne
	@JoinColumn(name = "id_carburant")
	private Carburant carburant ;

	public HistoCarb() {
		super();
		//TODO Auto-generated constructor stub
	}

	public HistoCarb(Date date, double prix, Station station, Carburant carburant) {
		super();
		this.date = date;
		this.prix = prix;
		this.station = station;
		this.carburant = carburant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Carburant getCarburant() {
		return carburant;
	}

	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}
	
	
}
