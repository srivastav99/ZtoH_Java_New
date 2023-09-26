package Inheritance;

import java.util.Scanner;

import Inheritance.Trainee.DLogin;
 //There are servers of different teams - dummy servers, storage servers, cloud servers, citrix servers, master server.

 //Trainees can only access dummy servers;  storage servers;
 //storage team members can access dummy servers;
 //cloud team members can access dummy servers, storage servers,cloud servers;
 //citrix team members can access dummy servers, storage servers,cloud servers,citrix servers;
 //Members with master credentials can access dummy servers, storage servers,cloud servers,citrix servers,master servers;

 //Trainee team members - Sam, Ajay, Neetu
 //Storage team members - Patrick, Deepika, Rohan
 //Cloud team members - Lewis, Rohit, Rahul
 //Citrix team members - Prasid, Edwards, Megana
 //Members with master credentials - Azar, Colin

//Every members of each team has a password in which first letter Z stands for company name, second letter stands for team of that particular memeber.
//t stands for trainee team, s stands for storage team, c stands for cloud team, i stands for citrix team, m stands for master credentials.
class Trainee{
	void Dserver(){
		System.out.println("You can use dummy servers.");
		
		
		
	}
	class DLogin{
		void DserverLogin(){
			
			System.out.println("Choose the Dummy server you want to access:1,2,3");
			Scanner sc = new Scanner(System.in);
			int s=sc.nextInt();
		
			switch (s) {
			case 1:
				System.out.println("Welcome to dummy server 1.");
				break;
	
			case 2:
				System.out.println("Welcome to dummy server 2.");
				break;
			case 3:
				System.out.println("Welcome to dummy server 3.");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
	
	
}
class Storage extends Trainee{
	void Sserver(){
		Dserver();
		System.out.println("You can use Storage servers.");
	}
	class SLogin{
		void SserverLogin(){
			System.out.println("Choose the Storage server you want to access:1,2,3");
			Scanner sc = new Scanner(System.in);
			int s=sc.nextInt();
		
			switch (s) {
			case 1:
				System.out.println("Welcome to Storage server 1.");
				break;
	
			case 2:
				System.out.println("Welcome to Storage server 2.");
				break;
			case 3:
				System.out.println("Welcome to Storage server 3.");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
class Cloud extends Storage{
	void Cserver(){
		Sserver();
		System.out.println("You can use cloud servers.");
	}
	class CLogin{
		void CserverLogin(){
			System.out.println("Choose the Cloud server you want to access:1,2,3");
			Scanner sc = new Scanner(System.in);
			int s=sc.nextInt();
		
			switch (s) {
			case 1:
				System.out.println("Welcome to Cloud server 1.");
				break;
	
			case 2:
				System.out.println("Welcome to Cloud server 2.");
				break;
			case 3:
				System.out.println("Welcome to Cloud server 3.");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
class Citrix extends Cloud{
	void Ciserver(){
		Cserver();
		System.out.println("You can use citrix servers.");
	}
	class CiLogin{
		void CiserverLogin(){
			System.out.println("Choose the Citrix server you want to access:1,2,3");
			Scanner sc = new Scanner(System.in);
			int s=sc.nextInt();
		
			switch (s) {
			case 1:
				System.out.println("Welcome to Citrix server 1.");
				break;
	
			case 2:
				System.out.println("Welcome to Citrix server 2.");
				break;
			case 3:
				System.out.println("Welcome to Citrix server 3.");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
class Master extends Citrix{
	void Mserver(){
		Ciserver();
		System.out.println("You can use master server.");
	}
	class MLogin{
		void MserverLogin(){
			System.out.println("Choose the Master server you want to access:1,2");
			Scanner sc = new Scanner(System.in);
			int s=sc.nextInt();
		
			switch (s) {
			case 1:
				System.out.println("Welcome to Master server 1.");
				break;
	
			case 2:
				System.out.println("Welcome to Master server 2.");
				break;
			
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}



public class ServersAccess {

	public static void main(String[] args) {
		
		String[] trainee={"Zta1","Zta2","Zta3"},storage={"Zsa1","Zsa2","Zsa3"},cloud={"Zca1","Zca2","Zca3"},citrix={"Zia1","Zia2","Zia3"},mastercreds={"Zma1","Zma2"};
		
		 
		
		System.out.println("Enter password to server:");
		Scanner sc = new Scanner(System.in);
		
		String password=sc.next();
		
		if(password.charAt(0)=='Z'){
			if(password.contains("t")) {
				
				if(password.equals("Zta1")) {
					System.out.println("Welcome Sam");
				}
				if(password.equals("Zta3")) {
					System.out.println("Welcome Ajay");
				}
				if(password.equals("tabc3")) {
					System.out.println("Welcome Neetu");
				}
				for(int i=0;i<trainee.length;i++)
				{
					if(password.equals(trainee[i])) {
					Trainee o = new Trainee();
					o.Dserver();
					Trainee.DLogin d= o.new DLogin(); 
					d.DserverLogin();
					break;
				}
				}
			}
			
			if(password.contains("s")) {
				
				if(password.equals("Zsa1")) {
					System.out.println("Welcome Patrick");
				}
				if(password.equals("Zsa2")) {
					System.out.println("Welcome Deepika");
				}
				if(password.equals("Zsa3")) {
					System.out.println("Welcome Rohan");
				}
				
				for(int i=0;i<storage.length;i++)
				{
					if (password.equals(storage[i])) {
						Storage o= new Storage();
						o.Sserver();
						
						System.out.println("Select:\n1 for trainee servers\n2 for Storage servers");
						int sel=sc.nextInt();
						if(sel==1) {
							Trainee.DLogin d= o.new DLogin(); 
							d.DserverLogin();
							break;
						}
						else if (sel==2) {
							Storage.SLogin d= o.new SLogin(); 
							d.SserverLogin();
							break;
						}
						
						
					}
				}
			} 
			
			if(password.contains("c")) {
				
				if(password.equals("Zca1")) {
					System.out.println("Welcome Lewis");
				}
				if(password.equals("Zca2")) {
					System.out.println("Welcome Rohit");
				}
				if(password.equals("Zca3")) {
					System.out.println("Welcome Rahul");
				}
				
				for(int i=0;i<cloud.length;i++)
				{
					if (password.equals(cloud[i])) {
							Cloud o= new Cloud();
							o.Cserver();
							
							System.out.println("Select:\n1 for trainee servers\n2 for Storage servers\n3 for Cloud servers");
							int sel=sc.nextInt();
							if(sel==1) {
								Trainee.DLogin d= o.new DLogin(); 
								d.DserverLogin();
								break;
							}
							else if (sel==2) {
								Storage.SLogin d= o.new SLogin(); 
								d.SserverLogin();
								break;
							}
							else if (sel==3) {
								Cloud.CLogin d= o.new CLogin(); 
								d.CserverLogin();
								break;
							}
							
					}
				}
			}
			if(password.contains("i")) {
				
				if(password.equals("Zia1")) {
					System.out.println("Welcome Prasid");
				}
				if(password.equals("Zia2")) {
					System.out.println("Welcome Edwards");
				}
				if(password.equals("Zia3")) {
					System.out.println("Welcome Megana");
				}
				
				for(int i=0;i<citrix.length;i++)
				{
			
					if (password.equals(citrix[i])) {
						Citrix o= new Citrix();
						o.Ciserver();
						
						System.out.println("Select:\n1 for trainee servers\n2 for Storage servers\n3 for Cloud servers\n4 for Citrix servers");
						int sel=sc.nextInt();
						if(sel==1) {
							Trainee.DLogin d= o.new DLogin(); 
							d.DserverLogin();
							break;
						}
						else if (sel==2) {
							Storage.SLogin d= o.new SLogin(); 
							d.SserverLogin();
							break;
						}
						else if (sel==3) {
							Cloud.CLogin d= o.new CLogin(); 
							d.CserverLogin();
							break;
						}
						else if (sel==4) {
							Citrix.CiLogin d= o.new CiLogin(); 
							d.CiserverLogin();
							break;
						}
					}
				}
			}
			
			if(password.contains("m")) {
						
				if(password.equals("Zma1")) {
					System.out.println("Welcome Azar");
				}
				if(password.equals("Zma2")) {
					System.out.println("Welcome Colin");
				}
				
				
				for(int i=0;i<mastercreds.length;i++)
				{
					if (password.equals(mastercreds[i])) {
						Master o= new Master();
						o.Mserver();
						
						System.out.println("Select:\n1 for trainee servers\n2 for Storage servers\n3 for Cloud servers\n4 for Citrix servers\n5 for master servers");
						int sel=sc.nextInt();
						if(sel==1) {
							Trainee.DLogin d= o.new DLogin(); 
							d.DserverLogin();
							break;
						}
						else if (sel==2) {
							Storage.SLogin d= o.new SLogin(); 
							d.SserverLogin();
							break;
						}
						else if (sel==3) {
							Cloud.CLogin d= o.new CLogin(); 
							d.CserverLogin();
							break;
						}
						else if (sel==4) {
							Citrix.CiLogin d= o.new CiLogin(); 
							d.CiserverLogin();
							break;
						}
						else if (sel==5) {
							Master.MLogin d= o.new MLogin(); 
							d.MserverLogin();
							break;
						}
					}
				}
			}
		}
		else {
			System.out.println("Invalid password.");
		}
			
		
		
	}

}
