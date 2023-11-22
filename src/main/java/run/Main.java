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
        Scanner leitor = new Scanner(System.in);

        String [] nome = new String[1000];
        String[] grupos = new String[1000];
        String conhece1 = null;
        String conhece2 = null;

        while (parser.hasNext()) {
            String line = parser.nextLine().replace(",", "");
            tokens = line.split(" ");
            if(line.startsWith("Grupo:")){
                grupos[inicio] = line;
                inicio++;
            }


            for (int i = 1; i < tokens.length; i++) {
                if(line.startsWith("Existe:")){
                if (tokens[0].equals("Existe:")){

                    nome[pos] = tokens[i];
                    pos++;

                }
                }
                if (tokens[0].equals("Conhece:")){
                    conhece1 = tokens[1];
                    conhece2= tokens[2];
                    parser.conhecePessoa(grupos[i].split(" "),conhece1,conhece2,1);

                    }

            }
        }
        int fila = 1;
        for (int i = 0; i < grupos.length; i++) {
            if(grupos[i]== null ){
                continue;
            }
            System.out.println();
            System.out.println("Fila " + fila++ + " " + "[" + grupos[i] + "]");

            for (int x = 0 ;x < nome.length; x++){
                if (nome[x]== null){
                    continue;
                }
                    achou = parser.validaSeNomeExiste(grupos[i].split(" "), 1, nome[x]);

                if (achou == 1) {
                    System.out.println("["+nome[x]+"]" + " EXISTE!"
                    );
                }
                if(achou == -1){
                    System.out.println("["+nome[x]+"]" + "NÃO Existe!"
                    );

                }

            }

        }

    }
}

