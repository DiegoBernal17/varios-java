package extra;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class AngryBird3 extends Applet implements Runnable {
	private int posi_x, posi_y;
	private boolean move;
	
	public AngryBird3()
	{
		posi_x = 0;
		posi_y = 0;
		move=false;
	}
	
	public void start () {
		setSize(200,620);
		Thread th = new Thread (this);
        th.start();
	}
	public void paint(Graphics g)
	{
		
		if(posi_y>=400) {
			g.setColor(Color.RED);
			g.fillOval(0, posi_y+170, 200, 50);
			
			g.setFont(new Font("Monospaced", 0, 26));
			g.drawString("GAME OVER", 26, 260);
		}
		
		g.setColor(Color.GREEN);
		g.fillRoundRect(40, posi_y, 30, 50, 30, 30);
		g.fillRoundRect(130, posi_y, 30, 50, 30, 30);
		g.setColor(Color.BLACK);
		g.fillRoundRect(50, posi_y+15, 10, 20, 10, 10);
		g.fillRoundRect(140, posi_y+15, 10, 20, 10, 10);
		g.setColor(Color.GREEN);
		g.fillOval(0, posi_y+16, 200, 200);
		g.setColor(Color.WHITE);
		g.fillOval(20, posi_y+80, 36, 36);
		g.fillOval(145, posi_y+80, 36, 36);
		g.setColor(Color.decode("#73FF6C"));
		g.fillOval(64, posi_y+70, 74, 74);
		g.setColor(Color.BLACK);
		if(posi_y>=50 && posi_y < 400) {
			g.fillOval(30, posi_y+104, 10, 10);
			g.fillOval(160, posi_y+104, 10, 10);
		} else if(posi_y>=400) {
			g.drawLine(28, posi_y+88, 48, posi_y+108);
			g.drawLine(48, posi_y+88, 28, posi_y+108);
			g.drawLine(152, posi_y+88, 172, posi_y+108);
			g.drawLine(172, posi_y+88, 152, posi_y+108);
		} else {
			g.fillOval(30, posi_y+94, 10, 10);
			g.fillOval(160, posi_y+94, 10, 10);
		}
		
		if(posi_y>=60 && posi_y < 400) {
			g.drawArc(26, posi_y+60, 22, 15, 10, 160);
			g.drawArc(151, posi_y+60, 22, 15, 10, 160);
		} else {
			g.drawArc(26, posi_y+70, 22, 15, 10, 160);
			g.drawArc(151, posi_y+70, 22, 15, 10, 160);
		}
		g.fillOval(80, posi_y+90, 17, 26);
		g.fillOval(108, posi_y+94, 13, 22);
		g.setColor(Color.RED);
		if(posi_y>=60) {
			g.fillOval(80, posi_y+160, 40, 40);
		} else {
			g.fillOval(90, posi_y+170, 20, 20);
		}
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			try
			{
				if(posi_y<=400)
					posi_y++;
				else
					break;
				repaint();
				Thread.sleep(20);
			}
			catch(InterruptedException ex) {}
			i++;
		}
	}
}
