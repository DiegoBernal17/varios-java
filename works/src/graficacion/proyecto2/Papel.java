package proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Papel extends JPanel {
    private int x, y;
    private Color color;
    private int opcion;
    AffineTransform at = new AffineTransform();

    public Papel(int x, int y, double size, int angle, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        escalar(size);
        rotar(angle);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        g2.setColor(color);
        g2.setTransform(at);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(x, y, 48, 56);
        for(int i=0; i <= 40; i+=4)
            g2.fillRect(x+4+i, y, 2, 50);

        g2.drawLine(x, y+50, x+48, y+50);
        g2.fillOval(x+10, y+8, 26, 26);
        g2.fillOval(x+15, y+24, 16, 14);

        for(int i=0; i<48; i+=8)
            g2.fillArc(x+i, y+54, 8, 8, 180, 180);

        g2.setColor(Color.BLACK);
        g2.fillOval(x+15, y+13, 7,10);
        g2.fillOval(x+24, y+13, 7,10);
        int[] xpoints = {x+20, x+23, x+26};
        int[] ypoints = {y+29, y+23, y+29};
        g2.fillPolygon(xpoints, ypoints, 3);
        g2.setStroke(new BasicStroke(2));
        g2.drawArc(x+19,y+29, 8, 6, 180, 180);
    }

    public void escalar(double x) {
        x = x/2;
        at.scale(x, x);
    }

    public void rotar(int x) {
        at.rotate(Math.toRadians(x),this.x,this.y);
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
    public void cambiaColor(){
        opcion++;
        asignarColor();
    }
}
