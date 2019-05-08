import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FileDialogDemo extends Frame implements WindowListener,ActionListener {
	
	private Button cargarBoton;
	private FileDialog obtenerNombreCuadro;
	private TextField nombreCampo;
	public static void main(String[] args)
	{
		
		FileDialogDemo demo = new FileDialogDemo();
		demo.setSize(500, 400);
		demo.crearGui();
		demo.setVisible(true);
	}
	private void crearGui() {
		setLayout(new FlowLayout());
		cargarBoton = new Button("cargar");
		add(cargarBoton);
		cargarBoton.addActionListener(this);
		nombreCampo = new TextField(30);
		add(nombreCampo);
		addWindowListener(this);
		
	}
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent evt)
	{
		String nombreArchivo;
		if(evt.getSource()== cargarBoton)
		{
			obtenerNombreCuadro = new FileDialog(this,"obtener",FileDialog.LOAD);
			obtenerNombreCuadro.show();
			nombreArchivo = obtenerNombreCuadro.getFile();
			nombreCampo.setText(nombreArchivo);
		}
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
