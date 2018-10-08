package week1.H2;

public class usedCase2 {
	public static void main(String[] args) {
		Deelnemer d1 = new Deelnemer();
		d1.vullen("Ab",true, 5, 23);
		controleer(d1);
	}
	
	static void controleer(Deelnemer deelnemer) {
		if(deelnemer.persoonlijkheid == true && deelnemer.leeftijd < 35 && deelnemer.ta > 4) {
			System.out.println(deelnemer.naam + " is aangenomen.");
		}else {
			System.out.println(deelnemer.naam + " is niet aangenomen.");
		}
	}
	
}

class Deelnemer{
	String naam;
	boolean persoonlijkheid;
	int ta;
	int leeftijd;
	
	void vullen(String nm, boolean ps, int techn, int leeft){
		naam = nm;
		persoonlijkheid = ps;
		ta = techn;
		leeftijd = leeft;
	}	
}
