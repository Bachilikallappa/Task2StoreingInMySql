package com.jspiders;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainEmplaoyeClass {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employe employe = new Employe();
		Employe employe2 = new Employe();
		Employe employe3 = new Employe();
		
		employe.setId(1001);
		employe.setName("Ismail k");
		employe.setQualification("BE");
		employe.setMail("ismail199@gmail.com");
		employe.setPno(8105190);
		
		employe2.setId(1002);
		employe2.setName("Ravi");
		employe2.setQualification("BE");
		employe2.setMail("Ravi21@gmail.com");
		employe2.setPno(829677);
		
		employe3.setId(1003);
		employe3.setName("Lava");
		employe3.setQualification("BE");
		employe3.setMail("Lava20@gmail.com");
		employe3.setPno(829677);
		
		entityTransaction.begin();
		//entityManager.persist(employe);
		entityManager.persist(employe2);
		entityManager.persist(employe3);
		
		entityTransaction.commit();

	}

}
