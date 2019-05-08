import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.applet.Applet;
public class List extends Applet implements ListSelectionListener 
{
	String[] dibujos = {"Gato","Cangrejo","Abeja","Leon","Pulpo"};
	JList list;
		public void init()
	{
		setSize(300,300);
		list = new JList(dibujos);
		add(list);
		list.addListSelectionListener(this);
	}
	Gato g = new Gato();
	Cangrejo n = new Cangrejo();
	Abeja a= new Abeja();
	Leon l = new Leon();
	Pulpo p = new Pulpo();

	public void valueChanged(ListSelectionEvent e)
	{
		if (list.getSelectedValue().toString() == "Gato")
		{
			add(g).setBounds(0, 0, 500, 500);
			g.show();
		}
		else
		{
			g.hide();
		}
		if (list.getSelectedValue().toString() == "Cangrejo")
		{
			add(n).setBounds(0, 0, 500, 500);
			n.show();
		}
		else
		{
			n.hide();
		}
		if (list.getSelectedValue().toString() == "Abeja")
		{
			add(a).setBounds(0, 0, 500, 500);
			a.show();
		}
		else
		{
			a.hide();
		}
		if (list.getSelectedValue().toString() == "Leon")
		{
			add(l).setBounds(0, 0, 600, 600);
			l.show();
		}
		else
		{
			l.hide();
		}
		if (list.getSelectedValue().toString() == "Pulpo")
		{
			add(p).setBounds(0, 0, 500, 500);
			p.show();
		}
		else
		{
			p.hide();
		}
	}
}