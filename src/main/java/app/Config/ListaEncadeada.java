package app.Config;

public class ListaEncadeada<T> {
    private Nodo <T> inicio;
    public void criaFila(T elemento){
            Nodo<T> celula = new Nodo<T>(elemento);
            this.inicio = celula;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
