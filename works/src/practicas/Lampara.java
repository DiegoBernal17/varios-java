package practicas;

import java.util.Scanner;

public class Lampara {
    private boolean estadoDeLampara;
    private int tiempoApagado;
    private int brillo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampara lampara = new Lampara();
        String mensaje = "Estado Actual:\n" +
                    lampara.getInfo() +
                    "1. Prender Lámpara\n" +
                    "2. Apagar Lámpara\n" +
                    "3. Ingresar Tiempo de Apagado\n" +
                    "4. Ajustar Brillo\n" +
                    "5. Salir\n";
        int opcion, tiempo, brillo;

        System.out.println(mensaje);
        do {
            System.out.println("Ingresa el número de la opción a realizar: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    lampara.setEstadoDeLampara(true);
                    break;
                case 2:
                    lampara.setEstadoDeLampara(false);
                    break;
                case 3:
                    System.out.println("Tiempo en segundos que se apagará la lámpara: ");
                    tiempo = sc.nextInt();
                    lampara.setTiempoApagado(tiempo);
                    break;
                case 4:
                    System.out.println("Brillo del 1 al 10 de la lámpara: ");
                    brillo = sc.nextInt();
                    lampara.setBrillo(brillo);
                    break;
            }
            System.out.println(lampara.getInfo());
        } while(opcion != 5);
    }

    public Lampara() {
        estadoDeLampara = false;
        tiempoApagado = 0;
        brillo = 10;
    }

    public void setEstadoDeLampara(boolean estado){
        if (this.estadoDeLampara == estado) {
            System.out.println("La lámpara ya está "+this.getEstadoString());
        } else {
            this.estadoDeLampara = estado;
            System.out.println("La lámpara ha sido "+this.getEstadoString());
        }
    }

    public void setTiempoApagado(int tiempo) {
        if(this.estadoDeLampara) {
            this.tiempoApagado = tiempo;
            System.out.println("Tiempo de apagado modificado.");
        } else {
            System.out.println("La lámpara debe estar prendida.");
        }
    }

    public void setBrillo(int brillo) {
        if(this.estadoDeLampara) {
            if(brillo >= 0 && brillo <= 10) {
                this.brillo = brillo;
                System.out.println("Brillo modificado.");
            } else {
                System.out.println("Se debe ingresar un número del 1 al 10.");
            }
        } else {
            System.out.println("La lámpara debe estar prendida.");
        }
    }

    public boolean getEstado() {
        return this.estadoDeLampara;
    }

    public String getEstadoString() {
        if(this.estadoDeLampara)
            return "Encendida";
        else
            return "Apagada";
    }

    public int getTiempoApagado() {
        return this.tiempoApagado;
    }

    public int getBrillo() {
        return this.brillo;
    }

    public String getInfo() {
        return "["+this.getEstadoString()+"][Tiempo de apagado: "+this.tiempoApagado+"s / Brillo: "+this.getBrillo()+"]\n";
    }
}
