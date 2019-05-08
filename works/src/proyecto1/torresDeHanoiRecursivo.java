package proyecto1;

import  javax.swing.JOptionPane;
/**
 *Clase Recursiva que pone un numero de Discos (n) y los va moviendo hasta encontrar una solucion a que un disco peque�o no quede bajo uno grande
 *usando una torre de inicio,una de destino y una de auxiliar
 * 
 * @author (BARRON RDZ RAUL ALBERTO,HECTOR ARANDA MONTEMAYOR,GUILLIAN MARTINEZ GUTIERREZ,ALBERTO LUNA MEDINA, HECTOR CHAVEZ RAMIREZ)
 * @version (1.0 MARZO DE 2018)
 */
public class torresDeHanoiRecursivo {
	public  static void  hanoi (int n, String inicio, String aux, String destino) { 
        if (n==1) {
            System.out.println("Mover disco " +" "+ n +" " +"de"  +" " + inicio +"  "  + "a" +" "+ destino);
        }else{
            hanoi(n-1, inicio,destino,aux);
            System.out.println("Mover disco " +" " + n +" " +"de"  +" " +  inicio +" " + " a " +" " + destino); 
            hanoi(n-1, aux, inicio, destino);
          
        } 

    }
    public  static  void  main(String[] args) { 
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Num Discos;"));
        hanoi(n, "Primera Torre", "Segunda Torre","Tercera Torre"); 
    }
}