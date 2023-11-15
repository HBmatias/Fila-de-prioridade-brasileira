package run;
import app.Config.Parser;

import java.io.File;
import java.util.Scanner;

public class Replica {
    public static void main(String args[]) {

        File file = new File("src\\main\\java\\run\\Codes\\import.txt");

        Parser parser = new Parser(file);

        while (parser.hasNext()) {
            String line = parser.nextLine();
            String tokens[] = line.split(" ");
            System.out.println("Linha: "+line);
            for (int i = 0; i < tokens.length; i++) {
                System.out.println("token "+i+" "+tokens[i]);
            }
        }
    }
}
