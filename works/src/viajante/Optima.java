package viajante;

class Optima {
    private int n;
    private int[] pesoObjs;
    private int[] valorObjs;
    private int cardinalActual;
    private int[] actual;
    private int cardinalOptimo;
    private int[] optimo;
    private int pesoMaximo;
    private int mejorValor;

    // constructor, leer n y los objetos
    public Optima(int[] valores, int[] pesos, int pmaximo, int total) {
        valorObjs = valores;
        pesoObjs = pesos;
        pesoMaximo = pmaximo;
        n = total;
        seleccionOptima();
    }

    public void seleccionOptima() {
        int totalValor = 0;
        actual = new int[n];
        optimo = new int[n];
        mejorValor = 0;
        cardinalActual = 0;
        cardinalOptimo = 0;
        for (int j = 0; j < n; j++)
            totalValor += valorObjs[j];
        seleccionOptima(1, 0, totalValor);
        escribirSeleccion();
    }

    public void escribirSeleccion() {
        System.out.println("El mejor valor es: "+mejorValor);
        System.out.println("El cardinal optimo es: "+cardinalOptimo);
        System.out.println("Lo optimo es: ");
        for(int i=0;  i<optimo.length; i++) {
            System.out.println(optimo[i]);
        }
    }

    private void seleccionOptima(int i, int pt, int va) {
        int valExclusion;
        if (pt + pesoObjs[i - 1] <= pesoMaximo) // objeto i se incluye
        {
            cardinalActual++;
            actual[cardinalActual - 1] = i - 1; // índices del objeto
            if (i < n)
                seleccionOptima(i + 1, pt + pesoObjs[i - 1], va);
            else  // los n objetos probados
                if (va > mejorValor) // nuevo optimo
                {
                    mejorValor = va;
                    System.arraycopy(actual, 0, optimo, 0, cardinalActual);
                    cardinalOptimo = cardinalActual;
                }
            cardinalActual--; //vuelta atrás, ensaya exclusión de objeto i
        }
        /* proceso de exclusión del objeto i para seguir la búsqueda sistemática con el objeto i+1 */
        valExclusion = va - valorObjs[i - 1]; /* decrementa el valor del objeto excluido */
        if (valExclusion > mejorValor)    /* se puede alcanzar una mejor selección, sino poda la búsqueda */
            if (i < n)
                seleccionOptima(i + 1, pt, valExclusion);
            else {
                mejorValor = valExclusion;
                System.arraycopy(actual, 0, optimo, 0, cardinalActual);
                cardinalOptimo = cardinalActual;
            }
    }
}