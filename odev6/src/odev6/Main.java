package odev6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	

	public static void main(String[] args) throws IOException  {
		createFile();
		readallfile();
		istedigimSatirOkuma2(3);
		
		
		
		
		
	
		

	}
	
	
	public static void createFile() throws IOException {
		
		File file= new File("metin.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	
		String kelimeler="Huseyin uyanik manisa \n 24 mart 1995 \n Bursa teknik uni \nMekatronik muhendisligi";
		
		FileWriter fileWriter= new FileWriter(file, false);
		BufferedWriter bWriter= new BufferedWriter(fileWriter);
		bWriter.write(kelimeler);
		bWriter.close();
		
	}
	
	
	public static void readallfile() {
		File file= new File("C:\\java2022\\odev6\\metin.txt");
		
		
		try {
			Scanner myReader= new Scanner(file);
			
			while(myReader.hasNextLine()) {
				String line = myReader.nextLine();
				System.out.println(line);
			}
			
			myReader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	

	
	
	
	public static String  istedigimSatirOkuma2( int numberOfLine) throws IOException {
		
		
		
		ArrayList<String> data = new ArrayList<String>(Files.readAllLines(Paths.get("C:\\java2022\\odev6\\metin.txt")));

        String wordsAtLine;

        wordsAtLine = data.get(numberOfLine-1);
        System.out.println(wordsAtLine);

        return wordsAtLine;
    	}
		
		
		
	
		
	
	
	
	
	
	
	

}
