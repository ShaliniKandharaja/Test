package logicprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	 public static void main(String[] args) throws IOException {

	        String location = "./file/Learn Automation Online.txt";

	        FileReader fileReader = new FileReader(location);
	        BufferedReader reader = new BufferedReader(fileReader);

	        String currentLine;
	        //String currentLine = reader.readLine();

	        while ((currentLine = reader.readLine()) != null) {
	            System.out.println(currentLine);
	        }

	        reader.close();
	    }

}
