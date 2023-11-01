package modelo;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Parser {
        private Scanner leitor;

        public String read(File file) {
            String code = "";

            try {
                leitor = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

            return code;
        }

        public boolean hasNext() {
            return leitor.hasNext();
        }

        public String nextLine() {
            return leitor.nextLine();
        }


}
