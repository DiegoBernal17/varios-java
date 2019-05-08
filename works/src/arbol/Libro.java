package arbol;

import javax.swing.JOptionPane;

public class Libro {
    public static void main(String[] args) {
       int opcion, numPaginas;
       String terminoPrincipal;
       int[] paginas;
       ArbolTerminos arbolTerminos;

       arbolTerminos = new ArbolTerminos();
       do {
           opcion = Integer.parseInt(JOptionPane.showInputDialog("1) Capturar \n2) Imprimir\n3)Terminar "));
           if(opcion == 1) {
               terminoPrincipal = JOptionPane.showInputDialog("Dame el termino principal a agregar:");
               numPaginas = Integer.parseInt(JOptionPane.showInputDialog("Número de páginas en que aparece el termino principal"));
               paginas = new int[numPaginas];
               for (int i=0; i<numPaginas; i++) {
                   paginas[i] = Integer.parseInt(JOptionPane.showInputDialog("Número de página donde se encuentra ("+(i+1)+"/ "+numPaginas+")"));
               }
               arbolTerminos.agregar(terminoPrincipal, paginas);
           } else if(opcion == 2) {
               System.out.println("Imprimir.");
                System.out.println(arbolTerminos.toString());
           }
       } while(opcion != 3);
    }
}
