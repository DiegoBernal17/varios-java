package proyectou4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;


public class Aplicacion extends Frame implements ActionListener, WindowListener, ItemListener {
	
	private Agenda miAgenda = new Agenda();
	private Button remove, add, search, save, cancel;
	private List contactos = new List(5, false);
	private Aplicacion nc;
	private TextArea txt_name, txt_number;

	public static void main(String[] args) {
		Aplicacion m = new Aplicacion();
		m.crearGui();
	}
	
	public void crearGui() {
		this.setTitle("Agenda Telefonica");
		this.setSize(300, 400);
		this.setLocation(400, 100);
		this.setResizable(false);

		Panel p = new Panel();
		add = new Button("Agregar nuevo");
		add.addActionListener(this);
		p.add(add);
		remove = new Button("Borrar");
		remove.addActionListener(this);
		p.add(remove);
		//search = new Button("Buscar");
		//search.addActionListener(this);
		//p.add(search);
		add("North", p);
		
		actualizarContactos();
		contactos.setFont(new Font("Arial", 10, 16));
		add("Center", contactos);
		contactos.addItemListener(this);
		
		nc = new Aplicacion();
		nc.crearGuiNuevoContacto();

		this.setVisible(true);
		this.addWindowListener(this);
	}
	
	public void crearGuiNuevoContacto() {
		setLayout(new BorderLayout());
		this.setTitle("Agregar contacto");
		this.setSize(300, 250);
		this.setLocation(100, 100);
		
		Panel newCPanel1 = new Panel();
		Panel newCPanel2 = new Panel();
		Panel newCPanel3 = new Panel();

		Label lbl_name = new Label("Nombre: ");
		txt_name = new TextArea();
		txt_name.setRows(3);
		txt_name.setColumns(30);
		newCPanel1.add(lbl_name);
		newCPanel1.add(txt_name);

		Label lbl_number = new Label("Número: ");
		txt_number = new TextArea();
		txt_number.setRows(2);
		txt_number.setColumns(30);
		newCPanel2.add(lbl_number);
		newCPanel2.add(txt_number);
		
		save = new Button("Guardar Contacto");
		cancel = new Button("Cancelar");
		save.addActionListener(this);
		cancel.addActionListener(this);
		newCPanel3.add(save);
		newCPanel3.add(cancel);
		
		add(newCPanel1, BorderLayout.NORTH);
		add(newCPanel2, BorderLayout.CENTER);
		add(newCPanel3, BorderLayout.SOUTH);
		
		 addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				setVisible(false);
			 }
		 });
	}

	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource() == add){
			nc.setVisible(true);
		} 
		else if(ev.getSource() == remove) {
			try {
				String cadena = contactos.getSelectedItem();
				String[] num = cadena.split("> ");
				miAgenda.remove(num[1]);
				contactos.remove(contactos.getSelectedIndex());
			} catch(NullPointerException ne) {
				JOptionPane.showMessageDialog(null, "Selecciona un contacto");
			}
		} 
		else if(ev.getSource() == search) {
			
		} 
		else if(ev.getSource() == save) {
			miAgenda.add(txt_name.getText(), txt_number.getText());
			contactos.add(txt_name.getText()+" > "+txt_number.getText());
			txt_name.setText("");
			txt_number.setText("");
		} 
		else if(ev.getSource() == cancel) {
			txt_name.setText("");
			txt_number.setText("");
			setVisible(false);
		} else
			System.out.println(ev.getSource()+"\n"+cancel);
	}
	
	public void actualizarContactos() {
		contactos.removeAll();
		for(int i=0; i<miAgenda.count(); i++) 
		{
			String[][] contacts = miAgenda.getContacts();
			contactos.add(contacts[i][1]+" > "+contacts[i][0]);
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowActivated(WindowEvent e) {
		actualizarContactos();
	}

	public void windowClosed(WindowEvent e) {}

	public void windowDeactivated(WindowEvent e) {}

	public void windowDeiconified(WindowEvent e) {}

	public void windowIconified(WindowEvent e) {}

	public void windowOpened(WindowEvent e) {
	}

	public void itemStateChanged(ItemEvent e) {
		
	}
}
