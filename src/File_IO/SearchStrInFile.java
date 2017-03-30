package File_IO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SearchStrInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader freadr = new FileReader("sonali.txt");
			BufferedReader buffrd = new BufferedReader(freadr);
			String line = buffrd.readLine();
			System.out.println("The line is:: "+line);
			int count = 0;
			while(line != null) {
				String[] parts = line.split(" ");
				
				for(String wrds: parts){
					if(wrds.matches("Java"))
						count++;
				}
					//count++;
			line = buffrd.readLine();
			System.out.println("The line is:: "+line);
			
			}
				
			System.out.println("The matching pattern in a file are::  "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}




