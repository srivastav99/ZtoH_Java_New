package File_Handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ClassFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\fileoperations");
		
		f.mkdir();
		f.delete();
		f.mkdir();
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\fileoperations\\demofile.txt");
		
		f1.createNewFile();
		
		System.out.println("File path:"+f1.toPath());
		
		System.out.println("file exists:"+f1.exists());
		
		System.out.println("file free space:"+f1.getFreeSpace());
		
		System.out.println("file total space:"+f1.getTotalSpace());
		
		System.out.println("length of file:"+f1.length());	
		
		//copy
		File sourceFile = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\source");
		sourceFile.mkdir();
		File fsource = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\source\\demo.txt");
		fsource.createNewFile();
		File destinationFile = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\des");
		destinationFile.mkdir();
		File fdes = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\des\\demo.txt");
		
		
		Files.copy(fsource.toPath(), fdes.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		
		//move
		File sourceFileMove = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\sourcemove");
		sourceFileMove.mkdir();
		
			File fsourceMove = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\sourcemove\\demomove.txt");
			fsourceMove.createNewFile();
		
		
		File destinationFileMove = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\desmove");
		destinationFileMove.mkdir();
		
		File fdesMove = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\desmove\\demomove.txt");
		
		Files.move(fsourceMove.toPath(), fdesMove.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
	}

}
