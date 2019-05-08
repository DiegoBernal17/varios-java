package proyecto1;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tablero extends JPanel {

    private final JPanel[][] cuadro;
    
    public static void main(String[]args) {
    	String[] st = new String[25];
    	for(int i=0;i<25; i++) {
    		st[i]="nigga";
    	}
    	Tablero t = new Tablero(5,5,st);
    }
   
    public Tablero(int filas, int columnas, String[] reinas) {
        String[] temp;
        cuadro = new JPanel[filas][columnas];
        Dimension dims = new Dimension(64, 64);
        setLayout(new GridLayout(filas, columnas));
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                temp = reinas[i].split("-");
                JPanel b = new JPanel();
                b.setPreferredSize(dims);
                b.setMinimumSize(dims);
              //  System.out.print(temp[i]);
                String a = "1";
                //String c = temp[j];
                String c = "b";
                if(a.equals(c)){
                    //SI ES REINA LA DIBUJA EN ROJO
                    b.setBackground(Color.RED);
                }else if ((i + j + 1) % 2 == 0) {
                    b.setBackground(Color.WHITE);
                } else {
                    b.setBackground(Color.BLACK);
                }
                add(b);
                cuadro[i][j] = b;
            }
        }
    }
}