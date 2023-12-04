package app.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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

    public Parser(){
    }
    public boolean hasNext() {
        return leitor.hasNext();
    }
    public String nextLine() {
        return leitor.nextLine();
    }
    public Boolean conhecePessoa(String grupo[],String nome1,String nome2){

        for (int i = 0; i < grupo.length; i++) {

            if (grupo[i] == null) {
                continue;
            }

            String[] tokens = new String[100];

            tokens = grupo[i].split(" ");
            if(nome1.equals(nome2)){
                continue;
            }

            for (int inicio = 0; inicio < tokens.length; inicio++){
                if (tokens[inicio] == null) {
                    continue;
                }

                if (tokens[inicio].equals(nome1)) {

                    for (int x = 0; x < tokens.length; x++) {
                        if (tokens[x].equals(nome2)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean validaSeNomeExiste(String grupo[], String nome) {

        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i] == null) {
                continue;
            }
        String[] tokens = new String[1000];

            tokens = grupo[i].split(" ");

            for (int inicio = 0; inicio < tokens.length; inicio++) {
                if (tokens[inicio] == null) {
                    continue;
                }
                if (nome.trim().equalsIgnoreCase(tokens[inicio])) {
                        return true;
                }
            }
        }
        return false;
    }
}




