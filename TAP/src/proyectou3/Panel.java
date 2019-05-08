package proyectou3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable {

	Thread hilo;
	int x = 0;
	
	
	boolean xLimit = false;
	
	
	public Panel()
	{
		hilo = new Thread(this);
		hilo.start();
	}
    public void paint(Graphics g)
    {
        super.paint(g);
       g.setColor(Color.red);
       g.fillOval(x, 250, 100, 100);
    }
    
    @Override
    
    public void run()
    {
    	while(hilo.isAlive())
    	{
    		
			if(!xLimit){
    			x++;
    		    if(x == getBounds().width-100)
    		    {
    		    	xLimit = true; 
    		    }
    		}else{
    			x--;
    			if(x == 0)
    			{
    				xLimit = false;
    			}
    		}
    		
    		repaint();
    		try 
    		{
    	         Thread.sleep(10);
    		}catch (InterruptedException ex) {
    			System.err.println("Error al intentar detener el hilo");
    		}
    	}
    }



	
	
}
