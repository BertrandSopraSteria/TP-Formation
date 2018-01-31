package villages.test;

import villages.Application;
import villages.dao.RegionDao;
import villages.model.Region;

public class RegionTest {

	public static void main(String[] args) {
		RegionDao regionDao = Application.getInstance().getProduitDao();

		Region region1 = new Region("Code1", "Libelle1");

		regionDao.create(region1);
	}

}
