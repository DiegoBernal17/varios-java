package archivos;

import java.io.Serializable;

public class Candidato implements Serializable {

    private String nombre;
    private String apellido;
    private double notaParcial1;
    private double notaParcial2;

    public Candidato(String nombre, String apellido, double notaParcial1, double notaParcial2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNotaParcial1(double notaParcial1) {
        this.notaParcial1 = notaParcial1;
    }

    public void setNotaParcial2(double notaParcial2) {
        this.notaParcial2 = notaParcial2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getNotaParcial1() {
        return notaParcial1;
    }

    public double getNotaParcial2() {
        return notaParcial2;
    }

    public String toString() {
        return this.nombre + "," + this.apellido + "," + this.notaParcial1 + "," + this.notaParcial2;
    }
}
