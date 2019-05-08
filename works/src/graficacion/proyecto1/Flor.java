package proyecto1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Flor extends JPanel {
    private int x, y;
    private Color color;
    AffineTransform at = new AffineTransform();

    public Flor(int x, int y, double size, int angle, Color color, Graphics2D g2) {
        this.x = x;
        this.y = y;
        this.color = color;
        escalar(size);
        rotar(angle);
        paint(g2);
    }

    public void paint(Graphics g)
    {
        Color borde = new Color(215,128, 0);
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setTransform(at);
        g2.setColor(borde);
        g2.fillOval(x, y+12, 20, 28);
        g2.fillOval(x+12, y, 28, 20);
        g2.fillOval(x, y-20, 20, 28);
        g2.fillOval(x-20, y, 30, 20);
        g2.setColor(color);
        g2.fillOval(x+2, y+14, 16, 24);
        g2.fillOval(x+14, y+2, 24, 16);
        g2.fillOval(x+2, y-18, 16, 24);
        g2.fillOval(x-18, y+2, 24, 16);
        g2.setColor(borde);
        g2.fillOval(x-10, y+10, 20, 20);
        g2.fillOval(x+8, y-10, 20, 20);
        g2.fillOval(x+8, y+10, 20, 20);
        g2.fillOval(x-10, y-10, 20, 20);
        g2.setColor(color);
        g2.fillOval(x-8, y+12, 16, 16);
        g2.fillOval(x+10, y-8, 16, 16);
        g2.fillOval(x+10, y+12, 16, 16);
        g2.fillOval(x-8, y-8, 16, 16);
        g2.setColor(borde);
        g2.fillOval(x-2, y-2, 24,24);
        g2.setColor(color);
        g2.fillOval(x, y, 20,20);
    }

    public void escalar (double x) {
        x = x/2;
        at.scale(x, x);
    }

    public void rotar(int x) {
        at.rotate(Math.toRadians(x),this.x,this.y);
    }
}
