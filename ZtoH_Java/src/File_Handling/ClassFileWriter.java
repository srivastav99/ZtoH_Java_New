package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ClassFileWriter { 

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\FileWriter");

		f.mkdir();
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\FileWriter\\FileWriter.txt");
		
		f1.createNewFile();
		
		FileWriter f12 = new FileWriter(f1);
		
		
		f12.write("this is a test file for file writer\n");
		f12.write("this is a test file for file writer\n");
		f12.flush();
		
		
		f12.write("this is a test file for file writer\n");
		f12.write("this is a test file for file writer\n");
		f12.write("this is a test file for file writer\n");
		f12.flush();
		f12.write("this is a test file for file writer\n");
		f12.append("demo");
		f12.flush();
		f12.close();

	}

}
