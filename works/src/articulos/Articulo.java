package articulos;

public class Articulo {

    private String clave;
    private String descripcion;
    private double precio;

    public Articulo(String clave, String descripcion, double precio) {
       this.clave = clave;
       this.descripcion = descripcion;
       this.precio = precio;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClave() {
        return this.clave;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String toString() {
        return "Clave: "+this.clave+", Descripcion: "+this.descripcion+", Precio: "+this.precio;
    }

    public boolean equals(Articulo articulo2) {
        return (this.clave.equals(articulo2.getClave()) && this.descripcion.equals(articulo2.getDescripcion()) && this.precio == articulo2.getPrecio());
    }
}
