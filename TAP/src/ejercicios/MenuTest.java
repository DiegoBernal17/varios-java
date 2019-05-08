package ejercicios;
import java.awt.*;

public class MenuTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("MenuTest");
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("Menu 1");
		m1.add(new MenuItem("Opción 1"));
		m1.add(new MenuItem("Opción 2"));
		Menu m2 = new Menu("Menu 2");
		m2.add(new CheckboxMenuItem("Opción 1", true));
		m2.add(new CheckboxMenuItem("Opción 2"));
		mb.add(m1);
		mb.add(m2);
		f.setMenuBar(mb);
		f.setSize(200, 150);
		f.setVisible(true);
	}
}