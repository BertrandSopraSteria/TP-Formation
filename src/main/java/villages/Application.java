package villages;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import villages.dao.RegionDao;
import villages.dao.impl.RegionDaoJpa;

public class Application {
	private static Application instance = null;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("villages");

	private RegionDao regionDao = new RegionDaoJpa();
	
	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}
	
	public static void stop() {
		Application inst = getInstance();
		inst.regionDao = null;
		inst.emf.close();
		inst.emf = null;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public RegionDao getProduitDao() {
		return regionDao;
	}
}
