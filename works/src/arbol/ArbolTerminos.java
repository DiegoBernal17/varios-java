package arbol;

import javax.print.attribute.standard.NumberOfDocuments;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArbolTerminos {

    private NodoTerminos raiz;
    private ArbolPaginas arbolPaginas;

    public void agregar(String campo, int[] paginas) {
        NodoTerminos termino = new NodoTerminos(campo);
        this.agregarTermino(termino);
        arbolPaginas = new ArbolPaginas(termino);
        for (int i = 0; i < paginas.length; i++) {
            arbolPaginas.agregar(paginas[i]);
        }
        termino.setArbolPaginas(arbolPaginas);
    }

    private void agregarTermino(NodoTerminos nodo, NodoTerminos raiz) {
        if(raiz == null) {
            this.setRaiz(nodo);
        } else if(this.nodoMenorQueRaiz(nodo, raiz)) {
            if(raiz.getIzquierda() == null) {
                raiz.setIzquierda(nodo);
            } else {
                agregarTermino(nodo, raiz.getIzquierda());
            }
        } else {
            if (raiz.getDerecha() == null) {
                raiz.setDerecha(nodo);
            }
            else {
                agregarTermino(nodo, raiz.getDerecha());
            }
        }
    }

    public void agregarTermino( NodoTerminos nodo ) {
        this.agregarTermino(nodo, this.raiz);
    }

    public void setRaiz(NodoTerminos nodo) {
        this.raiz = nodo;
    }

    public NodoTerminos getRaiz() {
        return this.raiz;
    }

    public boolean nodoMenorQueRaiz(NodoTerminos nodo, NodoTerminos raiz) {
        List nombres = new LinkedList<>();
        nombres.add(nodo.getInfo());
        nombres.add(raiz.getInfo());
        Collections.sort(nombres);
        return (nombres.get(0).equals(raiz.getInfo()));
    }

    public String toString() {
        String terminos = "";
        if(raiz != null) {
            NodoTerminos nodoPrimero = raiz;
            while (nodoPrimero.getIzquierda() != null) {
                nodoPrimero = nodoPrimero.getIzquierda();
            }
            do {
                terminos += nodoPrimero.getInfo();
                if (nodoPrimero.getArbolPaginas() != null) {
                    terminos += "{" + nodoPrimero.getArbolPaginas().toString() + "}";
                }
                terminos += "\n";
                nodoPrimero = nodoPrimero.getDerecha();
            } while (nodoPrimero != null);
        }
        return terminos;
    }
}
