package ejercicios;
import java.awt.Dialog;
import java.awt.Frame;

public class DialogTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200, 150);
		f.setVisible(true);
		
		Dialog d = new Dialog(f);
		d.setTitle("DialogTest");
		d.setBounds(50,50,70,50);
		d.setVisible(true);
	}
}
