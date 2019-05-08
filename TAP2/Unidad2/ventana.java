 
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class ventana extends JFrame implements MouseListener{
	

	public static void main(String[] args) {
		new ventana();
	}
	private int dibujo = 1;
	private Button boton1,boton2,boton3,boton4,boton5;
	
	ActionListener accion = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == boton1)
			{
				dibujo = 1;
			}
			if(e.getSource() == boton2)
			{
				dibujo = 2;
			}
			if(e.getSource() == boton3)
			{
				dibujo = 3;
			}
			if(e.getSource() == boton4)
			{
				dibujo = 4;
			}
			if(e.getSource() == boton5)
			{
				dibujo = 5;
			}
			
		}
	};
	ventana()
	{
		crearComponentes();
		configurarVentana();
		insertarComponentes();
		insertarFunciones();
		paintComponents(getGraphics());
	}
	
	private void crearComponentes()
	{
		
		boton1 = new Button("nubes");
		boton2 = new Button("barcos");
		boton3 = new Button("personas");
		boton4 = new Button("tierra");
		boton5 = new Button("sol");
	}
	
	private void configurarVentana()
	{
		
		setSize(getMaximumSize());
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setTitle("DIA DE LA RAZA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void insertarComponentes()
	{
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
	}
	
	private void insertarFunciones()
	{
		addMouseListener(this);
		boton1.addActionListener(accion);
		boton2.addActionListener(accion);
		boton3.addActionListener(accion);
		boton4.addActionListener(accion);
		boton5.addActionListener(accion);
		
	}
	
	private void limpiar()
	{
		
	}
	
	public void paintComponents(Graphics g)//poner el fondo
	 {
	 Dimension tamaño = getSize();
	 ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/Unidad2/laRaza.png")).getImage());
	 g.drawImage(imagen.getImage(),0,0,tamaño.width,tamaño.height,null);
	 System.out.println("pintamos el fondo");
	 }
	
	public void paintNubes(Graphics g)
	 {
		 //nube
		Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = punto.x-40;
        int y = punto.y;
	        g.setColor(Color.blue);
	        g.fillOval(x-20,y-20,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(x,-40+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(20+x,-40+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(40+x,-45+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(65+x,-42+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(70+x,-10+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(60+x,10+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(45+x,10+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(-20+x,y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(x,10+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(20+x,20+y,40,40);
	        g.setColor(Color.blue);
	        g.fillOval(x,-20+y,60,60);
	        g.setColor(Color.blue);
	        g.fillOval(30+x,-20+y,60,60);
	 }
	
	public void paintBarcos(Graphics g)
	 {
		Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = punto.x-90;
        int y = punto.y;
		 //Barco //
        g.setColor(new Color(163,83,0));//color cafe
        g.fillArc (x,y,150,50,165,180); //1/
        g.fillRect(25+x,27+y,150,24);//base//
        g.fillArc (100+x,-23+y,100,80,300,60);// 
        g.fillRect(100+x,-124+y,5,150);//rect 1//
        g.fillRect(100+x,6+y,100,5);//rect 2//
        //g.drawRect(240,90,30,5);// rect3//
        g.setColor(Color.red);
        g.fillArc (80+x,-123+y,70,260,0,100);
        g.setColor(Color.red);
        g.fillArc (2+x,-93+y,200,192,90,100);//vela
        g.setColor(Color.white);
        g.fillRect(60+x,-63+y,5,37);
        g.fillRect(43+x,-45+y,37,5);
	 }
	public void paintPersonas(Graphics g)
	 {
		Point punto = MouseInfo.getPointerInfo().getLocation();
       int x = punto.x-1000;
       int y = punto.y-500;
		   //cristobal Colon//
	       g.setColor(Color.pink);
	       g.fillArc(995+x,400+y,60,70,180,-180);//cara
	       g.fillArc(995+x,400+y,60,70,180,180);//cara
	       g.setColor(Color.black);
	       g.fillOval(1039+x,428+y,5,5);// pupila
	       g.setColor(Color.black);
	       g.drawOval(1028+x,425+y,19,10);// ojo
	       g.setColor(Color.black);
	       g.drawArc(1027+x,416+y,19,10,180,-180);//ceja
	       //SOMBRERO//
	       g.fillArc(985+x,350+y,40,90,215,-215);
	       g.fillOval(1017+x,383+y,20,18);
	       g.fillOval(982+x,410+y,24,18);
	       g.fillOval(1010+x,384+y,20,18);
	       g.fillOval(1000+x,386+y,20,18);
	       g.fillOval(995+x,379+y,20,28);
	       g.fillOval(990+x,384+y,20,28);
	       g.fillOval(985+x,389+y,20,28);
	       //CUERPO//
	       g.setColor(Color.red);
	       g.fillRect(998+x,470+y,50,90);
	       g.setColor(Color.gray);
	       g.fillOval(990+x,470+y,30,30); //hombro der
	       g.setColor(Color.yellow);
	       g.fillOval(993+x,475+y,7,18);
	       g.fillOval(1005+x,475+y,7,18);
	       //BRAZOS//
	       g.setColor(Color.gray);
	       g.drawArc(1017+x,480+y,60,30,180,-180);
	       //PIERNAS//
	       g.setColor(Color.black);
	       g.drawRect(1005+x,580+y,15,60);
	       g.drawRect(1020+x,580+y,10,53);
	       
	       g.setColor(Color.black);
	       g.fillOval(1020+x,625+y,20,10);
	       
	        //PANTALON//
	       g.setColor(new Color(163,83,0));//color cafe
	       g.fillArc(1020+x,530+y,30,60,-180,180);
	       g.fillArc(995+x,530+y,30,60,-180,180);
	 }

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()== this )
		{
			if(dibujo == 1)
			{
				System.out.println("pintamos una nube");
				paintNubes(getGraphics());
				
			}
			if(dibujo == 2)
			{
				System.out.println("pintamos un barco");
				paintBarcos(getGraphics());
				
			}
			if(dibujo == 3)
			{
				System.out.println("pintamos una persona");
				new ventana();
				
			}
			if(dibujo == 4)
			{
				repaint();
				paintComponents(getGraphics());
			}
			if(dibujo == 5)
			{
				
			}
		}
        
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
		
}

