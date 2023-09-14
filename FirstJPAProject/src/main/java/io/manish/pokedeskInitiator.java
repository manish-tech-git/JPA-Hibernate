package io.manish;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokedeskInitiator {

	public static void main(String[] args) {
		
		
		pokemon p1 = new pokemon();
		p1.setName("pikachu");
		p1.setType("Fire");
		p1.setPower(100);
		
		pokemon p2 = new pokemon();
		p2.setName("Manish");
		p2.setType("Electrical");
		p2.setPower(200);
		
		pokemon p3 = new pokemon();
		p3.setName("Meowth");
		p3.setPower(300);
		p3.setType("RRR");
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityTransaction.commit();

	}

}
