package Basic;

public class StringReverseOrderOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi Hello";
		String s1 = "", s2 = "";
		int len = str.length();
		int i;
		for(i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {

				break;
			} else {
				s1 = s1 + str.charAt(i);

			}
		}
	
		for (int j = i + 1; j < len; j++) {

			s2 = s2 + str.charAt(j);
		}

		System.out.print(s2 + " ");
		System.out.println(s1);
	}

}
