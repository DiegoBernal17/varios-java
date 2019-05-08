package arbol;

public class NodoPaginas {

    private int info;
    private NodoPaginas izquierda, derecha;

    public NodoPaginas(int campo) {
        this.info = campo;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int valor) {
        this.info = valor;
    }

    public NodoPaginas getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoPaginas hojaIzquierda) {
        this.izquierda = hojaIzquierda;
    }

    public NodoPaginas getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoPaginas hojaDerecha) {
        this.derecha = hojaDerecha;
    }
}
