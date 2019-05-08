package ejercicios;
import java.awt.*;

public class LabelTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("LabelTest");
		f.setSize(200,150);
		f.setLayout(new FlowLayout());
		Label l1 = new Label("Una etiqueta");
		Label l2 = new Label();
		l2.setText("Otra etiqueta");
		f.add(l1);
		f.add(l2);
		f.setVisible(true);
	}

}
