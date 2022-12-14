package metier.entities;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Carburant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_carburant ;
	private String nom ;
	private String description ;
	
	@OneToMany(mappedBy="carburant")
	private List<HistoCarb> histo ;

	public Carburant() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Carburant(Long id_carburant, String nom, String description) {
		super();
		this.id_carburant = id_carburant;
		this.nom = nom;
		this.description = description;
		this.histo = histo;
	}

	public Long getId_carburant() {
		return id_carburant;
	}

	public void setId_carburant(Long id_carburant) {
		this.id_carburant = id_carburant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<HistoCarb> getHisto() {
		return histo;
	}

	public void setHisto(List<HistoCarb> histo) {
		this.histo = histo;
	}
	
}
