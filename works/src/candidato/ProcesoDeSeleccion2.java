package archivos;

import javax.swing.*;
import java.io.*;

public class ProcesoDeSeleccion2 {
    public static void main(String[] args) {
        int cantidadCandidatos, numSeleccionados = 0;
        String ruta = "Candidatos2", ruta2 = "Seleccionados2";
        Candidato[] candidatos;
        String nombre, apellido;
        double nota1, nota2;
        ObjectOutputStream oos;
        ObjectInputStream ois;

        int archivoCandidatos = JOptionPane.showConfirmDialog(null, "¿Quiéres usar el archivo de Candidatos existente o deseas crearlo?\nSI: Usar archivo existe, NO: Crear archivo Candidatos", "¿Usar el archivo existente?", JOptionPane.YES_NO_OPTION);
        if(archivoCandidatos == JOptionPane.NO_OPTION) {
            cantidadCandidatos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de candidatos a registrar: "));
            candidatos = new Candidato[cantidadCandidatos];
            try {
                oos = new ObjectOutputStream(new FileOutputStream(ruta));
                for (int i=0; i<cantidadCandidatos; i++) {
                    nombre = JOptionPane.showInputDialog("Nombre: ");
                    apellido = JOptionPane.showInputDialog("Apellido: ");
                    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota parcial 1: "));
                    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota parcial 2: "));
                    candidatos[i] = new Candidato(nombre, apellido, nota1, nota2);
                    oos.writeObject(candidatos[i]);
                }
                oos.close();
            } catch (IOException e ){
                e.printStackTrace();
            }
        }
        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));
            double promedio;
            Object candi;
            candi = ois.readObject();
            oos = new ObjectOutputStream(new FileOutputStream(ruta2));
            while(candi != null)
            {
                if (candi instanceof Candidato) {
                    promedio = (((Candidato) candi).getNotaParcial1() + ((Candidato) candi).getNotaParcial2()) / 2;
                    if (promedio > 60) {
                        oos.writeObject(candi);
                        numSeleccionados++;
                    }
                }
                try {
                    candi = ois.readObject();
                }  catch (EOFException e) { break; }
            }
            ois.close();
            oos.close();
            /* // LEER ARCHIVO DE OBJETO 'SELECCIONADOS's
            ois = new ObjectInputStream(new FileInputStream(ruta2));
            candi = ois.readObject();
            while(true)
            {
                if (candi instanceof Candidato) {
                        System.out.println(candi);
                }
                try {
                    candi = ois.readObject();
                }  catch (EOFException e) { break; }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Candidatos seleccionados: "+numSeleccionados);
    }
}
