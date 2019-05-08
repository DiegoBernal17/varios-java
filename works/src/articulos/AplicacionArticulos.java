package articulos;

import javax.swing.JOptionPane;

public class AplicacionArticulos {

    public static void main(String[] args) {
        Articulo[] articulos;
        int numArticulos;
        int continuar;
        String clave, descripcion, listado="";
        double precio;

        numArticulos = Integer.parseInt(JOptionPane.showInputDialog("Máximo de artículos: "));
        articulos = new Articulo[numArticulos];

        for(int i=0; i<numArticulos; i++) {
            clave = JOptionPane.showInputDialog("Clave artículo ("+(i+1)+"):");
            descripcion = JOptionPane.showInputDialog("Descripcion: ");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));

            articulos[i] = new Articulo(clave, descripcion, precio);

            if(i+1 < numArticulos) {
                continuar = JOptionPane.showConfirmDialog(null, "¿Deseas usar otro corredor?", "¿Continuar?", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION)
                    break;
            }
        }
        for(int i=0; i<articulos.length; i++) {
            if(articulos[i] != null)
                listado += articulos[i].toString()+"\n";
        }
        JOptionPane.showMessageDialog(null, listado);
        AplicacionArticulos metodos = new AplicacionArticulos();
        JOptionPane.showMessageDialog(null,"Total a pagar: "+ metodos.totalAPagar(articulos));
        String bClave = JOptionPane.showInputDialog("Dame la clave del articulo buscar: ");
        String bDesc = JOptionPane.showInputDialog("Dame la descripcion del articulo buscar: ");
        double bPrecio = Double.parseDouble(JOptionPane.showInputDialog("Dame el precio del articulo buscar: "));
        Articulo buscar = new Articulo(bClave, bDesc, bPrecio);
        JOptionPane.showMessageDialog(null, metodos.buscarArticulo(buscar, articulos));
        JOptionPane.showMessageDialog(null, metodos.generarTicket(articulos));
    }

    public boolean buscarArticulo(Articulo articulo, Articulo[] articulos) {
        boolean encontrado = false;
        for(int i=0; i<articulos.length; i++) {
            if(articulos[i] != null && articulo.equals(articulos[i])) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public double totalAPagar(Articulo[] articulos) {
        double total = 0;
        for(int i=0; i<articulos.length; i++) {
            if(articulos[i] != null)
                total += articulos[i].getPrecio();
        }
        return total;
    }

    public String generarTicket(Articulo[] articulos) {
        String mensaje = "";
        for(int i=0; i<articulos.length; i++ ) {
            if(articulos[i] != null)
                mensaje += articulos[i].getClave()+" "+articulos[i].getDescripcion()+" $"+articulos[i].getPrecio()+"\n";
        }
        return "  Super Mercado  \n"+mensaje;
    }
}
