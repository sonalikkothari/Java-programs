package File_IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplcStrInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader freadr = new FileReader("sonali.txt");
			BufferedReader buffrd = new BufferedReader(freadr);
			File file = new File("newsonali.txt");
	
			FileWriter fwritr = new FileWriter("newsonali.txt");
			
			String line = buffrd.readLine();
			System.out.println("The line is:: "+line);
						
			
			while(line != null) {
				
				//if(line.matches("Sonali")) {
				if(line.contains("Sonali"))	{
				line = line.replaceAll("Sonali", "Sonali-Kothari");
					System.out.println(line);	
					//fwritr.append(line+'\n');
					fwritr.write(line +'\n');
					fwritr.flush();
				} else {
					fwritr.write(line+'\n');
					fwritr.flush();
				}
					line = buffrd.readLine();
			
			}
			fwritr.close();
				/*String[] parts = line.split(" ");
				
				for(String wrds: parts){
					if(wrds.matches("Sonali"))
						wrds.replaceAll("Sonali", "Sonali-Kothari");
			}*/
					
		//	line = buffrd.readLine();
		//	System.out.println("The line is:: "+line);
			
		//	}
			
		//	String line1 = buffrd.readLine();
			//while(line1!=null)
				//System.out.println(line1);
			//System.out.println("The matching pattern in a file are::  "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


		
	




