package proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Esqueletos extends JPanel {
    private int x,y;
    private int tipo;
    AffineTransform at = new AffineTransform();

    public Esqueletos(int x, int y, double size, int tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
        escalar(size);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        g2.setTransform(at);
        g2.setColor(Color.WHITE);
        g2.fillOval(x, y, 40,42);
        g2.fillRoundRect(x+10, y+34, 21, 10, 3, 3);
        g2.fillOval(x-2, y+24,12,12);
        g2.fillOval(x+30, y+24,12,12);
        g2.fillRoundRect(x+12, y+47, 18, 10, 9, 10);
        g2.fillRect(x+12, y+47, 18, 6);
        g2.setColor(Color.BLACK);
        g2.fillOval(x+7, y+14, 12, 12);
        g2.fillOval(x+21, y+14, 12, 12);
        int[] xpoints = {x+16, x+20, x+24};
        int[] ypoints = {y+38, y+28, y+38};
        g2.fillPolygon(xpoints, ypoints, 3);
        g2.setColor(Color.WHITE);
        g2.fillRect(x-10, y+59, 62, 6);
        g2.fillOval(x-12, y+54, 9, 9);
        g2.fillOval(x-12, y+59, 9, 9);
        g2.fillOval(x+46, y+54, 9, 9);
        g2.fillOval(x+46, y+59, 9, 9);
        g2.fillRect(x+18, y+65, 6, 54);
        g2.fillRoundRect(x-6, y+119, 54, 7, 8,8);
        g2.fillRoundRect(x-6, y+131, 54, 5, 8,8);
        int[] xpoints2 = {x-6, x+22, x+49};
        int[] ypoints2 = {y+133, y+156, y+133};
        g2.fillPolygon(xpoints2, ypoints2, 3);
        g2.setStroke(new BasicStroke(6));
        g2.drawLine(x+6, y+150, x-8, y+174);
        g2.drawLine(x+36, y+150, x+50, y+174);
        g2.fillOval(x+4,y+148, 8,8);
        g2.fillOval(x,y+144, 8,8);
        g2.fillOval(x+30,y+148, 8,8);
        g2.fillOval(x+34,y+146, 8,8);
        g2.fillOval(x-16, y+166, 8,8);
        g2.fillOval(x-8, y+172, 8,8);
        g2.fillOval(x+49, y+167, 8,8);
        g2.fillOval(x+42, y+172, 8,8);
        g2.fillRect(x-10, y+182, 6, 34);
        g2.fillRect(x+48, y+182, 6, 34);
        g2.fillOval(x-15, y+178, 10,9);
        g2.fillOval(x-11, y+178, 10,9);
        g2.fillOval(x+43, y+178, 10,9);
        g2.fillOval(x+49, y+178, 10,9);
        g2.fillOval(x-15, y+212, 10,9);
        g2.fillOval(x-11, y+212, 10,9);
        g2.fillOval(x+43, y+212, 10,9);
        g2.fillOval(x+49, y+212, 10,9);
        g2.fillOval(x-12, y+221, 8,6);
        g2.fillOval(x+47, y+220, 8,6);
        g2.fillRoundRect(x-30, y+227, 24, 6, 8, 8);
        g2.fillRoundRect(x+48, y+227, 24, 6, 8, 8);
        g2.setColor(Color.RED);
        g2.drawLine(x-2, y+160, x+1, y+162);

        g2.setColor(Color.WHITE);
        // BRAZO IZQUIERDO
        g2.drawLine(x-12, y+60, x-32, y+86);
        g2.fillOval(x-16, y+52, 8,8);
        g2.fillOval(x-38, y+80, 8,8);
        g2.fillOval(x-34, y+83, 8,8);

        // BRAZO DERECHO
        g2.drawLine(x+58, y+60, x+80, y+84);
        g2.fillOval(x+52, y+58,8,8);
        g2.fillOval(x+54, y+54,8,8);
        g2.fillOval(x+74, y+83,8,8);
        g2.fillOval(x+78, y+79,8,8);

        Color verde = new Color(54, 118, 25);
        Color verde_claro = new Color(132, 166, 28);
        Color rojo = new Color(194, 50, 47);
        Color amarillo = new Color(253, 218, 59);
        Color cafe = new Color(162,97,52);
        Color cafe_claro = new Color(218,132,56);

        if(tipo == 1 || tipo == 2) {
            // ANTEBRAZO-MANO DERECHA
            g2.drawLine(x-60, y+64, x-38, y+90);
            g2.fillOval(x-62, y+58, 8,8);
            g2.fillOval(x-66, y+62, 8,8);
            g2.fillOval(x-40, y+84, 8,8);
            g2.fillOval(x-44, y+88, 8,8);
            g2.fillOval(x-73, y+50, 13,13);
            // ANTEBRAZO-MANO IZQUIERDA
            g2.drawLine(x+80, y+88, x+62, y+108);
            g2.fillOval(x+50,y+110, 13,13);
        }
        if(tipo == 1) {
            // GUITARRA
            g2.setColor(cafe);
            g2.fillOval(x+4,y+80, 52,52);
            g2.fillOval(x-20,y+68, 42,42);
            g2.setStroke(new BasicStroke(10f));
            g2.drawLine(x-60, y+49, x-10, y+80);
            g2.fillOval(x-82, y+31, 20,20);
            g2.setColor(Color.GRAY);
            g2.fillOval(x+14,y+90, 26,26);
            // SOMBRERO Y BIGOTE
            g2.setColor(Color.BLACK);
            g2.fillOval(x-15,y-9,70,20);
            g2.fillRoundRect(x, y-26, 38,22, 8,8);
            g2.fillRect(x,y+40, 40,3);
        }
        if(tipo == 3 || tipo == 4) {
            g.setColor(Color.WHITE);
            g2.drawLine(x-30, y+90, x-10, y+110);
            g2.fillOval(x-12, y+108, 13,13);
            g2.fillRect(x+79,y+86, 6, 34);
            g2.fillOval(x+75, y+118, 13,13);
        }
        if(tipo == 2) {
            // HUESOS PECHO
            g2.setStroke(new BasicStroke(5));
            g2.drawOval(x-4, y+62, 50,18);
            g2.drawOval(x+1, y+76, 40,14);
            g2.drawOval(x+6, y+88, 30,10);
            // MASCARA
            g2.setColor(rojo);
            g2.fillOval(x-4,y-2,48,60);
            g2.setColor(Color.BLACK );
            g2.fillOval(x+6, y+12, 13,13);
            g2.fillOval(x+22, y+12, 13,13);
            // PANTALONES
            g2.setColor(amarillo);
            g2.fillRoundRect(x-16,y+173,15,54, 8,8);
            g2.setColor(rojo);
            g2.fillRoundRect(x+43,y+173,16,54, 8,8);
            g2.setColor(verde);
            int[] xpoints3 = {x-4, x-20, x+2, x+18, x+26, x+40, x+60, x+46};
            int[] ypoints3 = {y+132, y+174, y+178, y+156, y+156, y+178, y+174, y+132};
            g2.fillPolygon(xpoints3,ypoints3, xpoints3.length);
        }
        if(tipo == 3) {
            // GORRO
            g2.setColor(verde);
            g2.fillOval(x-3,y-2, 46,14);
            // BLUSA
            g2.setColor(verde_claro);
            g2.fillRect(x-5,y+74, 52,48);
            g2.fillRect(x-2,y+55, 10,20);
            g2.fillRect(x+34,y+55, 10,20);
            g2.setColor(Color.MAGENTA);
            // CINTO
            g2.fillRect(x-7,y+120, 56,14);
            // FALDA
            g2.setColor(amarillo);
            for(int i=0; i<11; i++)
                g2.fillRect(x-7+(-i*2),y+134+(i*5), 56+(i*4),5);
            // ZAPATOS
            g2.setColor(rojo);
            g2.fillRoundRect(x-30, y+227, 24, 6, 8, 8);
            g2.fillRoundRect(x+48, y+227, 24, 6, 8, 8);
        }
    }

    public void escalar(double x) {
        x = x/2;
        at.scale(x, x);
    }

    public void rotar(int x) {
        at.rotate(Math.toRadians(x),this.x,this.y);
    }

    public void sesgar (double x)
    {
        at.shear(x, 0.0);
    }
}
