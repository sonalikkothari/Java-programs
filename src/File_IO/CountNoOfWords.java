package File_IO;
//count no of words in a program
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountNoOfWords {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			FileReader freadr = new FileReader("sonali.txt");
			BufferedReader buffrd = new BufferedReader(freadr);
			String line = buffrd.readLine();
		//	System.out.println("The first line is:: "+line);
			int count = 0;
			while(line != null) {
				String[] parts = line.split(" ");
				
				for(String wrds: parts)
					count++;
			line = buffrd.readLine();
			}
				
			System.out.println("The no of words in a file are::  "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
