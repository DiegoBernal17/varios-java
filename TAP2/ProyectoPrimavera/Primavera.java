
/**
 * Write a description of class Primavera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import ejemplo.WindowListenerTest;

public class Primavera extends Frame implements ActionListener,MouseListener, Runnable{

	// variables 
    private int x=100,y;
    private MenuItem flor,nube,sol,mariposa,r,b,g,i,limpiar;

    Thread hilo;
    
    Arbol ar = new Arbol();
    MenuBar mb = new MenuBar();

    // llamar de las clases principales alas figuras
    Color c = Color.red;
    Flor fl= new Flor();
   
    Nube nu = new Nube();
    Sol so = new Sol();
    Mariposa mar =new Mariposa();

    private int seleccion = 0;
    AffineTransform at = new AffineTransform();

    public static void main(){
        new Primavera().setVisible(true);
    } 

    public Primavera(){
        // MENU para elegir figuras, colores u opciones
        this.setTitle("Proyecto Primavera");

        this.setSize(500,800);
        this.setMenuBar(mb);
        Menu m1 = new Menu("Figuras");
        //Menu m2 = new Menu("Colores");
        Menu m3 = new Menu ("Opciones");

        // objetos para elegir las figuras
        flor = new MenuItem ("Flor");
        m1.add(flor);
        flor.addActionListener(this);

        nube = new MenuItem("Nube");
        m1.add(nube);
        nube.addActionListener(this);

        sol = new MenuItem ("Sol");
        m1.add(sol);
        sol.addActionListener(this);

        mariposa = new MenuItem ("Mariposa");
        m1.add(mariposa);
        mariposa.addActionListener(this);

        // objeto para limpiar la pantalla
        limpiar = new MenuItem ("Limpiar");
        m3.add(limpiar);
        limpiar.addActionListener(this);

        mb.add(m1);
        //mb.add(m2);
        mb.add(m3);

        this.addWindowListener(new WindowListenerTest());
        addMouseListener(this);

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;

        setBackground(Color.cyan);
        ar.paint(g,x,y);
        x=x+15;

    }
    
     public void run(){//ejecutar los eventos y transformaciones hilos
        while(true){
            repaint();
            try{
                hilo.sleep(1000);//hillos controlado con tiempo
            }catch(InterruptedException e){}
            
        }//fin de while
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == flor)
            seleccion = 1;

        if(event.getSource() == nube)
            seleccion = 2;
        if(event.getSource() == sol)
            seleccion = 3;
        if(event.getSource() == mariposa)
            seleccion = 4;
        /*if(event.getSource() == caramelo)
            seleccion = 5;*/

        /*if(event.getSource() == w)
            c = Color.white;*/
        if(event.getSource() == b)
            c = Color.blue;
        if(event.getSource() == g)
            c = new Color(141,73,37);
        if(event.getSource() == i)
            c = Color.yellow;
        if(event.getSource() == r)
            c = Color.red;
        if(event.getSource() == limpiar)

            repaint();
    }

    public void mousePressed(MouseEvent ev) {
        Graphics g = getGraphics();
        g.setColor(c);

        if(seleccion == 1 )
            fl.paint(g,ev.getX(),ev.getY());
        if(seleccion == 2 )
        	nu.paint(g,ev.getX(),ev.getY());
        if(seleccion == 3 )
            so.paint(g,ev.getX(),ev.getY());
        if(seleccion == 4 )
            mar.paint(g,ev.getX(),ev.getY());

        g.dispose();
    }

    public void mouseExited(MouseEvent event) {}

    public void mouseReleased(MouseEvent event) {}

    public void mouseClicked(MouseEvent event) {}

    public void mouseEntered(MouseEvent event) {}
}
