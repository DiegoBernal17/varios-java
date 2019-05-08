package proyecto1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Calavera extends JPanel {

    private AffineTransform at = new AffineTransform();

    public void paint(Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillOval(519, 271, 26, 16);
        g2.setColor(Color.WHITE);
        g2.fillOval(522, 274, 20, 10);
        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(425, 65, 200, 190));
        g2.fill(new Ellipse2D.Double(445, 171, 130, 106));
        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(430, 70, 190, 180));
        g2.fill(new Ellipse2D.Double(450, 176, 120, 96));
        g2.setColor(Color.BLACK);
        // Ojos
        g2.fillOval(454,146,48,56);
        g2.fillOval(530,160,48,56);
        // Nariz
        int xpoints[] = {512, 492, 520};
        int ypoints[] = {200, 217, 226};
        g2.fillPolygon(xpoints, ypoints, xpoints.length);
        // Boca
        g2.fillOval(476, 230, 7,14);
        g2.fillOval(485, 236, 7,14);
        g2.fillOval(494, 238, 7,14);
        g2.fillOval(503, 240, 7,14);
        g2.fillOval(513, 242, 7,14);
        g2.fillOval(522, 240, 7,14);
        // Cuello
        g2.fillRoundRect(524, 284, 18,94, 10, 10);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(528, 286, 10,88, 10, 10);
        g2.setColor(Color.BLACK);
        // Sombras brazos
        int xpoints2_sombra[] = {484, 383, 396, 494};
        int ypoints2_sombra[] = {281, 381, 392, 294};
        g2.fillPolygon(xpoints2_sombra, ypoints2_sombra, xpoints2_sombra.length);
        int xpoints3_sombra[] = {587, 686, 700, 584};
        int ypoints3_sombra[] = {308, 392, 382, 280};
        g2.fillPolygon(xpoints3_sombra, ypoints3_sombra, xpoints3_sombra.length);
        g2.setColor(Color.WHITE);
        // Brazo derecho
        int xpoints2[] = {487, 387, 396, 494};
        int ypoints2[] = {282, 381, 388, 290};
        g2.fillPolygon(xpoints2, ypoints2, xpoints2.length);
        // Brazo izquierdo
        int xpoints3[] = {587, 687, 696, 584};
        int ypoints3[] = {304, 388, 380, 284};
        g2.fillPolygon(xpoints3, ypoints3, xpoints3.length);
        // Contorno huesos cuerpo
        g2.setColor(Color.BLACK);
        g2.fillRoundRect(459, 281, 74, 13, 10, 10);
        g2.fillRoundRect(466, 293, 63, 18, 10, 10);
        g2.fillRoundRect(464, 310, 64, 18, 10, 10);
        g2.fillRoundRect(462, 327, 65, 18, 10, 10);
        g2.fillRoundRect(458, 344, 68, 18, 10, 10);
        g2.fillRoundRect(461, 361, 66, 18, 10, 10);
        g2.fillRoundRect(532, 281, 74, 13, 10, 10);
        g2.fillRoundRect(535, 293, 63, 18, 10, 10);
        g2.fillRoundRect(533, 310, 64, 18, 10, 10);
        g2.fillRoundRect(531, 327, 65, 18, 10, 10);
        g2.fillRoundRect(529, 344, 68, 18, 10, 10);
        g2.fillRoundRect(531, 361, 66, 18, 10, 10);
        // Huesos cuerpo
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(462, 284, 69, 8, 10, 10);
        g2.fillRoundRect(468, 295, 59, 14, 10, 10);
        g2.fillRoundRect(466, 312, 60, 14, 10, 10);
        g2.fillRoundRect(464, 329, 61, 14, 10, 10);
        g2.fillRoundRect(460, 346, 64, 14, 10, 10);
        g2.fillRoundRect(463, 363, 62, 14, 10, 10);
        g2.fillRoundRect(535, 284, 69, 8, 10, 10);
        g2.fillRoundRect(537, 295, 59, 14, 10, 10);
        g2.fillRoundRect(535, 312, 60, 14, 10, 10);
        g2.fillRoundRect(533, 329, 61, 14, 10, 10);
        g2.fillRoundRect(531, 346, 64, 14, 10, 10);
        g2.fillRoundRect(533, 363, 62, 14, 10, 10);
        // Sombra cuerpo entre huesos
        g2.setColor(Color.BLACK);
        g2.fillArc(479, 284, 41, 15, 180, 180);
        g2.fillArc(474, 304, 46, 12, 180, 180);
        g2.fillArc(471, 322, 46, 12, 180, 180);
        g2.fillArc(472, 338, 44, 15, 180, 180);
        g2.fillArc(472, 356, 44, 10, 180, 180);
        g2.fillArc(543, 284, 41, 15, 180, 180);
        g2.fillArc(538, 304, 48, 14, 180, 180);
        g2.fillArc(535, 322, 48, 13, 180, 180);
        g2.fillArc(536, 338, 46, 12, 180, 180);
        g2.fillArc(535, 356, 48, 12, 180, 180);
        // Sombra antebrazo derecho
        g2.setStroke(new BasicStroke(14f));
        GeneralPath path = new GeneralPath();
        path.moveTo(340, 308);
        path.curveTo(412, 352, 370, 356, 388, 374);
        g2.draw(path);

        // Antebrazo
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(8f));
        GeneralPath path2 = new GeneralPath();
        path2.moveTo(340, 308);
        path2.curveTo(412, 352, 370, 356, 388, 374);
        g2.draw(path2);
        // Sombra antebrazo derecho
        g2.setColor(Color.BLACK);
        int[] xpoints4_sombra = {398, 330, 319, 386};
        int[] ypoints4_sombra = {376, 290, 299, 386};
        g2.fillPolygon(xpoints4_sombra, ypoints4_sombra, xpoints4_sombra.length);
        // Antebrazo
        g2.setColor(Color.WHITE);
        int[] xpoints4 = {392, 328, 322, 386};
        int[] ypoints4 = {374, 294, 299, 381};
        g2.fillPolygon(xpoints4, ypoints4, xpoints4.length);

        g2.setStroke(new BasicStroke(7f));
        Color amarillo = new Color(245,209,69);
        Color rosa = new Color(208, 94, 135);
        Color azul = new Color(32,147,178);
        Color verde = new Color(99,193,97);
        Color naranja = new Color(194,116,70);

        g2.setColor(amarillo);
        g2.fillRoundRect(506, 154, 4, 20, 8,8);
        g2.fillRoundRect(524, 160, 4, 20, 8,8);
        g2.drawArc(510, 102, 18, 20, 90, 180);
        g2.drawArc(514, 82, 20, 20, 50, 200);
        g2.drawArc(532, 108, 18, 20, 240, 180);
        g2.drawArc(534, 88, 20, 20, 280, 200);
        g2.setColor(rosa);
        g2.fillOval(513, 160, 8,10);
        g2.fillOval(520, 138, 6,6);
        g2.fillOval(526, 114, 6,6);
        g2.drawArc(450, 120, 50, 40, 0, 190);
        g2.drawArc(542, 140, 50, 50, 340, 180);
        g2.setColor(azul);
        g2.fillOval(517, 148, 7,7);
        g2.fillOval(522, 124, 8,10);
        g2.fillOval(528, 100, 11,11);
        g2.setColor(verde);
        g2.drawArc(460, 110, 40, 20, 0, 170);
        g2.drawArc(552, 130, 40, 30, 340, 160);
        g2.setColor(naranja);
        g2.drawLine(510, 140, 500, 90);
        g2.drawLine(568, 100, 534, 150);
        g2.setStroke(new BasicStroke(2));
        g2.drawArc(470,200,24, 12,190, 170);
        g2.drawArc(530,194,34, 30,170, 110);
        g2.drawArc(458,138,44, 30,70, 90);
        g2.drawArc(542,154,40, 40,350, 100);

        g2.setTransform(at);
        g2.setStroke(new BasicStroke(14f));
        g2.setColor(Color.BLACK);
        // Sombra mano
        g2.fillOval(289, 258, 46, 46);
        // Sombra dedos
        g2.draw(new Arc2D.Double(312, 224, 26, 38,300, 100, Arc2D.OPEN));
        g2.drawLine(306, 258, 278, 224);
        g2.drawLine(290, 264, 260, 240);
        g2.drawLine(288, 278, 250, 270);
        g2.drawLine(290, 292, 256, 294);
        g2.setColor(Color.WHITE);
        // Mano
        g2.fillOval(293, 262, 38, 38);
        // Dedos
        g2.setStroke(new BasicStroke(7f));
        g2.draw(new Arc2D.Double(312, 226, 26, 34,300, 100, Arc2D.OPEN));
        g2.drawLine(305, 257, 298, 248);
        g2.drawLine(292, 266, 282, 258);
        g2.drawLine(287, 278, 275, 275);
        g2.drawLine(290, 292, 282, 293);
        g2.setStroke(new BasicStroke(6f));
        g2.draw(new Arc2D.Double(312, 226, 26, 34,300, 100, Arc2D.OPEN));
        g2.drawLine(292, 240, 288, 236);
        g2.drawLine(275, 252, 270, 248);
        g2.drawLine(266, 273, 260, 272);
        g2.drawLine(273, 293, 268, 294);

        g2.drawLine(282, 228, 278, 224);
        g2.drawLine(262, 242, 260, 240);
        g2.drawLine(251, 270, 250, 270);
        g2.drawLine(258, 294, 256, 294);
        g2.setColor(Color.BLACK);
        g2.drawLine(340, 244, 334, 244);
    }

    public void moverMano() {
        at.translate(10, 0);
    }

    public void agrandarMano() {
        at.scale(1.1,1.1);
    }
}
