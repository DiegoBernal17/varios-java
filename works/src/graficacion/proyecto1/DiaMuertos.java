package proyecto1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

public class DiaMuertos extends JApplet implements ActionListener {
    private Button cambiarColor, moverMano, girarFlores, agrandarMano;
    private Calavera esqueleto;
    private Papel[] papeles = new Papel[8];
    private Flor[] flores = new Flor[26];
    private AffineTransform ar = new AffineTransform();

    public void init() {
        setSize(666, 470);
        setBackground(new Color(83, 41, 104));

        Container c = getContentPane();
        JPanel panelDeBotones = new JPanel();
        cambiarColor = new Button("Cambiar color");
        cambiarColor.addActionListener(this);
        moverMano = new Button("Mover mano");
        moverMano.addActionListener(this);
        girarFlores = new Button("Girar flores");
        girarFlores.addActionListener(this);
        agrandarMano = new Button("Agrandar mano");
        agrandarMano.addActionListener(this);

        panelDeBotones.add(cambiarColor);
        panelDeBotones.add(moverMano);
        panelDeBotones.add(girarFlores);
        panelDeBotones.add(agrandarMano);

        c.add(panelDeBotones,BorderLayout.SOUTH);

        // ESQUELETO
        esqueleto = new Calavera();

        // PAPEL PICADO
        papeles[0] = new Papel(10, 40, 2, 0, 1);
        papeles[1] = new Papel(100, 50, 1.8, 350, 2);
        papeles[2] = new Papel(220, 54, 1.5, 346, 3);
        papeles[3] = new Papel(380, 52, 1.2, 338, 4);
        papeles[4] = new Papel(590, 30, 1, 30, 4);
        papeles[5] = new Papel(654, 64, 1, 12, 3);
        papeles[6] = new Papel(726, 70, 1, 353, 2);
        papeles[7] = new Papel(800, 60, 1, 324, 1);

        Graphics2D g2 = (Graphics2D) getGraphics();
        // FLORES
        Color flor_color1 = new Color(254,198, 13);
        Color flor_color2 = new Color(175,35, 12);
        Color flor_color3 = new Color(220,99, 20);
        flores[0] = new Flor(70, 300, 0.8, 0, flor_color1, g2);
        flores[1] = new Flor(68, 234, 1.2,0, flor_color2, g2);
        flores[2] = new Flor(44, 300, 1.1, 0, flor_color1, g2);
        flores[3] = new Flor(70, 300, 1.7, 0, flor_color1, g2);
        flores[4] = new Flor(160, 318, 1.8,0, flor_color2, g2);
        flores[5] = new Flor(220, 496, 1.1, 0, flor_color1, g2);
        flores[6] = new Flor(10, 320, 1.9, 0, flor_color3, g2);
        flores[7] = new Flor(28, 220, 3, 0, flor_color1, g2);
        flores[8] = new Flor(0, 490, 1.4, 0, flor_color1, g2);
        flores[9] = new Flor(20, 390, 1.9,0, flor_color2, g2);
        flores[10] = new Flor(150, 350, 2, 0, flor_color1, g2);
        flores[11] = new Flor(390, 680, 1.1, 0, flor_color3, g2);
        flores[12] = new Flor(200, 400, 1.8, 0, flor_color1, g2);
        flores[13] = new Flor(65, 230, 3, 0, flor_color1, g2);
        flores[14] = new Flor(85, 550, 1.4, 0, flor_color1, g2);
        flores[15] = new Flor(100, 360, 1.8, 0, flor_color3, g2);
        flores[16] = new Flor(210, 590, 1.3, 0, flor_color2, g2);
        flores[17] = new Flor(450, 510, 1.4, 0, flor_color1, g2);
        flores[18] = new Flor(606,600, 1.2, 0, flor_color3, g2);
        flores[19] = new Flor(440,320, 2, 0, flor_color1, g2);
        flores[20] = new Flor(400,340, 2, 0, flor_color1, g2);
        flores[21] = new Flor(548,448, 1.6, 0, flor_color2, g2);
        flores[22] = new Flor(590,430, 1.4, 0, flor_color3, g2);
        flores[23] = new Flor(724,370, 1.7, 0, flor_color3, g2);
        flores[24] = new Flor(600,360, 2, 0, flor_color1, g2);
        flores[25] = new Flor(640,340, 2, 0, flor_color1, g2);

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(37,16,49));
        g2.fillRect(0,376, 700,120);

        // FLORES
        for(int i=0; i<flores.length; i++) {
            flores[i].paint(g);
        }
        g2.setTransform(ar);

        // PAPEL PICADO
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(3));
        g2.drawArc(-120, -32, 400, 72, 245, 110);
        g2.drawArc(288, -44, 140, 80, 200, 160);

        esqueleto.paint(g);

        for(int i=0; i<papeles.length; i++) {
            papeles[i].paint(g);
        }
    }


    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==moverMano) {
            esqueleto.moverMano();
        }
        if(event.getSource()==cambiarColor) {
            for (int i=0; i<papeles.length; i++) {
                papeles[i].cambiarColor();
            }
        }
        if(event.getSource()==girarFlores) {
            for (int i=0; i<flores.length; i++) {
                flores[i].rotar(5);
            }
        }
        if(event.getSource()==agrandarMano) {
            esqueleto.agrandarMano();
        }
        repaint();
        resize(665,470);
        resize(666,470);
    }
}
