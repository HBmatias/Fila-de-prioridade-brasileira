package app.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;

public class Parser {
    /**
     * This method is responsible for reading the file and parsing it
     * 
     * @param file - The file to be read
     * @return Scanner
     */
    public Scanner read(File file) {
        // Scanned file
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            // Print in console the file content
            while (this.hasNext(scanner)) {
                System.out.println(this.nextLine(scanner));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        return scanner;
    }

    public boolean hasNext(Scanner scanner) {
        return scanner.hasNext();
    }

    public String nextLine(Scanner scanner) {
        return scanner.nextLine();
    }





}
