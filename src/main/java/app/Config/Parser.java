package app.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    /**
     * This method is responsible for reading the file and parsing it
     *
     * @param file - The file to be read
     * @return Scanner
     */
    private Scanner leitor;


    public Parser(File file) {
        try {
            leitor = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public Parser(String input) {
        leitor = new Scanner(input);
    }

    public boolean hasNext() {
        return leitor.hasNext();
    }

    public String nextLine() {
        return leitor.nextLine();
    }


    public String validaSeNomeExiste(String tokens[], int inicio, String nome){
        if (inicio < tokens.length){
            if (nome.trim().equalsIgnoreCase(tokens[inicio].trim())){
                return "15";
            }
            else {
                return validaSeNomeExiste(tokens,inicio+1,nome);

            }
        }
            return "0";

    }

}





