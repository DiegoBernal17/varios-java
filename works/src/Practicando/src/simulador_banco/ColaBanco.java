package simulador_banco;

public class ColaBanco {
	
	private Cliente[] cola;
	private Cliente[] colaTemporal;
	
	/*
	 *  Constructor que crea una cola con 0 clientes
	 */
	public ColaBanco()
	{
		cola = new Cliente[0];
		colaTemporal = new Cliente[0];
	}
	
	/*
	 * Mete a un Cliente al final de la cola
	 */
	public void entrarACola(Cliente cliente) 
	{
		if(cola.length > 0)
		{
			colaTemporal = new Cliente[cola.length];
			System.arraycopy(cola, 0, colaTemporal, 0, cola.length);
		
			cola = new Cliente[colaTemporal.length+1];
			System.arraycopy(colaTemporal, 0, cola, 0, colaTemporal.length);
			cola[cola.length-1] = cliente;
		} 
		else
		{
			cola = new Cliente[1];
			cola[0] = cliente;
		}
	}
	
	/*
	 * Saca al primer cliente que se encuentre en la cola
	 */
	public Cliente salirDeCola() 
	{	
		if(!this.vacia())
		{
			colaTemporal = new Cliente[cola.length];
			System.arraycopy(cola, 0, colaTemporal, 0, cola.length);
		
			cola = new Cliente[colaTemporal.length-1];
			System.arraycopy(colaTemporal, 1, cola, 0, cola.length);
			return colaTemporal[0];
		}
		throw new NullPointerException("No hay clientes en la cola del banco. salirDeCola()");
	}
	
	/*
	 * Muestra en consola los clientes en cola
	 */
	public void mostrarCola()
	{
		String message = "";
		for(int i=0; i<cola.length;i++)
			message += i+": "+cola[i]+"\n";
		
		System.out.println(message);
	}
	
	public boolean vacia()
	{
		if(cola.length > 0)
			return false;
		return true;
	}

}
