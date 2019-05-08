package archivos;

import javax.swing.*;
import java.io.*;

public class ProcesoDeSeleccion {
    public static void main(String[] args) {
        File archivo;
        BufferedWriter bw;
        int cantidadCandidatos, numSeleccionados = 0;
        String candidatos = "", ruta = "Candidatos", ruta2 = "Seleccionados";

        int archivoCandidatos = JOptionPane.showConfirmDialog(null, "¿Quiéres usar el archivo de Candidatos existente o deseas crearlo?\nSI: Usar archivo existe, NO: Crear archivo Candidatos", "¿Usar el archivo existente?", JOptionPane.YES_NO_OPTION);
        if(archivoCandidatos == JOptionPane.NO_OPTION) {
            archivo = new File(ruta);
            cantidadCandidatos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de candidatos a registrar: "));
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
                for (int i=0; i<cantidadCandidatos; i++) {
                    candidatos += JOptionPane.showInputDialog("Nombre: ");
                    candidatos += ',';
                    candidatos += JOptionPane.showInputDialog("Apellido: ");
                    candidatos += ',';
                    candidatos += Double.parseDouble(JOptionPane.showInputDialog("Nota parcial 1: "));
                    candidatos += ',';
                    candidatos += Double.parseDouble(JOptionPane.showInputDialog("Nota parcial 2: "));
                    candidatos += "\r\n";
                }
                bw.write(candidatos);
                bw.close();
            } catch (IOException e ){
                e.printStackTrace();
            }
        }
        try {
            String texto = "", selecionados = "";
            FileReader lector = new FileReader(ruta);
            BufferedReader contenido = new BufferedReader(lector);
            archivo = new File(ruta2);
            String[] datos;
            double promedio;

            while((texto=contenido.readLine())!=null)
            {
                datos = texto.split(",");
                promedio = Double.parseDouble(datos[2]) * Double.parseDouble(datos[3])/2;
                if(promedio > 60) {
                    selecionados += texto+"\r\n";
                    numSeleccionados++;
                }
            }
            contenido.close();
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(selecionados);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Candidatos seleccionados: "+numSeleccionados);
    }
}
