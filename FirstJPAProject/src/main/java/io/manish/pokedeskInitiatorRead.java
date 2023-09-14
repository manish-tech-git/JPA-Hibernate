package io.manish;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class pokedeskInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		pokemon p = entityManager.find(pokemon.class, "pikachu");
		
		System.out.println();
		System.out.println(p);

	}

}
