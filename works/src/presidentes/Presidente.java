package presidentes;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.Date;

public class Presidente {
    private String nombre;
    private int fechaInicio_dia;
    private int fechaInicio_mes;
    private int fechaInicio_anio;
    private int fechaFinal_dia;
    private int fechaFinal_mes;
    private int fechaFinal_anio;

    public Presidente(String nombre, String fechaInicio, String fechaFinal) {
        this.nombre = nombre;

        sacarFecha(fechaInicio, "inicio");
        sacarFecha(fechaFinal, "final");
    }

    private void sacarFecha(String fecha, String inicioFinal) {
        String[] date;
        date = fecha.split("-");
        if(date.length == 1) {
            date = fecha.split("/");
            if(date.length == 1) {
                System.out.println("Formato incorrecto de la fecha."+nombre);
                return;
            }
        }

        if(inicioFinal.equals("inicio")) {
            fechaInicio_dia = Integer.parseInt(date[0]);
            fechaInicio_mes = sacarMes(date[1]);
            fechaInicio_anio = Integer.parseInt(date[2]);
        } else if (inicioFinal.equals("final")) {
            fechaFinal_dia = Integer.parseInt(date[0]);
            fechaFinal_mes = sacarMes(date[1]);
            fechaFinal_anio = Integer.parseInt(date[2]);
        }
    }

    private int sacarMes(String mes) {
        try {
            return Integer.parseInt(mes);
        } catch(NumberFormatException e) {
            switch (mes) {
                case "enero": return 1;
                case "febrero": return 2;
                case "marzo": return 3;
                case "abril": return 4;
                case "mayo": return 5;
                case "junio": return 6;
                case "julio": return 7;
                case "agosto": return 8;
                case "septiembre": return 9;
                case "octubre": return 10;
                case "noviembre": return 11;
                case "diciembre": return 12;
            }
        }
        System.out.println("Mes incorrecto: "+mes);
        return 0;
    }

    private String sacarMesString(int mes) {
        switch (mes) {
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
        }
        return "";
    }

    public boolean buscarFecha(String fecha) {
        String[] date = fecha.split("-");
        String fecha_dada = "";
        String fecha_inicio = fechaInicio_dia + "/" + fechaInicio_mes + "/" + fechaInicio_anio;
        String fecha_final = fechaFinal_dia + "/" + fechaFinal_mes + "/" + fechaFinal_anio;
        if(date.length == 1) {
            fecha_dada = fecha;
        } else if(date.length <= 4) {
            int fechaDada_dia = Integer.parseInt(date[0]);
            int fechaDada_mes = sacarMes(date[1]);
            int fechaDada_anio = Integer.parseInt(date[2]);
            fecha_dada = fechaDada_dia + "/" + fechaDada_mes + "/" + fechaDada_anio;
        } else {
            System.out.println("Fecha incorrecta.");
            return false;
        }

        try {
            DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);

            Date date1 = f.parse(fecha_inicio);
            Date date2 = f.parse(fecha_final);
            Date date3 = f.parse(fecha_dada);
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            Calendar cal3 = Calendar.getInstance();
            cal2.setTime(date2);
            cal1.setTime(date1);
            cal3.setTime(date3);
            return (cal3.after(cal1) && cal3.before(cal2));
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        return fechaInicio_dia+" de "+sacarMesString(fechaInicio_mes)+" de "+fechaInicio_anio;
    }

    public String getFechaFinal() {
        return fechaFinal_dia+" de "+sacarMesString(fechaFinal_mes)+" de "+fechaFinal_anio;
    }

    public String toString() {
        return nombre + "\n" + getFechaInicio() + " al " + getFechaFinal();
    }
}
