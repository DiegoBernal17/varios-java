package ejercicios;
import java.awt.Frame;
import java.awt.Button;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("ButtonTest");
		f.setSize(200,150);
		f.setLayout(null);
		Button b = new Button("Ok");
		f.add(b);
		f.setVisible(true);
	}
}
