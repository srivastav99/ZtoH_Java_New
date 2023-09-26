package Basic;

public class Switch_FallThrough_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet = 'z';  
		switch(alphabet)  
		{  
		case 'a':  
		//System.out.println("It is a vowel.");  
		//vowels  
		case 'e':  
		case 'i':  
		case 'o':  
		case 'u':  
		System.out.println("The alphabet '" + alphabet + "' is a vowel.");  
		break;  
		//consonant  
		//case 'b':  
		//case 'c':  
		//case 'd':  
		//System.out.println("It is consonant.");  
		default:  
		System.out.println("The alphabet '" + alphabet + "' is a consonant.");  
		}  
	}

	

}
