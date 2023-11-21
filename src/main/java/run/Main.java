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



        String[] tokens = new String[40];
        int pos = 0;
        int inicio = 0;
        Scanner leitor = new Scanner(System.in);
       // System.out.println("Digite o nome da pessoa que vc quer saber");
        String [] nome = new String[1000];
        String[] grupos = new String[1000];

        while (parser.hasNext()) {
            String line = parser.nextLine().replace(",", "");
            tokens = line.split(" ");
            if(line.startsWith("Grupo:")){
                grupos[inicio] = line;
                inicio++;
            }

            System.out.println("Linha: " + line);

            for (int i = 0; i < tokens.length; i++) {

                if (tokens[0].equals("Existe:") ) {
                    nome[pos] = tokens[i];
                    pos++;

                }
//                else {
//                    grupos[inicio] = tokens[i];
//                    inicio++;
//
//                }

            }
        }
            for (int i = 0; i < grupos.length; i++) {
                    if(grupos[i]== null ){
                        continue;
                    }
                System.out.println("token " + i + " " + grupos[i]);
                for (int x =0 ;x < nome.length; x++){
                    if (nome[x]== null){
                        continue;
                    }
                    System.out.println(nome[x]+ " " +
                            parser.validaSeNomeExiste(grupos[i].split(" "), 1, nome[x]));

                }



//                    System.out.println("funcionou");
//                    i++;
//                    if (tokens[i].equals("Ana")) {
//                        achou = 2;
//                        parser.nome(tokens[i]);
//                    }

            }


    }

//        if(achou ==2){
//            System.out.println("\n" + nome + " existe");
//
//        }
//        else{
//            System.out.println("\n" + nome + " não existe");
//        }




}

