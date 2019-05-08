package otro;

import javax.swing.JOptionPane;

public class Tiendas {
    public static void main(String[] args) {
        int tiendas = 5, numTienda=0;
        String nombre;
        double precio, precioMasBajo, promedioPrecios=0;
        String[] nombreTiendas = new String[tiendas];
        double[] precioTiendas = new double[tiendas];


        for(int i=0; i<tiendas; i++) {
            nombre = JOptionPane.showInputDialog("Nombre de la tienda "+(i+1)+":");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de la computadora en esta tienda:"));
            nombreTiendas[i] = nombre;
            precioTiendas[i] = precio;
        }

        precioMasBajo = precioTiendas[0];
        for(int i=0; i<precioTiendas.length; i++) {
            if(precioTiendas[i] < precioMasBajo) {
                precioMasBajo = precioTiendas[i];
                numTienda = i;
            }
            promedioPrecios += precioTiendas[i];
        }
        promedioPrecios = promedioPrecios/numTienda;
        JOptionPane.showMessageDialog(null, "El precio de venta más bajo: $"+precioMasBajo);
        JOptionPane.showMessageDialog(null, "El promedio de precio: $"+promedioPrecios);

    }
}
