package io.manish;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokemonDeskInitiatorRemove {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		pokemon p = entityManager.find(pokemon.class, "pikachu");
		
		
		
		if(p != null) {
			p.setPower(1000);
	
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
		}
		
		else
		{
			System.out.println("Data Entry is not found");
		}


	}

}
