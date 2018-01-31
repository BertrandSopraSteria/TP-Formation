package villages.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import villages.Application;
import villages.dao.PaysDao;
import villages.model.Pays;

public class PaysDaoJpa implements PaysDao {

	@Override
	public Pays find(Long id) {
		Pays Pays = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Pays = em.find(Pays.class, id);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {

			if (em != null) {
				em.close();
			}
		}
		return Pays;
	}

	@Override
	public List<Pays> findAll() {
		List<Pays> liste = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Query query = em.createQuery("from Pays");
			liste = query.getResultList();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {

			if (em != null) {
				em.close();
			}
		}
		return liste;
	}

	@Override
	public void create(Pays obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.persist(obj);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {

			if (em != null) {
				em.close();
			}
		}
	}

	@Override
	public Pays update(Pays obj) {
		Pays objCopy = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			objCopy = em.merge(obj);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {

			if (em != null) {
				em.close();
			}
		}

		return objCopy;
	}

	@Override
	public void delete(Pays obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.remove(em.merge(obj));

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {

			if (em != null) {
				em.close();
			}
		}
	}

}
