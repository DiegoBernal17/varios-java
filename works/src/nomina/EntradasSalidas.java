package nomina;

import java.io.*;
import java.util.ArrayList;

public class EntradasSalidas {
    private String nomina18 = "nomina18.txt";
    private String salita = "salita.dat";
    private String nomina = "nomina.lst";

    public String leer() {
        String cadena, datos = "";
        FileReader f = null;
        try {
            f = new FileReader(nomina18);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra");
            System.exit(0);
        }

        BufferedReader b = new BufferedReader(f);
        try {
            while ((cadena = b.readLine()) != null) {
                datos = datos + cadena + "\n";
            }
            b.close();
        } catch(IOException e) {
            System.out.println("Error al leer el archivo: "+nomina18);
            System.exit(0);
        }
        return datos;
    }

    public void guardarNomina(ArrayList<Empleado> empleados) {
        FileWriter archivo;
        PrintWriter pw;
        try {
            archivo = new FileWriter(nomina);
            pw = new PrintWriter(archivo);
            for(int i=0; i<empleados.size(); i++) {
                pw.println(empleados.get(i).listar());
            }
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al guardar la nomina");
        }
    }

    public void guardarEmpleados(ArrayList<Empleado> empleados) {
        ObjectOutputStream archivo;
        try {
            archivo = new ObjectOutputStream(new FileOutputStream(salita));
            for(int i=0; i<empleados.size(); i++) {
                archivo.writeObject(empleados.get(i));
            }
            archivo.close();
        } catch (IOException e) {
            System.out.println("Error al guardar los objetos");
        }
    }
}
