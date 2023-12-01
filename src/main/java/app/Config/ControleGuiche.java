package app.Config;

import java.util.ArrayList;

public class ControleGuiche {
    private ArrayList<Guiche> controle;

    public ControleGuiche(){
        this.controle = new ArrayList<>();
    }
    public void adiciona(String id){
        this.controle.add(new Guiche(id));
    }

    public Guiche menorGuiche (){
        Guiche resultado = null;

        for(Guiche guiche: controle){
            if(resultado == null){
                resultado = guiche;
            }
            else {
                if (guiche.tamanho()< resultado.tamanho()){
                    resultado = guiche;

                }

            }
        }
        return resultado;
    }
    public void imprimeGuiche(){
        for (Guiche nome:controle){
            nome.imprime();
        }
    }
}
