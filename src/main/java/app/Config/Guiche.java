package app.Config;

import java.util.ArrayList;

public class Guiche {
    private ArrayList<String> lista;
    private  String id;

    public Guiche(String id){
        lista = new ArrayList<>();
        this.id = id;
    }
    public void adiciona(String nome){
        lista.add(nome);

    }
    public int tamanho(){
        return lista.size();
    }
    public void imprime(){
        System.out.println("#" + id +" "+lista);
    }

    public ArrayList<String> getLista() {
        return lista;
    }

}
