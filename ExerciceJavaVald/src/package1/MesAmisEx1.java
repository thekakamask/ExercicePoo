package package1;

import java.util.Scanner;

class Personne {
	String prenom;
	String nom;
	int age;
	public void presentezVous() {
		System.out.println("vous vous appelez : " + prenom + " " + nom + " et vous avez : " + age + "ans" );
	}
	public String quelEstVotreNom() {
		return prenom + " " + nom;
		}
		public int quelEstVotreAge() {
		return age;
		}
	
	}

public class MesAmisEx1 {
	public static void main (String[]args) {
		Personne Untel = new Personne();
		System.out.println("rentrez votre prenom");
		Scanner sc= new Scanner(System.in);
		String stri = sc.nextLine();
		Untel.prenom = stri;
		System.out.println("rentrez votre nom");
		Scanner sc1= new Scanner(System.in);
		String stri1 = sc.nextLine();
		Untel.nom = stri1;
		System.out.println("rentrez votre age");
		Scanner sc2 = new Scanner(System.in);
		int str1 = sc.nextInt();
		Untel.age = str1;
		Untel.presentezVous();
		System.out.println("voici vos informations : ");
		System.out.println("vos prenom/nom : " + Untel.quelEstVotreNom() );
		System.out.println("votre age : " + Untel.quelEstVotreAge() );
	}
}
