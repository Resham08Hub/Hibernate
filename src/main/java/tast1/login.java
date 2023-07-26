package tast1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class login {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		System.out.println("enter mobile no");
		long u_mobile_no = new Scanner(System.in).nextLong();
		User u = em.find(User.class, u_mobile_no);
		System.out.println(u);
		if (u != null) {
			String user_pass = u.getPassword();
			System.out.println("enter the password");
			String u_pwd = new Scanner(System.in).next();
			if (user_pass.equals(u_pwd)) {
				System.out
						.println("name:" + u.getU_name() + "\t" + "Email:" + u.getEmail() + "\t" + "job:" + u.getJob());
			} else {
				System.out.println("entered password is invalid");
			}
		} else {
			System.out.println("user doesn't exist");
		}

	}
}
