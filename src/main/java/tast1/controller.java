package tast1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class controller {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");
		 
		EntityManager em = emf.createEntityManager();
		 
		EntityTransaction et = em.getTransaction();
 
		User u1 = new User();
		System.out.println("enter mobile no:");
		long mobile = new Scanner(System.in).nextLong();
		u1.setMobile_no(mobile);

		System.out.println("enter your  password :");
		String pass = new Scanner(System.in).next();
		u1.setPassword(pass);

		System.out.println("enter user name:");
		String name = new Scanner(System.in).next();
		u1.setU_name(name);

		System.out.println("enter your mail id:");
		String mail = new Scanner(System.in).next();
		u1.setEmail(mail);

		System.out.println("enter the designation:");
		String u_job = new Scanner(System.in).next();
		u1.setJob(u_job);

		et.begin();
		em.persist(u1);
		et.commit();
	}
}