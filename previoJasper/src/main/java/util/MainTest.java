package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MainTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("previoJasper");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//em.persist();
		
		em.getTransaction().commit();

	}

}
