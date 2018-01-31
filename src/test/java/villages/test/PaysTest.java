package villages.test;

import villages.Application;
import villages.dao.PaysDao;
import villages.model.Pays;

public class PaysTest {

	public static void main(String[] args) {
		PaysDao paysDao = Application.getInstance().getPaysDao();

		Pays pays1 = new Pays("Code1", "Libelle1");

		paysDao.create(pays1);
	}

}
