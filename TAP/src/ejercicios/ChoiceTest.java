package ejercicios;
import java.awt.*;

public class ChoiceTest 
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setTitle("ChoiceTest");
		f.setSize(200,150);
		f.setLayout(new FlowLayout());
		Choice cbg = new Choice();
		cbg.add("Rojo");
		cbg.add("Amarillo");
		cbg.add("Blanco");
		f.add(cbg);
		f.setVisible(true);
	}
}
