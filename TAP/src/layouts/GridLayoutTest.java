package layouts;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setTitle("GridLayoutTest");
		f.setSize(300, 150);
		f.setLayout(new GridLayout(2,3,2,2));
		f.add(new Button("Button 1"));
		f.add(new Button("Button 2"));
		f.add(new Button("Button 3"));
		f.add(new Button("Button 4"));
		f.add(new Button("Button 5"));
		f.setVisible(true);
		
	}
}
