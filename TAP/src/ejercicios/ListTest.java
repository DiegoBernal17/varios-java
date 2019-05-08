package ejercicios;

import java.awt.*;

public class ListTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("ListTest");
		f.setSize(200,150);
		f.setLayout(new FlowLayout());
		List l = new List(3);
		l.add("Primero");
		l.add("Segundo");
		l.add("Tercero");
		l.add("Cuarto");
		f.add(l);
		f.setVisible(true);
	}

}
