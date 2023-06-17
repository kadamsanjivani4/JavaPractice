package studyeasy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOpWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("src\\practice.txt"));
			String line;
			System.out.println("File contents: ");
			while (sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
