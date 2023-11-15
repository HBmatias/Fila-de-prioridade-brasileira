package run;

// Import the class Parser from the package app.Config

import app.Config.Parser;

import java.io.File;
import java.util.Scanner;

/**
 * This class is responsible for running the project
 * 
 * @author José Iran Barbosa Fernandes Junior - RA: 822163632
 * @author Nathan Ferreira Dos Reis - RA: 822156739
 * @author Victor de Carvalho Araujo - RA: 822133651
 * @author Henrique Brenner Alves Matias - RA: 822160817
 * @author Enzo Silva Araújo - RA: 8222248346
 * @author Guilherme Hais Dias - RA: 821137127
 * @author Matheus Perez Brassarotto - RA: 821129320
 */
public class Main {

    /**
     * This method is responsible for running the project
     * @param args
     */
    public static void main(String[] args) {
        // Set message to show in console that the project is running
        System.out.println("Running project FilaBrasileira!");

        // Get the initial file
        File file = new File("src\\main\\java\\run\\Codes\\import.txt");
        // Create a new instance of the Parser class
        Parser parser = new Parser(file);


        // Call the method to parse the file
        String[] tokens = new String[1000];
        int achou = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa que vc quer saber");
        String nome = leitor.nextLine();

        while (parser.hasNext()) {
            String line = parser.nextLine();
            tokens = line.split(" ");

            System.out.println("Linha: " + line);
            for (int i = 0; i < tokens.length; i++) {
                System.out.println("token " + i + " " + tokens[i]);

                if (tokens[i].equals(nome)) {
                    achou = 2;
                }
            }

        }

        if(achou ==2){
            System.out.println("\n" + nome + " existe");

        }
        else{
            System.out.println("\n" + nome + " não existe");
        }




        System.out.println(tokens[0]);




    }
}
