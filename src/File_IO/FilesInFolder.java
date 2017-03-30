package File_IO;

import java.io.File;

public class FilesInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("c:\\Intel\\Logs");
		String[] fileLst = file.list();
		
		for(String dispFile : fileLst) 
			System.out.println("File:: " +dispFile);
		
	}

}
