package simulador_banco;

public class Caja 
{
	private int numCaja;
	private boolean disponibilidad;
	private Cliente persona;
	
	public Caja(int nCaja)
	{
		numCaja = nCaja;
		disponibilidad = true;
		persona = null;
	}
	
	public boolean libre()
	{
		return disponibilidad;
	}
	
	public void atender(Cliente cliente)
	{
		persona = cliente;
		disponibilidad = false;
		this.darServicio();
	}
	
	public void darServicio()
	{
		switch(persona.verAccion())
		{
			case "Retirar":
				System.out.println("Retirando...");
			break;
			case "Depositar":
				System.out.println("Depositando...");
			break;
			case "Consultar":
				System.out.println("Consultando...");
			break;
			default:
				System.out.println("Error: Caja darServicio() -> switch: default");
		}
	}
	
	public void desocupar()
	{
		persona.salirDeCaja();
		persona = null;
		disponibilidad = true;
	}
}
