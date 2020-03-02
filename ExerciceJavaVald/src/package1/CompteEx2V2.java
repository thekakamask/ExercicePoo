package package1;

class Compte {  
	int solde = 0;  
	void deposer(int montant){  
		solde = solde + montant;  }  
	void retirer(int montant){  
		solde = solde -montant;  } 
	void virerVers(int montant, Compte destination){  
		this.retirer(montant);  
		destination.deposer(montant);  
		}  
	void afficher(){  System.out.println("solde: "+ solde);  }  
		} 

public class CompteEx2V2 {
	// la methode virerVers fait intervenir 2 comptes :
	//celui du debiteur et celui du crediteur
	//elle fait intervenir 
	//deux objets de type Compte: this, l’objet sur lequel 
	//la méthode est appélée et autre, le paramètre de la méthode. 
	//Le virement s’effectue duparamètre versthis. L’argent est
	//retiré d’un compte et déposé sur l’autre.
	public static void main (String[]args) {
		Compte Antoine = new Compte();
		Compte Jean = new Compte();
		Antoine.deposer(500);
		Jean.deposer(1000);
		Jean.retirer(10);
		Antoine.virerVers(75, Jean);
		Antoine.afficher();
		Jean.afficher();
		Compte[] TableauCompte = new Compte[10];
		for (int i=0; i<TableauCompte.length; i++) {
			TableauCompte[i] = new Compte();
			TableauCompte[i].deposer(200 + i*100);
		    for (int j = i+1 ; j<TableauCompte.length ; j++) {
		    	TableauCompte[i].virerVers(20,TableauCompte[j]);
		    }
		}
		for (int i=0; i<TableauCompte.length; i++)	{
			System.out.println("Compte numero " + i + " : ");
			TableauCompte[i].afficher();
		}
	}
}
