package run;

// Import the class Parser from the package app.Config

import app.Config.Parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
     *
     * @param args
     */
    public static void main(String[] args) {
        // Set message to show in console that the project is running
        System.out.println("Running project FilaBrasileira!");

        // Get the initial file
        File file = new File("src\\main\\java\\run\\Codes\\import.txt");
        // Create a new instance of the Parser class
        Parser parser = new Parser(file);


        List tokens = new ArrayList();
        int achou;
        int pos = 0;
        int inicio = 0;


        String[] nome = new String[1000];
        String[] grupos = new String[1000];
        String conhece1 = null;
        String conhece2 = null;

        while (parser.hasNext()) {
            //kkkkkkkkkkkkkkk
            String line = parser.nextLine().replace(",", "");

            //quebra os
            tokens = List.of(line.split(" "));
            //Começa a ler o import.txt em grupo
            if (line.startsWith("Grupo:")) {

                grupos[inicio] = line;
                inicio++;
            }

            for (int i = 1; i < tokens.size(); i++) {
                //Começa a ler o import.txt em  "Existe:"
                if (line.startsWith("Existe:")) {
                    // Insere tudo da linha texto que tiver "Existe:" no vetor nome
                    if (tokens.get(0).equals("Existe:")) {

                        nome[pos] = (String) tokens.get(i);

                        if (nome[pos]== null){
                            continue;
                        }
                        System.out.println();

                        if (parser.validaSeNomeExiste(grupos, nome[pos]))
                            System.out.println("["+nome[pos]+"]" + "Existe");
                        else
                            System.out.println("["+nome[pos]+"]" + " NÃO EXISTE");
                        pos++;
                    }
                }

            }
            if (line.startsWith("Conhece:")) {
                if (tokens.get(0).equals("Conhece:")) {
                    conhece1 = (String) tokens.get(1);
                    conhece2 = tokens.get(2).toString();
                    System.out.println();
                    if (parser.conhecePessoa(grupos, conhece1, conhece2))
                        System.out.println("[" + conhece1 + "] CONHECE [" + conhece2 + "]");
                    else
                        System.out.println("[" + conhece1 + "] NÃO CONHECE [" + conhece2 + "]");

                }
            }
        }

    }
}

