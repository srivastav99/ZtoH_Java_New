package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClassReadingfile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\Readingfile");

		f.mkdir();
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\Readingfile\\Readingfile.txt");
		
		f1.createNewFile();
		
		FileWriter f12 = new FileWriter(f1);
		
		
		f12.write("this is a test file for Readingfile\n");
		f12.write("this is a test file for Readingfile\n");
		f12.flush();
		
		
		f12.write("this is a test file for Readingfile\n");
		f12.write("this is a test file for Readingfile\n");
		f12.write("this is a test file for Readingfile\n");
		f12.flush();
		f12.write("abcde\n");
		f12.append("demo");
		f12.flush();
		
		
		Scanner sc = new Scanner(f1);
		//line by line
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		
		//or
		//char by char
		FileReader fr = new FileReader(f1);
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		fr.close();
		
		//or
		//char by char
		FileInputStream fis = new FileInputStream(f1);
		int j;
		while((j=fis.read())!=-1){
			System.out.print((char)j);
		}
		
		//copying contents of one file to another file
		
		File f3 = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\copyContent");
		f3.mkdir();
		
		File f4 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\copyContent\\filetocopy.txt");
		//f4.createNewFile();//we dont have to create a file when we are to write in it, it will check for file, if not present it will create a file on its own and write in it.
		FileWriter f14 = new FileWriter(f4);//here the file filetocopy gets created
		f14.write("this a the file to be copied");
		f14.flush();
		
		
		File f5 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\copyContent\\fileres.txt");
		//f5.createNewFile(); //we dont have to create a file when we are to write in it, it will check for file, if not present it will create a file on its own and write in it.
		FileWriter f15 = new FileWriter(f5);//here the file gets created
		
		Scanner sc1 = new Scanner(f4);
		while(sc1.hasNextLine()) {
			String data = sc1.nextLine();
			f15.write(data);
			f15.flush();
			
		}
		
		
		
	}

}
