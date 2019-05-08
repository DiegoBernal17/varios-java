package nomina;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntradasSalidas ES = new EntradasSalidas();
        String datosEntrada = ES.leer();
        String[] datos = datosEntrada.split("\n");
        ArrayList<Empleado> empleados = new ArrayList<>();
        int numDepto, numEmpl, dato=0;
        String nomDepto, nombre, nomPuesto;
        double sueldo, premPun;
        Empleado empleado;
        while(dato < datos.length) {
            try {
                numDepto = Integer.parseInt(datos[dato]);
                nomDepto = datos[dato + 1];
                numEmpl = Integer.parseInt(datos[dato + 2]);
                nombre = datos[dato + 3];
                nomPuesto = datos[dato + 4];
                sueldo = Double.parseDouble(datos[dato + 5]);
                premPun = Double.parseDouble(datos[dato + 6]);
                empleado = new Empleado(numDepto, nomDepto, numEmpl, nombre, nomPuesto, sueldo, premPun);
                empleados.add(empleado);
                dato += 8;
            } catch (NumberFormatException e) {
                dato = dato + 1;
            }
        }
        ES.guardarEmpleados(empleados);
        ES.guardarNomina(empleados);
    }
}
