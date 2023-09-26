package Functions;

public class String_LinesCount {

	
	/*
	//A R
	public static int LinesCount(String str) {
		
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\n' || i==ch.length-1) {
				count++;
			}
		}
		return count;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "udiuwen\n dbjwhbdhewbdubwe\nyqxqeyxgy\ngdywe ye\neuejbeuw";
		
		int count = LinesCount(str);
		System.out.println("The number of lines in the given string is: "+count);

	}
	*/
	
	
	
	/*
	//NA NR
		public static void LinesCount() {
			
			String str = "udiuwen\n dbjwhbdhewbdubwe\nyqxqeyxgy\ngdywe ye\neuejbeuw";
			int count=0;
			char[] ch=str.toCharArray();
			
			
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='\n' || i==ch.length-1) {
					count++;
				}
			}
			System.out.println("The number of lines in the given string is: "+count);
			
			
			
		}
		
		
		public static void main(String[] args) {
	
			LinesCount();

		}
		*/
	
	
	
	/*
	//A NR
		public static void LinesCount(String str) {
			
			int count=0;
			char[] ch=str.toCharArray();
			
			
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='\n' || i==ch.length-1) {
					count++;
				}
			}
		
			System.out.println("The number of lines in the given string is: "+count);
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "udiuwen\n dbjwhbdhewbdubwe\nyqxqeyxgy\ngdywe ye\neuejbeuw";
			
			LinesCount(str);
			

		}
		*/
	

	
	//NA R
		public static int LinesCount() {
			
			String str = "udiuwen\n dbjwhbdhewbdubwe\nyqxqeyxgy\ngdywe ye\neuejbeuw";
			int count=0;
			char[] ch=str.toCharArray();
			
			
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='\n' || i==ch.length-1) {
					count++;
				}
			}
			return count;
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int count = LinesCount();
			System.out.println("The number of lines in the given string is: "+count);

		}
	
}
