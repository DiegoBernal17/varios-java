package arbol;

public class ArbolPaginas {
    private NodoPaginas raiz;
    private NodoTerminos padre;

    public ArbolPaginas(NodoTerminos padre) {
        this.padre = padre;
    }

    public void agregar(int nuevaPagina) {
        NodoPaginas pagina = new NodoPaginas(nuevaPagina);
        this.agregarPagina(pagina);
    }

    private void agregarPagina(NodoPaginas nodo, NodoPaginas raiz) {
        if(raiz == null) {
            this.setRaiz(nodo);
        } else if(nodo.getInfo() < raiz.getInfo()) {
            if(raiz.getIzquierda() == null) {
                raiz.setIzquierda(nodo);
            } else {
                agregarPagina(nodo, raiz.getIzquierda());
            }
        } else {
            if (raiz.getDerecha() == null) {
                raiz.setDerecha(nodo);
            }
            else {
                agregarPagina(nodo, raiz.getDerecha());
            }
        }
    }

    public void agregarPagina( NodoPaginas nodo ) {
        this.agregarPagina(nodo, this.raiz);
    }

    public void setRaiz(NodoPaginas nodo) {
        this.raiz = nodo;
    }

    public NodoPaginas getRaiz() {
        return this.raiz;
    }

    public String toString() {
        String paginas = "";
        if(raiz != null) {
            NodoPaginas nodoPrimero = raiz;
            while (nodoPrimero.getIzquierda() != null) {
                nodoPrimero = nodoPrimero.getIzquierda();
            }
            while (true) {
                if (nodoPrimero.getDerecha() == null) {
                    paginas += nodoPrimero.getInfo();
                    break;
                } else
                    paginas += nodoPrimero.getInfo() + ", ";
                nodoPrimero = nodoPrimero.getDerecha();
            }
        }
        return paginas;
    }
}
