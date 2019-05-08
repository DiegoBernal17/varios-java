package proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Escenario extends JApplet implements ActionListener {

    private Esqueletos[] esqueletos = new Esqueletos[4];
    private Papel[] papeles = new Papel[12];
    private int nuevo, tipo;
    private Button cambiaColor, escalar, rotar, sesgar, agregar;
    // COLORES
    Color cafe = new Color(136,69,38);
    Color cafe_oscuro = new Color(33,14,4);
    Color verde = new Color(24, 63, 17);
    Color verde_claro = new Color(60, 136, 0, 187);
    Color otro_verde = new Color(34, 66, 54);
    Color color1 = new Color(103,29,22);
    Color rojo = new Color(156, 7,5);
    Color gris = new Color(72,75,72);
    Color gris_oscuro = new Color(24,29,23);
    Color azul_cielo = new Color(57, 148, 141);
    Color morado = new Color(61, 52, 113);
    Color rosa = new Color(241, 80, 120);
    Color naranja = new Color(244, 76, 62);
    Color cremita = new Color(234, 249, 150);

    public void init() {
        setSize(728, 400);
        setBackground(Color.BLACK);

        Container c = getContentPane();
        JPanel panelDeBotones = new JPanel();
        cambiaColor = new Button("Cambiar color");
        cambiaColor.addActionListener(this);
        escalar = new Button("Agrandar");
        escalar.addActionListener(this);
        rotar = new Button("A girar!");
        rotar.addActionListener(this);
        sesgar = new Button("Sesgar.");
        sesgar.addActionListener(this);
        agregar = new Button("Nuevo esqueleto");
        agregar.addActionListener(this);

        panelDeBotones.add(cambiaColor);
        panelDeBotones.add(escalar);
        panelDeBotones.add(rotar);
        panelDeBotones.add(sesgar);
        panelDeBotones.add(agregar);

        c.add(panelDeBotones, BorderLayout.SOUTH);

        // PAPEL PICADO
        papeles[0] = new Papel(2, 129, 1.1, 352, rojo);
        papeles[1] = new Papel(76, 108, 1.2, 352, azul_cielo);
        papeles[2] = new Papel(134, 83, 1.4, 352, morado);
        papeles[3] = new Papel(200, 67, 1.5, 352, verde);
        papeles[4] = new Papel(260, 47, 1.7, 352, rosa);
        papeles[5] = new Papel(309, 40, 1.7, 352, rosa);
        papeles[6] = new Papel(440, 32, 1.5, 352, naranja);
        papeles[7] = new Papel(470, 7, 1.7, 10, verde_claro);
        papeles[8] = new Papel(620, 24, 1.5, 8, rojo);
        papeles[9] = new Papel(750, 41, 1.4, 7, naranja);
        papeles[10] = new Papel(920, 62, 1.3, 7, otro_verde);
        papeles[11] = new Papel(1100, 84, 1.2, 7, rosa);
        // ESQUELETOS
        esqueletos[0] = new Esqueletos(146, 190, 1.4, 1);
        esqueletos[1] = new Esqueletos(270, 100, 2, 2);
        esqueletos[2] = new Esqueletos(456, 110, 1.9, 3);
        esqueletos[3] = new Esqueletos(900, 200, 1.3, 4);

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // CASAS IZQUIERDA
        g2.setColor(cafe);
        int[] xpoints1 = {0, 150, 150, 0};
        int[] ypoints1 = {20, 80, 250, 310};
        g2.fillPolygon(xpoints1, ypoints1, 4);
        g2.setColor(verde);
        int[] xpoints2 = {14, 76, 76, 14};
        int[] ypoints2 = {118, 140, 280, 305};
        g2.fillPolygon(xpoints2, ypoints2, 4);
        g2.setColor(otro_verde);
        int[] xpoints3 = {14, 88, 88, 76, 76, 14};
        int[] ypoints3 = {108, 136, 275, 280, 140, 118};
        g2.fillPolygon(xpoints3, ypoints3, 6);
        g2.setColor(cafe_oscuro);
        int[] xpoints4 = {174, 250, 250, 174};
        int[] ypoints4 = {76, 110, 210, 242};
        g2.fillPolygon(xpoints4, ypoints4, 4);
        g2.setColor(gris_oscuro);
        int[] xpoints5 = {190, 220, 220, 190};
        int[] ypoints5 = {164, 172, 222, 235};
        g2.fillPolygon(xpoints5, ypoints5, 4);
        g2.setColor(cafe);
        int[] xpoints6 = {251, 266, 266, 251};
        int[] ypoints6 = {128, 136, 202, 209};
        g2.fillPolygon(xpoints6, ypoints6, 4);
        // CASAS DERECHA
        g2.setColor(rojo);
        int[] xpoints12 = {730, 620, 620, 730};
        int[] ypoints12 = {40, 96, 272, 344};
        g2.fillPolygon(xpoints12, ypoints12, 4);
        g2.setColor(azul_cielo);
        int[] xpoints17 = {718, 675, 675, 718};
        int[] ypoints17 = {90, 110, 180, 190};
        g2.fillPolygon(xpoints17, ypoints17, 4);
        g2.setColor(rosa);
        g2.fillRect(692, 102, 5, 85);
        g2.fillRect(675, 144, 44, 5);
        g2.setColor(cafe);
        int[] xpoints13 = {619, 602, 602, 619};
        int[] ypoints13 = {90, 90, 261, 272};
        g2.fillPolygon(xpoints13, ypoints13, 4);
        int[] xpoints14 = {601, 544, 544, 601};
        int[] ypoints14 = {90, 134, 223, 260};
        g2.fillPolygon(xpoints14, ypoints14, 4);
        g2.setColor(gris_oscuro);
        int[] xpoints15 = {575, 555, 555, 575};
        int[] ypoints15 = {180, 186, 230, 243};
        g2.fillPolygon(xpoints15, ypoints15, 4);
        g2.setColor(color1);
        int[] xpoints16 = {543, 510, 510, 543};
        int[] ypoints16 = {158, 172, 201, 222};
        g2.fillPolygon(xpoints16, ypoints16, 4);
        // BANQUETAS
        g2.setColor(gris);
        int[] xpoints7 = {0, 266, 320, 0};
        int[] ypoints7 = {312, 204, 204, 400};
        g2.fillPolygon(xpoints7, ypoints7, 4);
        g2.setColor(gris_oscuro);
        int[] xpoints8 = {0, 320, 320, 0};
        int[] ypoints8 = {400, 204, 214, 410};
        g2.fillPolygon(xpoints8, ypoints8, 4);
        int[] xpoints9 = {706, 480, 480, 696};
        int[] ypoints9 = {406, 202, 213, 416};
        g2.fillPolygon(xpoints9, ypoints9, 4);
        g2.setColor(gris);
        int[] xpoints10 = {730, 510, 480, 730};
        int[] ypoints10 = {346, 202, 202, 427};
        g2.fillPolygon(xpoints10, ypoints10, 4);
        // CALLE
        g2.setColor(cafe);
        int[] xpoints11 = {0, 322, 480, 690};
        int[] ypoints11 = {414, 216, 216, 414};
        g2.fillPolygon(xpoints11, ypoints11, 4);
        // PAPEL PICADO
        g2.setColor(cremita);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(0, 70 ,410, 10);
        g2.drawLine(370, 0 ,730, 60);
        for(int i=0; i<papeles.length; i++)
            papeles[i].paint(g2);
        //ESQUELETOS
        for(int i=0; i<esqueletos.length; i++)
            esqueletos[i].paint(g2);

    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource()== cambiaColor) {
            for(int i=0; i<papeles.length; i++){
                papeles[i].cambiaColor();
            }
            resize(727, 401);
            resize(728, 400);
        }
        if(event.getSource()== escalar) {
            esqueletos[2].escalar(2.1);

            resize(727, 401);
            resize(728, 400);
        }
        if(event.getSource()== rotar) {
            esqueletos[1].rotar(5);
            resize(727, 401);
            resize(728, 400);
        }
        if(event.getSource()== sesgar) {
            esqueletos[0].sesgar(1);

            resize(727, 401);
            resize(728, 400);
        }
        if(event.getSource()== agregar) {
            Esqueletos esq = new Esqueletos(200+nuevo, 40, 1, tipo);
            nuevo+=180;
            tipo++;
            if(nuevo >1000) { nuevo = 0; }
            if(tipo==4) tipo=1;
            esq.paint(getGraphics());
        }
        repaint();
    }
}
