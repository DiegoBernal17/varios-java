package layouts;
import java.awt.*;

public class FlowLayoutTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setTitle("FlowLayoutTest");
		f.setSize(300,150);
		f.setLayout(new FlowLayout());
		Button b1 = new Button("Button 1");
		f.add(b1);
		Button b2 = new Button("Button 2");
		f.add(b2);
		Button b3 = new Button("Button 3");
		f.add(b3);
		f.setVisible(true);
	}

}
