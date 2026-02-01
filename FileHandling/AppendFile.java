import java.io.*;
public class AppendFile {
public static void main(String[] args) {
	try {
		FileWriter fw= new FileWriter("students.txt");
		fw.write("\n This line is added during practice.");
		fw.close();
		System.out.println("Text Appended successfully");
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
}
}
