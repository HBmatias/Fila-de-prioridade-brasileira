package app.Config;

public class ListaEncadeada<T> {
    private Nodo <T> inicio;
    private Nodo <T> ultimo;
    private int tamanho = 0;
    public void criaFila(T elemento){
            Nodo<T> celula = new Nodo<T>(elemento);
            if(this.tamanho == 0){
                this.inicio = celula;
            }else {
                this.ultimo.setProximo(celula);

            }
            this.ultimo = celula;

            this.tamanho++;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
