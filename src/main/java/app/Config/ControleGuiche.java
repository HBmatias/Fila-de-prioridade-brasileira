package app.Config;

import java.util.ArrayList;

public class ControleGuiche{
    private ArrayList<Guiche> controle;

    public ControleGuiche(){
        this.controle = new ArrayList<>();
    }
    public void adiciona(String id){
        this.controle.add(new Guiche(id));
    }

//    public Guiche menorGuiche (){
//        Guiche resultado = null;
//
//        for(Guiche guiche: controle){
//            if(resultado == null){
//                resultado = guiche;
//            }
//            else {
//                if (guiche.tamanho()< resultado.tamanho()){
//                    resultado = guiche;
//
//                }
//            }
//        }
//        return resultado;
//    }
//    public int furaFila(String[] grupos, String nome){
//        Parser parser = new Parser();
//        for (int i = 0; i < grupos.length; i++) {
//            if (grupos[i] == null) {
//                continue;
//            }
//
//            for (int x = 0; x<controle.size(); x++) {
//                 Guiche guiche =  controle.get(x);
//                for (int a = 0; a<guiche.getLista().size();a++){
//                    if (parser.conhecePessoa(grupos, nome, guiche.getLista().get(a))) {
//                    //    guiche.getLista().add(a+1,nome);
//                        System.out.println(nome +" " + a);
//                        return a+1;
//                    }
//                }
//            }
//
//        }
//        return -1;
//    }
    public void atendeFila(String pessoaAtendida){
        for (int x = 0; x<controle.size(); x++) {
            Guiche guiche =  controle.get(x);
            for (int v = 0;v< guiche.tamanho(); v++) {
                if (pessoaAtendida.equalsIgnoreCase(guiche.getId())){
                    guiche.remove(0);
                    return;
                }
            }

        }

    }
    public void desiste(String nome){
        for (int x = 0; x<controle.size(); x++) {
            Guiche guiche =  controle.get(x);
            for (int a = 0; a<guiche.getLista().size();a++){
                if (nome.equalsIgnoreCase(guiche.getLista().get(a))){
                    guiche.getLista().remove(a);

                }
            }
        }

    }
    public void chegou(String nome, String[] grupos ){
        Guiche menorfila = null;


        //menorfila
        for(Guiche guiche: controle){
            if(menorfila == null){
                menorfila= guiche;
            }
            else {
                if (guiche.tamanho()< menorfila.tamanho()){
                    menorfila = guiche;

                }
            }
        }if(menorfila == null){
            return;
        }


        //furaFila
        Parser parser = new Parser();
//        for (int y = 0; y < grupos.length; y++) {
//            if (grupos[y] == null) {
//                return;
//            }
//        }
        int melhorPosicao = 0;
        Guiche melhorGuiche = null;
        for (int x = 0; x<controle.size(); x++) {
            Guiche guiche =  controle.get(x);
            for (int a = 0; a<guiche.getLista().size();a++){
                if (parser.conhecePessoa(grupos, nome, guiche.getLista().get(a))) {
                    melhorPosicao = a+1;
                    melhorGuiche = guiche;

                    // System.out.println(nome +" " + a);

                }

            }
        }

        if(melhorGuiche != null && menorfila.tamanho() > melhorPosicao ){
            melhorGuiche.getLista().add(melhorPosicao,nome);

        }else {
            menorfila.adiciona(nome);
        }
    }
    public void imprimeGuiche(){
        for (Guiche nome:controle){
            nome.imprime();
        }
    }
}
