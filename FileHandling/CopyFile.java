import java.io.*;
import java.io.IOException;
public class CopyFile {
public static void main(String[] args) {
	try {
		FileReader fr= new FileReader("students.txt");
		FileWriter fw= new FileWriter("students_copy.txt");
		int i;
		while((i=fr.read())!=-1) {
			fw.write(i);
		}
		fr.close();
		fw.close();
		System.out.println("File copied successfully");
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
}
}
