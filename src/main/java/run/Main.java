package run;

// Import the class Parser from the package app.Config
import app.Config.Parser;

// Import the class File from the package java.io
import java.io.File;

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

        // Create a new instance of the Parser class
        Parser parser = new Parser();

        // Get the initial file
        File file = new File("src\\main\\java\\run\\Codes\\import.txt");

        // Call the method to parse the file
        parser.read(file);
    }
}