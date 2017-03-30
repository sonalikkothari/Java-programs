 package File_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		
		FileReader filerdr = new FileReader("sonali.txt");
		BufferedReader buffrdr = new BufferedReader(filerdr);
		FileWriter fw = new FileWriter("outputsonali.txt");
		
		String line = buffrdr.readLine();
		
		while(line != null) {
			fw.write(line+'\n');			
			fw.flush();
			
			line = buffrdr.readLine();
		}
		
		fw.close();
	}	
}
