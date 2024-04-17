class No<T> {
    T valor;
    No<T> proximo;

    public No(T valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> fim;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(T valor) {
        No<T> novoNo = new No<>(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public void imprimir() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.valor.toString());
            atual = atual.proximo;
        }
    }
}
