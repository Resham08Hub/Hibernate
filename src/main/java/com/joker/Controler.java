package com.joker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controler {
	
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
  //	to give connection
	EntityManager em=emf.createEntityManager();
	// use to built methods to perform curd opration
//	1.persist 2.find 3.remove 4.merge
	EntityTransaction et=em.getTransaction();
//	to perform the transaction 
//	1.begin 2.commit
//	Dept d1=new Dept();
//	em.persist(d1);
	Emp e1=new Emp();
	 e1.setEmp_name("jethalal");
	 e1.setEmp_no(2);
	 e1.setJob("gada electronics");
	et.begin();
	 em.persist(e1);
	et.commit();
}
}
