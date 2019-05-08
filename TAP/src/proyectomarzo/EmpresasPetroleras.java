package proyectomarzo;
import java.awt.*;
import java.awt.event.*;

public class EmpresasPetroleras implements MouseListener {
	
	private int color=0;
	
	public MouseListener getML()
	{
		return this;
	}
	
	EmpresasPetroleras(Graphics g)
	{
		g.drawString("Las compañías alegaban no tener fondos para cumplir con el acuerdo pero una investigación determinó que las ganancias de estas empresas permitían saldar sin problema la deuda con los empleados.", 10, 70);
		 /*g.drawLine(572,357,572,336);
		g.drawLine(572,336,586,336);
		g.drawLine(583,336,583,331);
		g.drawLine(583,331,584,331);
		g.drawLine(584,331,584,317);
		g.drawLine(584,317,585,317);
		g.drawLine(585,317,585,312);
		g.drawLine(585,312,586,312);
		g.drawLine(586,312,586,308);
		g.drawLine(586,308,587,308);
		g.drawLine(587,308,587,302);
		g.drawLine(587,302,588,302);
		g.drawLine(588,302,588,298);
		g.drawLine(588,298,589,298);
		g.drawLine(589,298,598,293);*/
		
		 g.setColor(Color.black);
		 
		 /*
		 g.fillRect(676,331,12,4);
		 g.fillRect(680,317,7, 14);
		 g.fillRect(582,280, 107, 13);
		 g.fillRect(632,126, 7, 154);
		 g.fillRect(598,236, 75, 6);
		 g.fillRect(596,188, 79, 9);
		 g.fillRect(613,141,46, 23);
		 g.fillRect(628,135,16, 6);*/
		 
		
		 /*g.drawLine(584,317,589,293);
		 g.drawLine(598,293,593,317);
		 g.drawLine(598,293,676,331);
		 g.drawLine(598,298,676,335);
		 g.drawLine(687,317,683,293);
		 g.drawLine(680,317,675,293);
		 g.drawLine(674,293,593,331);
		 g.drawLine(594,334,677,296);
		 g.drawLine(598,236,604,197);
		 g.drawLine(605,236,610,197);
		 g.drawLine(615,197,673,236);
		 g.drawLine(664,236,607,197);*/
		 
		 /*g.drawLine(657,197,601,236);
		 g.drawLine(609,236,661,197);
		 g.drawLine(673,236,665,197);
		 g.drawLine(669,236,661,197);
		 
		 g.drawLine(592,280,598,242);
		 g.drawLine(572,357,572,336);
		 g.drawLine(604,242,598,280);
		 g.drawLine(592,280,661,242);
		 
		 g.drawLine(603,280,669,242);
		 g.drawLine(673,242,680,280);
		 g.drawLine(675,280,669,242);
		 
		 g.drawLine(680,280,611,242);
		 g.drawLine(604,242,670,280);
		 
		 g.drawLine(605,188,613,154);
		 g.drawLine(612,188,618,164);
		 
		 g.drawLine(656,164,660,188);
		 g.drawLine(666,188,661,164);*/
		 
		 //Torre 2
		 switch(color)
		 {
		 	case 0: g.setColor(Color.black); break;
		 	case 1: g.setColor(Color.red); break;
		 	case 2: g.setColor(Color.white); break;
		 	case 3: g.setColor(Color.yellow); break;
		 	default: g.setColor(Color.DARK_GRAY); break;
		 }
		 
		 g.fillRect(180,511,57,27);
		 g.fillRect(187,504,45,7);
		 g.fillRect(200,488,23,16);
		 g.fillRect(202,475,18,13);
		 
		 g.fillRect(146,462,149,13);
		 
		 g.fillRect(115,455,31,27);
		  
		 //Triangulo
		 g.fillRect(116,451,22,4);
		 g.fillRect(120,446,20,5);
		 g.fillRect(123,440,14,6);
		 g.fillRect(126,435,9,5);
		 g.fillRect(129,431,4,5);
		 g.fillRect(130,429,1,1);
		  
		  
		 //Triangulo
		  g.drawLine(119,453,140,452);
		  g.drawLine(140,452,130,429);
		  g.drawLine(130,429,119,453);
		  
		  g.fillOval(280,474,23,27);
		  
		  g.fillRect(287,499,4,17);
		  g.fillRect(289,516,1,22);
		  g.fillRect(282,538,15,16);
		  
		  g.fillRect(192,611,37,3);
		  g.fillRect(192,590,37,3);
		  g.fillRect(192,562,37,5);
		 
		  g.fillRect(90,618, 205, 27);
		  g.fillRect(229,538, 5,80 );
		  g.fillRect(185,538, 7, 81);
		
		// g.fillRect(632,294,7,42);
	}
	
	public void mouseClicked(MouseEvent eve) 
	{	
		if(color<3)
			color++;
		else
			color=0;
	}

	@Override
	public void mouseEntered(MouseEvent eve) {}

	@Override
	public void mouseExited(MouseEvent eve) {}

	@Override
	public void mousePressed(MouseEvent eve) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
