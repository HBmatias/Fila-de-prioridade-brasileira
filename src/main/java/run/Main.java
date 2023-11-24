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



        String[] tokens = new String[1000];
        int achou;
        int pos = 0;
        int inicio = 0;


        String [] nome = new String[1000];
        String[] grupos = new String[1000];
        String conhece1 = null;
        String conhece2 = null;

        while (parser.hasNext()) {
            //kkkkkkkkkkkkkkk
            String line = parser.nextLine().replace(",", "");

            //quebra os
            tokens = line.split(" ");
            //Começa a ler o import.txt em grupo
            if(line.startsWith("Grupo:")){

                grupos[inicio] = line;
                inicio++;
            }


            for (int i = 1; i < tokens.length; i++) {
                //Começa a ler o import.txt em  "Existe:"
                if(line.startsWith("Existe:")){
                    // Insere tudo da linha texto que tiver "Existe:" no vetor nome
                    if (tokens[0].equals("Existe:")){

                        nome[pos] = tokens[i];
                        pos++;

                    }
                }
                //
                if (tokens[0].equals("Conhece:")){
                    conhece1 = tokens[1];
                    conhece2= tokens[2];

                }

            }
        }
        int fila = 1;

        for (int x = 0 ;x < nome.length; x++){

            // ignora os null's no vetor grupo
            if (nome[x]== null){
                continue;
            }
            System.out.println();



                //método  que valia se nome existe e returna um inteiro

                 parser.validaSeNomeExiste(grupos, nome[x]);
                // parser.conhecePessoa(grupos,conhece1,conhece2,1);




        }

    }
}
