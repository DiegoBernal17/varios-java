package extra;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Aplicacion extends Frame implements ActionListener, WindowListener, ItemListener {
	
	private CapturaCalificaciones captura = new CapturaCalificaciones();
	private Button remove, add, info, save, cancel;
	private List alumnos = new List(5, false);
	private Aplicacion nc;
	private TextArea txt_nombre, txt_apellido_paterno, txt_apellido_materno, txt_carrera, txt_noControl, txt_materia1, txt_materia2, txt_materia3;
	
	public static void main(String[] args) {
		Aplicacion m = new Aplicacion();
		m.crearGui();
	}
	
	public void crearGui() {
		this.setTitle("Sistema de calificaciones");
		this.setSize(300, 400);
		this.setLocation(400, 100);
		this.setResizable(false);

		Panel p = new Panel();
		add = new Button("Capturar alumno");
		add.addActionListener(this);
		p.add(add);
		remove = new Button("Borrar");
		remove.addActionListener(this);
		p.add(remove);
		info = new Button("Más Info.");
		info .addActionListener(this);
		p.add(info);
		add("North", p);
		
		actualizarAlumnos();
		alumnos.setFont(new Font("Arial", 10, 16));
		add("Center", alumnos);
		alumnos.addItemListener(this);
		
		nc = new Aplicacion();
		nc.crearGuiNuevoAlumno();

		this.setVisible(true);
		this.addWindowListener(this);
	}
	
	public void crearGuiNuevoAlumno() {
		setLayout(new BorderLayout());
		this.setTitle("Agregar alumno");
		this.setSize(300, 620);
		this.setLocation(100, 20);
		
		Panel newCPanel2 = new Panel();
		Panel newCPanel3 = new Panel();

		Label lbl_name = new Label("Nombre:");
		txt_nombre = new TextArea();
		txt_nombre.setRows(1);
		txt_nombre.setColumns(30);
		newCPanel2.add(lbl_name);
		newCPanel2.add(txt_nombre);

		Label lbl_apellido_paterno = new Label("Apellido Paterno:");
		txt_apellido_paterno = new TextArea();
		txt_apellido_paterno.setRows(1);
		txt_apellido_paterno.setColumns(30);
		newCPanel2.add(lbl_apellido_paterno);
		newCPanel2.add(txt_apellido_paterno);
		
		Label lbl_apellido_materno = new Label("Apellido Materno:");
		txt_apellido_materno = new TextArea();
		txt_apellido_materno.setRows(1);
		txt_apellido_materno.setColumns(30);
		newCPanel2.add(lbl_apellido_materno);
		newCPanel2.add(txt_apellido_materno);
		
		Label lbl_carrera = new Label("Carrera");
		txt_carrera = new TextArea();
		txt_carrera.setRows(1);
		txt_carrera.setColumns(30);
		newCPanel2.add(lbl_carrera);
		newCPanel2.add(txt_carrera);
		
		Label lbl_noControl= new Label("Numero de Control:");
		txt_noControl = new TextArea();
		txt_noControl.setRows(1);
		txt_noControl.setColumns(30);
		newCPanel2.add(lbl_noControl);
		newCPanel2.add(txt_noControl);
		
		Label lbl_materia1 = new Label("Calificación 1:");
		txt_materia1 = new TextArea();
		txt_materia1.setRows(1);
		txt_materia1.setColumns(30);
		newCPanel2.add(lbl_materia1);
		newCPanel2.add(txt_materia1);
		
		Label lbl_materia2= new Label("Calificación 2:");
		txt_materia2 = new TextArea();
		txt_materia2.setRows(1);
		txt_materia2.setColumns(30);
		newCPanel2.add(lbl_materia2);
		newCPanel2.add(txt_materia2);
		
		Label lbl_materia3 = new Label("Calificación 3:");
		txt_materia3 = new TextArea();
		txt_materia3.setRows(1);
		txt_materia3.setColumns(30);
		newCPanel2.add(lbl_materia3);
		newCPanel2.add(txt_materia3);
		
		save = new Button("Guardar Alumno");
		cancel = new Button("Cancelar");
		save.addActionListener(this);
		cancel.addActionListener(this);
		newCPanel3.add(save);
		newCPanel3.add(cancel);
		
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
				captura.eliminar(alumnos.getSelectedItem());
				alumnos.remove(alumnos.getSelectedIndex());
			} catch(Exception ne) {
			}
		} 
		else if(ev.getSource() == info) {
			captura.info(alumnos.getSelectedItem());
		} 
		else if(ev.getSource() == save) {
			captura.agregar (
					txt_nombre.getText(),
					txt_apellido_paterno.getText(),
					txt_apellido_materno.getText(),
					txt_carrera.getText(),
					txt_noControl.getText(),
					txt_materia1.getText(),
					txt_materia2.getText(),
					txt_materia3.getText()
			);
			alumnos.add(txt_nombre.getText()+" "+txt_apellido_paterno.getText()+" "+txt_apellido_materno.getText());
			limpiar();
		} 
		else if(ev.getSource() == cancel) {
			limpiar();
			setVisible(false);
		} else
			System.out.println(ev.getSource()+"\n"+cancel);
	}
	
	public void limpiar()
	{
		txt_nombre.setText("");
		txt_apellido_paterno.setText("");
		txt_apellido_materno.setText("");
		txt_carrera.setText("");
		txt_noControl.setText("");
		txt_materia1.setText("");
		txt_materia2.setText("");
		txt_materia3.setText("");
	}
	
	public void actualizarAlumnos() {
		alumnos.removeAll();
		for(int i=0; i<captura.count(); i++) 
		{
			String[][] alu = captura.getAlumnos();
			alumnos.add(alu[i][0]+" "+alu[i][1]+" "+alu[i][2]);
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowActivated(WindowEvent e) {
		actualizarAlumnos();
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
