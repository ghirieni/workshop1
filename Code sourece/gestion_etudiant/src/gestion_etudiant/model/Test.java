package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();

		e1.info();
		e2.info();

		try (Scanner sc = new Scanner(System.in)) {

			boolean status = false;

			while (status == false) {
				System.out.println("donner le nom :");
				String n = sc.nextLine();
				if (n.length() <= 30 && n.length() >= 8) {
					e1.setNom(n);
					status = true;
				} else {
					System.out.println("nom invalide");
				}
			}

			status = false;
			while (status == false) {
				System.out.println("donner l'àge :");
				int a = sc.nextInt();
				if (a <= 28 && a >= 18) {
					e1.setAge(a);
					status = true;
				} else {
					System.out.println("age invalide");
				}
			}

			status = false;
			while (status == false) {

				System.out.println("donner le moyenne :");
				double m = sc.nextDouble();// must be with , not with .
				if (m <= 20 && m >= 0) {
					e1.setMoyenne(m);
					status = true;
				} else {
					System.out.println("donner invalide");
				}
			}
			sc.nextLine();// for consuming any caractére after nextint or nextdouble

			System.out.println("donner l'adresse :");
			String ad = sc.nextLine();
			e1.setAdresse(ad);
			
			
			System.out.println("\n*****************");
			e1.info();
			System.out.println("*****************\n");
			System.out.println("merci pour votre attention !");

		}
	}
}
