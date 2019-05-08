package ejercicios;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.FlowLayout;

public class CheckboxTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("Checkbox tex");
		f.setSize(200,150);
		f.setLayout(new FlowLayout());
		Checkbox c = new Checkbox("Mayor de 18 años");
		f.add(c);
		f.setVisible(true);
	}

}
