package Basic;


import java.util.Scanner;


public class SwitchNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select:\n1 for movies\n2 for web series");
		int n = sc.nextInt();
		switch (n) {
			case 1:
				System.out.println("Select:\n1 for Adventure movies\n2 for Action movies\n3 for Horror movies\n4 for Comedy movies");
				int mov = sc.nextInt();
				switch (mov) {
					case 1:
				
						System.out.println("You have entered into the world of Adventure movies.");
						break;
					case 2:
				
						System.out.println("You have entered into the world of Action movies.");
						break;
					case 3:
				
						System.out.println("You have entered into the world of Horror movies.");
						break;
					case 4:
				
						System.out.println("You have entered into the world of Comedy movies");
						break;

					default:
						System.out.println("Invalid input.");
			
				}
				break;		
			
		case 2:
			
			System.out.println("Select:\n1 for Adventure series\n2 for Action series\n3 for Horror series\n4 for Comedy series");
			int ser = sc.nextInt();
			switch (ser) {
				case 1:
				
					System.out.println("You have entered into the world of Adventure series.");
					break;
				case 2:
				
					System.out.println("You have entered into the world of Action series.");
					break;
				case 3:
				
					System.out.println("You have entered into the world of Horror series.");
					break;
				case 4:
				
					System.out.println("You have entered into the world of Comedy series.");
					break;
				default:
					System.out.println("Invalid input.");
		
			}
			break;
		default:
			System.out.println("Invalid output.");
			
		}
	}

}
