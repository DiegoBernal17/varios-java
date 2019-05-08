import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
public class Menu extends Applet implements ActionListener 
{
	JMenuItem mi1,mi2,mi3,mi4,mi5;
	JMenuBar mb;
	public void init()
	{
		setSize(300,300);
		mb = new JMenuBar();
		JMenu m1 = new JMenu("Menu 1");
		m1.add(mi1 = new JMenuItem("Gato"));
		m1.add(mi2 = new JMenuItem("Cangrejo"));
		m1.add(mi3 = new JMenuItem("Abeja"));
		JMenu m2 = new JMenu("Menu 2");
		m2.add(mi4 = new JMenuItem("Leon"));
		m2.add(mi5 = new JMenuItem("Pulpo"));
		mb.add(m1);
		mb.add(m2);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		add(mb);
	}
	Gato g = new Gato();
	Cangrejo n  = new Cangrejo();
	Abeja a = new Abeja();
	Leon l = new Leon();
	Pulpo p  = new Pulpo();
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == mi1)
		{
			add(g).setBounds(0,0,500,500);
			g.show();
		}
		if (!(e.getSource() == mi1))
		{
			g.hide();
		}
		if (e.getSource() == mi2)
		{
			add(n).setBounds(0,0,500,500);
			n.show();
		}
		if (!(e.getSource() == mi2))
		{
			n.hide();
		}
		if (e.getSource() == mi3)
		{
			add(a).setBounds(0,0,500,500);
			a.show();
		}
		if (!(e.getSource() == mi3))
		{
			a.hide();
		}
		if (e.getSource() == mi4)
		{
			add(l).setBounds(0,0,600,600);
			l.show();
		}
		if (!(e.getSource() == mi4))
		{
			l.hide();
		}
		if (e.getSource() == mi5)
		{
			add(p).setBounds(0,0,500,500);
			p.show();
		}
		if (!(e.getSource() == mi5))
		{
			p.hide();
		}
	}
}
