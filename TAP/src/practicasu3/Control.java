package practicasu3;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class Control extends JFrame implements ActionListener {
	 int IncX=1;
	 int IncY=1;
	 boolean salir = false;
	 Button disminuir, aumentar, suspender, terminar;
	 
	 /** Creates new form Control */
	 public Control() {
		 this.setLayout(new FlowLayout());
		 this.setTitle("Control de hilos");
		 this.setSize(420, 420);
		// f.setLocation(100, 50);
		 //f.setVisible(true);
		 disminuir = new Button("Disminuir");
		 aumentar = new Button("Aumentar");
		 suspender = new Button("Suspender");
		 terminar = new Button("Terminar");
		 add(disminuir);
		 add(aumentar);
		 add(suspender);
		 add(terminar);
		 disminuir.addActionListener(this);
		 aumentar.addActionListener(this);
		 suspender.addActionListener(this);
		 terminar.addActionListener(this);
	 }

	private void SuspenderActionPerformed(java.awt.event.ActionEvent evt) 
	{
		 IncX=0;
		 IncY=0;
	 }

	 private void AumentarActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		 IncX+=1;
		 IncY+=1;
		 if (IncX > 10) IncX = 10;
		 if (IncY > 10) IncY = 10;
	 }

	 private void DisminuirActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		 IncX-=1;
		 IncY-=1;
		 if (IncX < -10) IncX = -10;
		 if (IncY < -10) IncY = -10;
	 }

	 private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {
		 salir = true;
	 }

	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource() == suspender)
			this.SuspenderActionPerformed(ev);
		else if(ev.getSource() == aumentar)
			this.AumentarActionPerformed(ev);
		else if(ev.getSource() == disminuir)
			this.DisminuirActionPerformed(ev);
		else if(ev.getSource() == terminar)
			this.TerminarActionPerformed(ev);
	}
}