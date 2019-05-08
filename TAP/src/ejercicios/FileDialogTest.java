package ejercicios;

import java.awt.Frame;
import java.awt.FileDialog;

public class FileDialogTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200, 150);
		f.setVisible(true);
		
		FileDialog d = new FileDialog(f);
		d.setTitle("FileDialogTest");
		d.setBounds(50,50,70,50);
		d.setVisible(true);
		System.out.println(d.getFile());
	}

}
