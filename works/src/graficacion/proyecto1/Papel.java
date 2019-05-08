package proyecto1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Papel extends JPanel {
    private int x, y;
    private Color color;
    private int opcion;
    AffineTransform at = new AffineTransform();

    public Papel(int x, int y, double size, int angle, int color) {
        this.x = x;
        this.y = y;
        this.opcion = color;
        asignarColor();
        escalar(size);
        rotar(angle);
    }

    public void asignarColor() {
        switch (this.opcion) {
            case 1:
                this.color = new Color(237,89,153);
                break;
            case 2:
                this.color = new Color(48,170,227);
                break;
            case 3:
                this.color = new Color(138,107,174);
                break;
            case 4:
                this.color = new Color(58,175,70);
                break;
            default:
                this.opcion = 1;
                this.color = new Color(237,89,153);
        }
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        Color morado = new Color(83, 41, 104);
        g2.setTransform(at);
        g2.setColor(Color.BLACK);
        g2.fillRoundRect(x-1,y-1,62,66, 8,8);
        for(int i=-1; i<59; i+=10)
            g2.fillOval(x+i, y+56, 12,12);
        g2.setColor(this.color);
        g2.fillRoundRect(x,y,60,64, 8,8);
        g2.setColor(morado);
        g2.setStroke(new BasicStroke(2));
        g2.drawArc(x+10, y+5, 10, 6, 180, 180);
        g2.drawArc(x+25, y+5, 10, 6, 180, 180);
        g2.drawArc(x+40, y+5, 10, 6, 180, 180);
        g2.fillOval(x+13, y+30, 12,6);
        g2.fillOval(x+27, y+18, 6,12);
        g2.fillOval(x+34, y+30, 12,6);
        g2.fillOval(x+27, y+35, 6,12);
        g2.fillOval(x+16, y+20, 6,6);
        g2.fillOval(x+16, y+40, 6,6);
        g2.fillOval(x+36, y+40, 6,6);
        g2.fillOval(x+36, y+20, 6,6);
        g2.drawArc(x+10, y+54, 10, 6, 0, 180);
        g2.drawArc(x+25, y+54, 10, 6, 0, 180);
        g2.drawArc(x+40, y+54, 10, 6, 0, 180);
        g2.setColor(this.color);
        for(int i=0; i<60; i+=10)
            g2.fillOval(x+i, y+57, 10,10);
    }

    public void escalar(double x) {
        x = x/2;
        at.scale(x, x);
    }

    public void rotar(int x) {
        at.rotate(Math.toRadians(x),this.x,this.y);
    }

    public void cambiarColor() {
        opcion++;
        asignarColor();
        //repaint();
    }
}
