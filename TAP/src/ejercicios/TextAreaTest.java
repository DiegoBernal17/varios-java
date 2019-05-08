package ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("TextAreaTest");
		f.setSize(200,150);
		f.setLayout(new FlowLayout());
		TextArea ta = new TextArea("Escribe aquí...", 5, 15);
		f.add(ta);
		f.setVisible(true);
	}
}
