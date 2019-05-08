package proyectou3;
import java.awt.* ;
import java.applet.Applet ;

public class Carro extends Applet
{
  // size of area needed for applet figure
 public final int FIGUREHEIGHT = 280;
 public final int FIGUREWIDTH  = 445;
 private int y=400;

  // color definitions (red, green, blue)
        Color ROJO = new Color ( 182, 100, 110 ) ;
        Color NEGROGRIS = new Color ( 150, 70, 80 ) ;
        Color AZUL = new Color ( 35, 206, 255 ) ;
        Color ORO = new Color ( 240, 220, 0 ) ;

  // Applets have a paint method
        
 public void paint (Graphics micarro, int x)
   // all paint methods require a Graphics parameter)
 {
   // background for figure

   // front tire
                micarro.setColor ( Color.black ) ;
     micarro.fillOval ( 20+x, 170+y, 100, 100 ) ;
                micarro.setColor ( Color.white ) ;
     micarro.fillOval ( 30+x, 180+y, 80, 80 ) ;
                micarro.setColor ( Color.black ) ;
     micarro.drawOval ( 40+x, 190+y, 60, 60 ) ;

   // back tire
                micarro.setColor ( Color.black ) ;
     micarro.fillOval ( 270+x, 170+y, 100, 100 ) ;
                micarro.setColor ( Color.white ) ;
     micarro.fillOval ( 280+x, 180+y, 80, 80 ) ;
                micarro.setColor ( Color.black ) ;
     micarro.drawOval ( 290+x, 190+y, 60, 60 ) ;

   // car hood
                micarro.setColor ( NEGROGRIS ) ;
     micarro.fillRect ( 10+x, 113+y, 122, 12 ) ;
                micarro.setColor ( ROJO ) ;
     micarro.fillRect ( 10+x, 123+y, 122, 82 ) ;

   // car hood ornament
                micarro.setColor ( ORO ) ;
     micarro.fillOval ( 10+x, 105+y, 10, 10 ) ;

   //  car window
                micarro.setColor ( AZUL ) ;
                micarro.fillRect ( 130+x, 15+y, 130, 100 ) ; 

   // car door
                micarro.setColor ( ROJO ) ;
     micarro.fillRect ( 130+x, 113+y, 130, 92 ) ;

   // car backseat
                micarro.setColor ( ROJO ) ;
     micarro.fillRect ( 258+x, 15+y, 122, 190 ) ;

   // car trunk
                micarro.setColor ( ROJO ) ;
     micarro.fillRect ( 378+x, 80+y, 57, 125 ) ;

   // car running board
                micarro.setColor ( NEGROGRIS ) ;
     micarro.fillRect ( 118+x, 205+y, 154, 10 ) ;

   // visor
                micarro.setColor ( Color.black ) ;
   micarro.drawLine ( 131+x, 15+y, 110+x, 30+y) ;
   micarro.drawLine ( 131+x, 16+y, 110+x, 31+y) ;
   micarro.drawLine ( 131+x, 17+y, 110+x, 32+y) ;

   // door handle
                micarro.setColor ( Color.black ) ;
   micarro.drawLine ( 145+x, 125+y, 170+x, 125+y) ;
   micarro.drawLine ( 145+x, 124+y, 170+x, 124+y) ;
   micarro.drawLine ( 145+x, 123+y, 170+x, 123+y) ;
 }
}