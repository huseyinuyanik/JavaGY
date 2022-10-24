package odev6_readFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MyReader {
	public ArrayList<String> readWords(String fileName) throws IOException {

        ArrayList<String> data = new ArrayList<String>(Files.readAllLines(Paths.get(fileName)));

        return data;
    }
    public String readAtLine(String fileName, int numberOfLine) throws IOException {

        ArrayList<String> data = new ArrayList<String>(Files.readAllLines(Paths.get(fileName)));

        String wordsAtLine;

        wordsAtLine = data.get(numberOfLine-1);

        return wordsAtLine;
    }


}
