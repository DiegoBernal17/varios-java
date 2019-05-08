package exa1;

import java.util.Scanner;

public class exa1 {
    Scanner teclado = new Scanner (System.in);
    double costom, tipom, totalman, total_pagar, personas, cosIVA, extra, desayuno, tarjeta, efectivo, suma=0 ;
    int opc, opc1, opc2,opc3,opc4, i=200;
    int sencilla=1,Doble=2,Deluxe=4,Precidencial=4;
    final double IVA=.16;
    final double  suptotaliva=.3;

    public void ingresar() {
        if(opc1==1) {
            personas=1;
        }
        if(opc1==2) {
            personas=2;
        }
        if(opc1==3) {
            personas=4;
        }
        if(opc1==4) {
            personas=4;
        }

        if(opc1==1) {
            desayuno= 1;
        }

        if(opc1==2) {
            desayuno= 2;
        }
    }

    public void impresion() {
        System.out.println("Tiques de impresión");
    }

    public void Habitaciones_por_noche() {
        System.out.println("Tipo de habitación");
        System.out.println("1.-Sencilla = $700");
        System.out.println("2.-Doble = $1500");
        System.out.println("3.-Deluxe = $3000");
        System.out.println("4.-Precidencial = $5000");
        opc=teclado.nextInt();

        System.out.println("ingresa si hay perona extra "+i);
        System.out.println(extra=1);
        System.out.println(extra=0);
        opc4=teclado.nextInt();
        extra = i * 200;
        System.out.println("hospedeje = " + i);
        total_pagar = extra + costom + desayuno ;}

    public void Servicios_extra() {
        System.out.println("Desayuno");
        System.out.println("1. $75 = americano");
        System.out.println("2. $100 = bufet");

        opc1=teclado.nextInt();
    }
    public void operaciones() {
        switch (opc) {
            case 1: {

                costom = personas * 700;
                System.out.println("Costo del habitación = " + costom);
                System.out.println("Tipo = Sencilla ");
                System.out.println("Total de personas= " + personas);
                System.out.println("Desayuno = " +total_pagar );
                cosIVA = IVA * costom;
                System.out.println("IVA :" + cosIVA);

                System.out.println("Total a Pagar :" + total_pagar);
                System.out.println("suptotaliva && tarjeta"+tarjeta);
                System.out.println("suptotaliva && efectivo"+efectivo);

                break;


            }

            case 2: {

                costom = personas * 1500;
                System.out.println("Costo del habitación = " + costom);
                System.out.println("Tipo = Doble ");
                System.out.println("Total de personas= " + personas);
                System.out.println("Desayuno = " +total_pagar );
                cosIVA = IVA * costom;
                System.out.println("IVA :" + cosIVA);
                System.out.println("Total a Pagar :" + total_pagar);
                System.out.println("suptotaliva && tarjeta"+tarjeta);
                System.out.println("suptotaliva && efectivo"+efectivo);

                break;


            }
            case 3: {

                costom = personas * 3000;
                System.out.println("Costo del habitación = " + costom);
                System.out.println("Tipo = Dulex ");
                System.out.println("Total de personas=4 " + personas);
                System.out.println("Desayuno = " +total_pagar );
                cosIVA = IVA * costom;
                System.out.println("IVA :" + cosIVA);
                System.out.println("Total a Pagar :" + total_pagar);
                System.out.println("suptotaliva && tarjeta"+tarjeta);
                System.out.println("suptotaliva && efectivo"+efectivo);

                break;


            }
            case 4: {

                costom = personas * 5000;
                System.out.println("Costo del habitación = " + costom);
                System.out.println("Tipo = Precidencial ");
                System.out.println("Total de personas=4 " + personas);
                System.out.println("Desayuno = " +total_pagar );
                cosIVA = IVA * costom;
                System.out.println("IVA :" + cosIVA);
                System.out.println("Total a Pagar :" + total_pagar);
                System.out.println("suptotaliva && tarjeta"+tarjeta);
                System.out.println("suptotaliva && efectivo"+efectivo);

                break;


            }

            default:
                System.out.println("Opcion Invalida");
        }

    }


}