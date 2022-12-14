package metier.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Station {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_station ;
	private String nom ;
	private String ville ;
	private String adresse ;
	
	@OneToMany(mappedBy="station")
	private List<HistoCarb> histo ;

	public Station() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Station(int id_station, String nom, String ville, String adresse) {
		super();
		this.id_station = (long) id_station;
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
		this.histo = histo;
	}

	public Long getId_station() {
		return id_station;
	}

	public void setId_station(Long id_station) {
		this.id_station = id_station;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<HistoCarb> getHisto() {
		return histo;
	}

	public void setHisto(List<HistoCarb> histo) {
		this.histo = histo;
	}
	
	
}
