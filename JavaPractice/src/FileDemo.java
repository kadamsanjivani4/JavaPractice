import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args)throws IOException{
		/*   File Creation
		 * 
		 * File file = new File("src\\practice.txt");
		file.createNewFile();
		System.out.println("File successfully created");*/
		
	/*	Making new directory and file within it
	 * 
	 * File directory = new File ("D:\\javafiles\\sanju");
		directory.mkdirs();
		System.out.println("Directory created");
		File file = new File ("D:\\javafiles\\sanju\\sample.txt");
		file.createNewFile();
		System.out.println("File created");*/
		
		/*File file = new File("src\\studyeasy");
		file.mkdir();
		file = new File ("src\\studyeasy\\sample.txt");
		file.createNewFile();
		System.out.println("File created");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,false))){
			
			bw.write("Welcome");
			bw.newLine();
			bw.write("java");
			bw.newLine();
			bw.write("programs.");
			bw.newLine();
			bw.write("File creation by Sanjivani.");
			System.out.println("File writing success.");
			bw.close();
			
		}catch(Exception e) {
			System.out.println("File writing error.");
			e.printStackTrace();
		}
		try {
		BufferedReader br = new BufferedReader(new FileReader("src\\studyeasy\\sample.txt"));
		String line;
		System.out.println("File contents: ");
		while ((line = br.readLine())!= null) {
			System.out.println(line);
		}
		br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		File file = new File("practice.txt");
		 if (file.delete()) {
			 System.out.println("File deleted successfully.");
		 }
		 else
			 System.out.println("Error during deletion.");
	}
}
