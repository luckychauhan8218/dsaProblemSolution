import java.io.*;
public class CreateFile {
public static void main(String[] args) {
	try {
		FileWriter fw= new FileWriter("students.txt");
		fw.write("Hello, this is java learning");
		fw.write("\nWelcome to java file");
		fw.close();
		System.out.println("File created successfully");
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
}
}
