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
    private String[] nomeJaExiste = new String[100];
    int pos= 0;


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
//    public void conhecePessoa(String grupo[],String nome1,String nome2,int inicio){
//        if (inicio < grupo.length ) {
//            if (validaSeNomeExiste(grupo, inicio, nome1) == 1) {
//                if (validaSeNomeExiste(grupo, inicio, nome2) == 1) {
//                    System.out.println("[" + nome1 + "] CONHECE [" + nome2 + "]");
//                }
//            }
//            else{
//                System.out.println("[" + nome1 + "] NÃO CONHECE [" + nome2 + "]");
//
//            }
//
//
//        }
//
//    }

        String[] tokens = new String[100];
    public void validaSeNomeExiste(String grupo[], String nome) {

        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i] == null) {
                continue;
            }

            tokens = grupo[i].split(" ");



        for (int inicio = 0; inicio < tokens.length; inicio++) {
            if (tokens[inicio] == null) {
                continue;
            }

            if (nome.trim().equalsIgnoreCase(tokens[inicio].trim())) {
                System.out.println("existe" + nome);


            }

        }
        }
        System.out.println("NÃO" + nome);


    }


}




