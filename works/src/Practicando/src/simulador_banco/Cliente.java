package simulador_banco;

public class Cliente {
	
	private int turno;
	private static String[] acciones = {"Retirar","Depositar","Consultar"};
	private String accion;
	
	/*
	 * Constructor Cliente. Asigna el turno a 0 y llama a otro metodo.
	 */
	public Cliente()
	{
		turno = 0;
		this.asignarAccion();
	}
	
	
	/*
	 * Se encarga de saber a que fue el Cliente al banco
	 * 0 = Retirar dinero
	 * 1 = Depositar en su cuenta
	 * 2 = Consultar cuenta
	 */
	private void asignarAccion()
	{
		int prob = (int)(Math.random() * 5);
		switch(prob)
		{
			case 0:
			case 1:
				accion = acciones[0];
				break;
			case 2:
			case 3:
				accion = acciones[1];
				break;
			case 4:
				accion = acciones[2];
			break;
			default:
				accion = "Error";
		}
		
	}
	
	/*
	 * El Cliente ingresa a cola, es decir se le asigna un turno. 
	 */
	public void hacerCola(int turnoAsignado)
	{
		turno = turnoAsignado;
		this.mostrarCliente();
	    // banco.verColaBanco().entrarACola(this);
	}
	
	
	/*
	 * El Cliente sale de cola y pasa a la caja del banco
	 */
	public void pasarACaja(Caja numCaja)
	{
		System.out.println("pasa a caja el turno: "+turno);
		numCaja.atender(this);
	}
	
	/*
	 * El cliente al haber terminado en la caja sale de ella y en seguida del banco
	 */
	public void salirDeCaja()
	{
		System.out.println("Saliendo de caja.");
	}
	
	public String verAccion()
	{
		return accion;
	}
	
	/*
	 * Muestra la información del cliente
	 */
	public void mostrarCliente()
	{
		System.out.println("Turno: "+turno+" \nAcción: "+accion);
	}
}
