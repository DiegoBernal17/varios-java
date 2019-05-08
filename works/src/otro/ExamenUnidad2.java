package otro;

import javax.swing.JOptionPane;

public class ExamenUnidad2 {

    public static int sumaNumerosDeString(String texto, int vuelta) {
        int suma=0;
        if(vuelta < texto.length()-1) {
            suma = sumaNumerosDeString(texto, vuelta+1);
        }
        if (Character.isDigit(texto.charAt(vuelta))) {
            return Integer.parseInt(texto.charAt(vuelta)+"")+suma;
        } else
            return suma;
    }

    public static int multiplicacionRusa(int a, int b) {
        int suma=0;
        if(a > 1) {
            suma = multiplicacionRusa(a/2, b*2);
        }
        if(a%2 == 0)
            return suma;
        else
            return suma+b;
    }

    public static void main(String[] args) {
        int num, a=1, b=0;
        String texto = "";
        texto = JOptionPane.showInputDialog("Suma de números en un string\nDame el string:");
        num = sumaNumerosDeString(texto, 0);
        JOptionPane.showMessageDialog(null, num);
        a = Integer.parseInt(JOptionPane.showInputDialog("Multiplicación Rusa\nDame el valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor de b:"));
        num = multiplicacionRusa(a,b);
        JOptionPane.showMessageDialog(null, num);
    }
}
