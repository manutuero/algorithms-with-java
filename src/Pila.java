public class Pila {

    // Una pila de int (por ahora)
    private class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo raiz;

    // Constructor
    public Pila() {
        raiz = null;
    }

    // Metodos
    public void insertar(int valor) {
        Nodo nodo = new Nodo();
        nodo.info = valor;
        nodo.sig = raiz;
        raiz = nodo;
    }

    public int extraer() {
        if (raiz == null) {
            return -1;
        } else {
            Nodo nodo = new Nodo();
            nodo.info = raiz.info;
            raiz = raiz.sig;
            return nodo.info;
        }
    }
}
