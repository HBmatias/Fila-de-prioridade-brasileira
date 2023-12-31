package run;

// Import the class Parser from the package app.Config

import app.Config.ControleGuiche;
import app.Config.Guiche;
import app.Config.Parser;

import java.io.File;
import java.util.ArrayList;

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


        String[] tokens = new String[1000];
        int pos = 0;
        int inicio = 0;


        String[] nome = new String[1000];
        String[] grupos = new String[1000];
        String conhece1;
        String conhece2;
        ControleGuiche controle = new ControleGuiche();

        while (parser.hasNext()) {

            String line = parser.nextLine().replace(",", "");

            tokens = line.split(" ");

            if (line.startsWith("Grupo:")) {

                grupos[inicio] = line;
                inicio++;
            }

            for (int i = 1; i < tokens.length; i++) {
                //Começa a ler o import.txt em  "Existe:"
                if (line.startsWith("Existe:")) {
                    // Insere tudo da linha texto que tiver "Existe:" no vetor nome
                    if (tokens[0].equals("Existe:")) {

                        nome[pos] = (String) tokens[i];

                        if (nome[pos] == null) {
                            continue;
                        }
                        System.out.println();

                        if (parser.validaSeNomeExiste(grupos, nome[pos]))
                            System.out.println("[" + nome[pos] + "]" + "Existe");
                        else
                            System.out.println("[" + nome[pos] + "]" + " NÃO EXISTE");
                        pos++;
                    }
                }
            }

            if (line.startsWith("Conhece:")) {
                if (tokens[0].equals("Conhece:")) {
                    conhece1 = tokens[1];
                    conhece2 = tokens[2];
                    System.out.println();
                    if (parser.conhecePessoa(grupos, conhece1, conhece2))
                        System.out.println("[" + conhece1 + "] CONHECE [" + conhece2 + "]");
                    else
                        System.out.println("[" + conhece1 + "] NÃO CONHECE [" + conhece2 + "]");

                }
            }

            if (line.startsWith("criaFila:")) {
                for (int x = 1; x < tokens.length; x++) {
                    controle.adiciona(tokens[x]);
                }
            }

            if (line.startsWith("Chegou:")) {
                for (int v = 1; v< tokens.length; v++){
                    controle.chegou(tokens[v],grupos);

                }
            }
            if(line.startsWith("Desiste:")){
                for (int y = 1; y < tokens.length; y++){
                    controle.desiste(tokens[y]);
                }
            }
            if(line.startsWith("AtendeFila:")){
                for (int j = 1; j < tokens.length; j++){
                    controle.atendeFila(tokens[j]);
                }
            }
        }
            controle.imprimeGuiche();
    }
}

