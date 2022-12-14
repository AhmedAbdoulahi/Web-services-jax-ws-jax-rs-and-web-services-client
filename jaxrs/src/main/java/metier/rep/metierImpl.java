package metier.rep;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


import metier.entities.Carburant;
import metier.entities.HistoCarb;
import metier.entities.Station;


public class metierImpl implements Imetier{
	// on spécifie le nom de l'unité de persistence en paramètre
	EntityManager em ;
	//constructeur
	public metierImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monUniteDePersistance");
		EntityManager em = emf.createEntityManager();
	}
	
	
	@Override

	public void addStation(Station s) {
		// TODO Auto-generated method stub
		em.persist(s) ;
	}

	@Override
	
	public Station getStation(Long id) {
		// TODO Auto-generated method stub
		Station t = em.find(Station.class, id) ;
		return t;
	}

	@SuppressWarnings("unchecked")
	@Override
	
	public List<Station> getAllStation() {
		// TODO Auto-generated method stub
		
		return em.createQuery("Select s from Station s").getResultList();
	}

	@Override
	
	public void deleteStation(Station s) {
		// TODO Auto-generated method stub
		em.remove(s);
	}

	@Override
	
	public Station updateStation(Long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void addCarburant(Carburant c) {
		// TODO Auto-generated method stub
		em.persist(c);;
	}

	@Override
	
	public Carburant getCarburant(Long id) {
		// TODO Auto-generated method stub
		return em.find(Carburant.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carburant> getAllCarburant() {
		// TODO Auto-generated method stub
		return em.createQuery("Select c from Carburant c").getResultList();
	}

	@Override
	public void deleteCrburant(Carburant c) {
		// TODO Auto-generated method stub
		em.remove(c);
	}

	@Override
	public void addHistoCarb(HistoCarb hb) {
		// TODO Auto-generated method stub
		em.persist(hb);
	}

	@Override
	public String getNomStation(Long id) {
		// TODO Auto-generated method stub
		Station s = em.find(Station.class, id) ;
		return s.getNom() ;
	}

	@Override
	public List<Double> retournerPrix(String nom, Date date) {
		// TODO Auto-generated method stub
		
		return em.createQuery("select s.prix from Station s where e.nom : nom and e.date : date").getResultList();
	}

}
