package nomina;

import java.io.Serializable;

public class Empleado implements Serializable {
    private int numDepto;
    private String nomDepto;
    private int numEmpl;
    private String nombre;
    private String nomPuesto;
    private double sueldo;
    private double premPun;
    private double total;

    public Empleado(int numDepto, String nomDepto, int numEmpl, String nombre, String nomPuesto, double sueldo, double premPun) {
        this.numDepto = numDepto;
        this.nomDepto = nomDepto;
        this.numEmpl = numEmpl;
        this.nombre = nombre;
        this.nomPuesto = nomPuesto;
        this.sueldo = sueldo;
        this.premPun = premPun;
        sacarTotal();
    }

    public void sacarTotal() {
        this.total = sueldo + premPun;
    }

    public String listar() {
        return numEmpl+"\n"+nombre+"\n"+sueldo+"\n"+premPun+"\n"+total;
    }


    public String toString() {
        return "numDepto: "+numDepto+"\nnomDepto: "+nomDepto+"\nnumEmpl: "+numEmpl+
                "\nnombre: "+nombre+"\nnomPuesto: "+nomPuesto+"\nsueldo: "+sueldo+
                "\npremPun: "+premPun+"\ntotal: "+total;
    }
}
