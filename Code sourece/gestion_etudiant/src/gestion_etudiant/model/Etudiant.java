package gestion_etudiant.model;

public class Etudiant {

	private String nom ;
	private int age;
	private double moyenne ;
	private String adresse; 
	
	public void info(){
		System.out.println("nom: "+nom +" age: "+age+" moyenne: "+moyenne+" adresse: "+adresse);
		
	}
	public Etudiant () {
	}
	
	public Etudiant (String nom, int age , double moyenne , String adresse ) {
		this.nom= nom;
		this.age=age;
		this.moyenne=moyenne;
		this.adresse=adresse;
	}


	public void setNom(String nom) {
	
		this.nom=nom;

	}
	public String GetNom() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		 
			this.age = age;	
		
		
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
			this.moyenne = moyenne;

	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
}
