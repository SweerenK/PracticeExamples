package week1.H2;

public class UsedCase3 {

	public static void main(String[] args) {
		Product item1 = new Product();
		controleer(item1);

	}

	static void controleer(Product product) {
		product.toewijzen("Magere Yoghurt", 12, 1.45, 2);
	}
}

class Product{
	String naam;
	int aantal, dagenHoudbaar;
	double prijs;
	
	
	public void toewijzen(String na, int aa, double pr, int da){
		naam = na;
		aantal = aa;
		prijs = pr;
		dagenHoudbaar = da;
		
		if(aantal > 5 && prijs < 1 && dagenHoudbaar > 5) {
			System.out.println("Er is niets aan de hand");
		}else { 
			if(aantal < 5) 
				System.out.println(naam + " is bijna op!");
			if(prijs >= 1) 
				System.out.println(naam + " is duur.");
			if(dagenHoudbaar < 5)
				System.out.println(naam + " is nog even houdbaar.");
			}
	}
}
