package ejercicios;
import java.awt.*;

public class TextFieldTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("TextFieldTest");
		f.setSize(200, 150);
		f.setLayout(new FlowLayout());
		TextField tf = new TextField("Escribe aquí...");
		f.add(tf);
		f.setVisible(true);
	}

}
