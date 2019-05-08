package arbol;

import javax.print.attribute.standard.NumberOfDocuments;

public class NodoTerminos {

    private String info;
    private NodoTerminos izquierda, derecha;
    private ArbolPaginas arbolPaginas;

    public NodoTerminos() {
        info = null;
    }

    public NodoTerminos(String campo) {
        this.info = campo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String valor) {
        this.info = valor;
    }

    public NodoTerminos getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoTerminos hojaIzquierda) {
        this.izquierda = hojaIzquierda;
    }

    public NodoTerminos getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoTerminos hojaDerecha) {
        this.derecha = hojaDerecha;
    }

    public ArbolPaginas getArbolPaginas() {
        return arbolPaginas;
    }

    public void setArbolPaginas(ArbolPaginas arbol) {
        this.arbolPaginas = arbol;
    }

    public String toString() {

        return "Campo de información: "+info+", Páginas: ";
    }
}
