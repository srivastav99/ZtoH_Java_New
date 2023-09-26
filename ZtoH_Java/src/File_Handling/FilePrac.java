package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FilePrac {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\newfile");
		
		f.mkdir();
		f.delete();
		f.mkdir();
		
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\newfile\\tr.txt");
		
		f1.createNewFile();
			
		FileInputStream fis = null;
		fis = new FileInputStream("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\newfile\\tr.txt");
		
		FileOutputStream fos = null;
		fos = new FileOutputStream("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\newfile\\tr.txt");
		
		
		FileWriter f12 = null;
		 f12 = new FileWriter(f1);
		
		
		
		try {
			f12.write("this is stupid note\n");
			f12.write("this is stupid note\n");
			f12.flush();
			
			
			f12.write("this is stupid note\n");
			f12.write("this is stupid note\n");
			f12.write("this is stupid note\n");
			f12.flush();
			f12.write("blah blah\n");
			f12.append("dfvrgrtgv");
			f12.flush();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		  
		Scanner sc = new Scanner(f1);
		
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		 
		try {
			fis.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		int i;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}
			
		

	}

}
