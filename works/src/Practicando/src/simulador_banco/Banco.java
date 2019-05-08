package simulador_banco;

public class Banco {
	
	private int tiempoAbierto;
	private int tiempoTranscurrido;
	private int cajasAbiertas;
	private int totalCajas; // <- PENDIENTE
	private int turnoActual;
	private Caja[] cajas;
	private ColaBanco cola;
	private boolean colaAbierta;
	
	public Banco()
	{
		totalCajas = 8; // PENDIENTE
		turnoActual = 0;
		tiempoTranscurrido = 0;
	}
	
	public void abrirBanco(int tAbrir, int cAbiertas)
	{
		tiempoAbierto = tAbrir;
		cajasAbiertas = cAbiertas;
		cola = new ColaBanco();
		colaAbierta = true;
		this.abrirCajas();
		this.correrProcesos();
	}
	
	public void abrirCajas()
	{
		cajas = new Caja[cajasAbiertas];
		for(int i=0; i<cajasAbiertas; i++)
		{
			cajas[i] = new Caja(i);
		}
	}
	
	public void correrProcesos()
	{
		if(tiempoAbierto > tiempoTranscurrido)
		{
			try
			{
				if(this.verDisponibilidad() > 0 && !cola.vacia())
				{
					avanzaPersona();
				}
			} catch(Exception ignored) {}
			
			int entradaSalida = (int)(Math.random() * 4);
			
			switch(entradaSalida)
			{
				case 0: 
				case 1:
				case 2:
					if(colaAbierta)
					{
						System.out.println("llega persona");
						this.llegaPersona();
					}
					break;
				case 3:
					this.salePersona();
			}
			
			// Pausa la ejecución un segundo
			try { 
				Thread.sleep(2000); 
			} catch (Exception ignored) {} 
			
			// Aumenta el contador un segundo más
			if(colaAbierta)
				tiempoTranscurrido++;
			else
			{
				if(cola.vacia() && this.verDisponibilidad() == cajas.length)
				{
					System.out.println("Banco cerrado.");
					return;
				}
			}
			
			this.correrProcesos();
		}
		else
		{
			this.cerrarBanco();
		}
	}
	
	public void cerrarBanco()
	{
		System.out.println("Cerrando banco...");
		colaAbierta = false;
		tiempoTranscurrido = 0;
		this.correrProcesos();
	}
	
	public void llegaPersona()
	{
		Cliente persona = new Cliente();
		persona.hacerCola(this.darTurno());
		cola.entrarACola(persona);
	}
	
	public void avanzaPersona()
	{
		if(this.verDisponibilidad() > 0)
		{
			try
			{
				Cliente persona = cola.salirDeCola();
				persona.pasarACaja(this.cajaDisponible());
			} catch(Exception e) {
				System.out.println("No hay cajas vacías: "+e);
			}
		}
	}
	
	public void salePersona()
	{
		int numCaja = (int)(Math.random() * cajasAbiertas);
		for(int i=0; i<cajas.length; i++)
		{
			if(!cajas[numCaja].libre())
			{
				cajas[numCaja].desocupar();
				return;
			}
		}
		System.out.println("No hay cajas ocupadas a desocupar.");
	}
	
	public int darTurno()
	{
		return ++turnoActual;
	}
	
	public int verDisponibilidad()
	{
		int contador = 0;
		for(int i=0; i<cajas.length; i++)
		{
			if(cajas[i].libre())
				contador++;
		}
		return contador;
	}
	
	public Caja cajaDisponible() throws Exception
	{
		for(int i=0; i<cajas.length; i++)
		{
			if(cajas[i].libre())
				return cajas[i];
		}
		throw new Exception("Error > No hay cajas disponibles");
	}
	
	
	public ColaBanco verColaBanco()
	{
		return cola;
	}
}
