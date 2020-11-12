package notes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

    String fileName = "testfile.txt";

    public void writeToFile(String someText) {
        try {
            FileWriter f = new FileWriter(fileName, true);
            f.write(someText);
            f.close();
            System.out.println("Successfully wrote to file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
