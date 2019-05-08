package presidentes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PresidentesMexico {
    private ArrayList<Presidente> presidentes;

    public static void main(String[] args) {
        int opcion;
        String fecha, presidente;
        PresidentesMexico pm = new PresidentesMexico();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1) Buscar presidente por feha\n2) Salir"));
            if(opcion == 1) {
                fecha = JOptionPane.showInputDialog("Ingresa la fecha:");
                presidente = pm.buscarPresidente(fecha);
                if(presidente.equals("")) {
                    JOptionPane.showMessageDialog(null,"No hay presidente en esa fecha");
                } else {
                    JOptionPane.showMessageDialog(null, presidente);
                }
            }
        } while(opcion != 2);
    }

    public String buscarPresidente(String fecha) {
        for(int i=0; i<presidentes.size(); i++) {
            if(presidentes.get(i).buscarFecha(fecha))
                return presidentes.get(i).toString();
        }
        return "";
    }

    public PresidentesMexico() {
        presidentes = new ArrayList<>();
        presidentes.add(new Presidente("Guadalupe Victoria", "10-octubre-1824", "31-marzo-1829"));
        presidentes.add(new Presidente("Vicente Guerrero", "1-abril-1829", "17-diciembre-1829"));
        presidentes.add(new Presidente("José María Bocanegra", "17-12-1829", "23-12-1829"));
        presidentes.add(new Presidente("Pedro Vélez", "23-12-1829", "31-12-1829"));
        presidentes.add(new Presidente("Anastasio Bustamante", "1-enero-1830", "13-agosto-1832"));
        presidentes.add(new Presidente("Melchor Múzquiz", "14-agosto-1832", "24-diciembre-1832"));
        presidentes.add(new Presidente("Manuel Gómez Pedraza", "24-diciembre-1832", "31-marzo-1833"));
        presidentes.add(new Presidente("Valentín Gómez Farías", "1-abril-1833", "16-mayo-1833"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "16-mayo-1833", "3-junio-1833"));
        presidentes.add(new Presidente("Valentín Gómez Farías", "3-junio-1833", "18-junio-1833"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "18-junio-1833", "5-julio-1833"));
        presidentes.add(new Presidente("Valentín Gómez Farías", "5-julio-1833", "27-octubre-1833"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "27-octubre-1833", "15-diciembre-1833"));
        presidentes.add(new Presidente("Valentín Gómez Farías", "16-diciembre-1833", "24-abril-1834"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "24-abril-1834", "27-enero-1835"));
        presidentes.add(new Presidente("Migue Barragán", "28-enero-1835", "27-febrero-1836"));
        presidentes.add(new Presidente("José Justo Corro", "27-febrero-1836", "19-abril-1837"));
        presidentes.add(new Presidente("Anastasio Bustamante", "19-abril-1837", "18-marzo-1839"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "23-marzo-1839", "10-julio-1839"));
        presidentes.add(new Presidente("Nicolás Bravo", "10-julio-1839", "19-julio-1839"));
        presidentes.add(new Presidente("Anastasio Bustamante", "18-julio-1839", "22-septiembre-184"));
        presidentes.add(new Presidente("Francisco Javier Echeverría", "22-septiembre-1841", "10-octubre-1841"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "10-octubre-1841", "26-octubre-1842"));
        presidentes.add(new Presidente("Nicolás Bravo Rueda", "26-octubre-1842", "4-marzo-1843"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "4-marzo-1843", "4-octubre-1843"));
        presidentes.add(new Presidente("Valentín Canalizo", "4-octubre-1843", "4-junio-1844"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "4-junio-1844", "12-septiembre-1844"));
        presidentes.add(new Presidente("José Joaquín de Herrera", "12-septiembre-1844", "21-septiembre-1844"));
        presidentes.add(new Presidente("Valentín Canalizo", "21-septiembre-1844", "6-diciembre-1844"));
        presidentes.add(new Presidente("José Joaquín de Herrera", "6-diciembre-1844", "30-diciembre-1845"));
        presidentes.add(new Presidente("Gabriel Valencia", "30-diciembre-1845", "2-enero-1846"));
        presidentes.add(new Presidente("Mariano Paredes Arillaga", "2-enero-1846", "28-julio-1846"));
        presidentes.add(new Presidente("Nicolás Bravo", "28-julio-1846", "4-agosto-1846"));
        presidentes.add(new Presidente("José Mariano Salas", "6-agosto-1846", "23-diciembre-1846"));
        presidentes.add(new Presidente("Valentín Gómez Farías", "23-diciembre-1846", "21-marzo-1847"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "21-marzo-1847", "2-abril-1847"));
        presidentes.add(new Presidente("Pedro María Anaya", "2-abril-1847", "20-mayo-1847"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "20-mayo-1847", "16-septiembre-1847"));
        presidentes.add(new Presidente("Manuel de la Peña y Peña", "16-septiembre-1847", "11-noviembre-1847"));
        presidentes.add(new Presidente("Pedro María Anaya", "13-noviembre-1847", "8-enero-1848"));
        presidentes.add(new Presidente("Manuel de la Peña y Peañ", "8-enero-1848", "2-junio-1848"));
        presidentes.add(new Presidente("José Joaquín de Herrera", "3-junio-1848", "15-enero-1851"));
        presidentes.add(new Presidente("Mariano Arista", "15-enero-1851", "5-enero-1853"));
        presidentes.add(new Presidente("Juan Bautista Ceballos", "6-enero-1853", "7-febrero-1853"));
        presidentes.add(new Presidente("Manuel María Lombardini", "7-febrero-1853", "20-abril-1853"));
        presidentes.add(new Presidente("Antonio López de Santa Anna", "20-abril-1853", "12-agosto-1855"));
        presidentes.add(new Presidente("Martín Carrera", "15-agosto-1855", "12-septiembre-1855"));
        presidentes.add(new Presidente("Rómulo Díaz de la Vega", "12-septiembre-1855", "3-octubre-1855"));
        presidentes.add(new Presidente("Juan Álvarez Benítez", "4-octubre-1855", "11-diciembre-1855"));
        presidentes.add(new Presidente("Ignacio Comonfort", "11-diciembre-1855", "17-diciembre-1857"));
        presidentes.add(new Presidente("Benito Juárez García", "18-diciembre-1857", "18-julio-1872"));
        presidentes.add(new Presidente("Sebastián Lerdo de Tejada", "18-julio-1872", "20-noviembre-1876"));
        presidentes.add(new Presidente("Porfirio Díaz", "28-noviembre-1876", "6-diciembre-1876"));
        presidentes.add(new Presidente("Juan Nepomuceno Méndez", "6-diciembre-1876", "16-febrero-1877"));
        presidentes.add(new Presidente("Porfirio Díaz", "17-febrero-1877", "30-noviembre-1880"));
        presidentes.add(new Presidente("Manuel del Refugio González Flores", "1-diciembre-1880", "30-noviembre-1884"));
        presidentes.add(new Presidente("Porfirio Díaz", "1-diciembre-1884", "25-mayo-1911"));
        presidentes.add(new Presidente("Francisco León de la Barra", "25-mayo-1911", "6-noviembre-1911"));
        presidentes.add(new Presidente("Francisco I. Madero", "6-noviembre-1911", "19-febrero-1913"));
        presidentes.add(new Presidente("Pedro Lascuráin Paredes", "19-febrero-1913", "19-febrero-1913"));
        presidentes.add(new Presidente("Victoriano Huerta Ortega", "19-febrero-1913", "15-julio-1914"));
        presidentes.add(new Presidente("Fransico S. Carvajal", "15-julio-1914", "13-agosto-1914"));
        presidentes.add(new Presidente("Eulalio Guitiérrez", "6-noviembre-1914", "15-enero-1915"));
        presidentes.add(new Presidente("Roque González Garza", "15-enero-1915", "10-junio-1915"));
        presidentes.add(new Presidente("Fransico Logos Cházaro", "10-junio-1915", "10-octubre-1915"));
        presidentes.add(new Presidente("Venustiano Carranza", "1-mayo-1917", "21-mayo-1920"));
        presidentes.add(new Presidente("Adolfo de la Huerta", "1-junio-1920", "30-noviembre-1920"));
        presidentes.add(new Presidente("Álvaro Obregón", "1-diciembre-1920", "30-noviembre-1924"));
        presidentes.add(new Presidente("Plutarco Elías Calles", "1-diciembre-1924", "30-noviembre-1928"));
        presidentes.add(new Presidente("Emilio Portes Gil", "1-diciembre-1928", "5-febrero-1930"));
        presidentes.add(new Presidente("Pascual Ortiz Rubio", "5-febrero-1930", "2-septiembre-1932"));
        presidentes.add(new Presidente("Abelardo L. Rodríguez", "2-septiembre-1932", "30-noviembre-1934"));
        presidentes.add(new Presidente("Lázaro Cárdenas del Río", "1-diciembre-1934", "30-noviembre-1940"));
        presidentes.add(new Presidente("Manuel Ávila Camacho", "1-diciembre-1940", "30-noviembre-1946"));
        presidentes.add(new Presidente("Miguel Alemán Valdés", "1-diciembre-1946", "30-noviembre-1952"));
        presidentes.add(new Presidente("Adolfo Tomás Ruiz Cortines", "1-diciembre-1952", "30-noviembre-1958"));
        presidentes.add(new Presidente("Adolfo López Mateos", "1-diciembre-1958", "30-noviembre-1964"));
        presidentes.add(new Presidente("Gustavo Días Ordaz", "1-diciembre-1964", "30-noviembre-1970"));
        presidentes.add(new Presidente("Luis Echeverría Álvarez", "1-diciembre-1970", "30-noviembre-1976"));
        presidentes.add(new Presidente("Jośe López Portillo y Pacheco", "1-diciembre-1976", "30-noviembre-1982"));
        presidentes.add(new Presidente("Miguel de la Madrid Hurtado", "1-diciembre-1982", "30-noviembre-1988"));
        presidentes.add(new Presidente("Carlos Salinas de Gortari", "1-diciembre-1988", "30-noviembre-1994"));
        presidentes.add(new Presidente("Ernesto Zedillo POnce de León", "1-diciembre-1994", "30-noviembre-2000"));
        presidentes.add(new Presidente("Vicente Fox Quesada", "1-diciembre-2000", "30-noviembre-2006"));
        presidentes.add(new Presidente("Felipe Calderón Hinojosa", "1-diciembre-2006", "30-noviembre-2012"));
        presidentes.add(new Presidente("Enrique Peña Nieto", "1-diciembre-2012", "1-diciembre-2018"));
    }
}
