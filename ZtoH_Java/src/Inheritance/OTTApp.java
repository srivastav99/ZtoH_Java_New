package Inheritance;

import java.util.Scanner;


class TV{
	void TVEnglish(){
		System.out.println("You have access to 20 english channels.");
	}
	void TVTelugu() {
		System.out.println("You have access to 50 telugu channels.");
	}
	void TVOthers() {
		System.out.println("You have access to 30 other channels.");
	}
}
class Bronze extends TV{
	
	void OTTBronze() {
		TVEnglish();
		TVTelugu();
		TVOthers();
		System.out.println("You have access to following OTTs:\n1.Jio Cinema\n2.Eros Now\n3.TVF Play\n4.Discovery+\n5.VOOT");
		
	}
}

class Silver extends Bronze{
	
	void OTTSilver() {
		OTTBronze();
		System.out.println("6.Sony Liv\n7.Alt Balaji\n8.Prime Video");
	}
}
class Gold extends Silver{
	
	void OTTGold() {
		OTTSilver();
		System.out.println("9.Disney+ Hotstar\n10.Netflix");
	}
}


public class OTTApp {

	public static void main(String[] args) {
		
		String string=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your membership: TV,Bronze,Silver,Gold");
		string=sc.next();
		if(string.toLowerCase().equals("tv")) {
			TV o = new TV();
			o.TVEnglish();
			o.TVTelugu();
			o.TVOthers();
		}
		else if (string.toLowerCase().equals("bronze")) {
			Bronze o = new Bronze();
			o.OTTBronze();
		}
		else if (string.toLowerCase().equals("silver")) {
			Silver o = new Silver();
			o.OTTSilver();
		}
		else if (string.toLowerCase().equals("gold")) {
			Gold o = new Gold();
			o.OTTGold();
		}
		
		
	}

}
