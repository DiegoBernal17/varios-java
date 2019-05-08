package unidad2;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class PrimerEvento2 extends Applet implements AdjustmentListener
{
	private Scrollbar barra;
	private int barraValor = 0;
	
	public void init()
	{
		barra = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
		add(barra);
		barra.addAdjustmentListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("El vamor actual es = "+barraValor, 100, 100);
		g.setColor(Color.red);
		g.drawRect(300, 100, 60, 100);
		g.fillRect(300, 100, 60, barraValor+1);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		barraValor = barra.getValue();
		repaint();
	}
}
