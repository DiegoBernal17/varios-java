package simulador_banco;

import java.util.Timer;
import java.util.TimerTask;
 
public class Reloj {
 
	Timer timer = new Timer(); // El timer que se encarga de administrar los tiempo de repeticion
	public int segundos; // manejar el valor del contador
	public boolean frozen; // manejar el estado del contador TIMER AUTOMATICO -- True Detenido | False Corriendo
 
	// clase interna que representa una tarea, se puede crear varias tareas y asignarle al timer luego
	class MiTarea extends TimerTask {
		public void run() {
			segundos++;
			System.out.println(segundos);
			// aqui se puede escribir el codigo de la tarea que necesitamos ejecutar
		}// end run()
	}// end SincronizacionAutomatica
 
	public void Start(int pSeg) throws Exception {
		frozen = false;
		// le asignamos una tarea al timer
		timer.schedule(new MiTarea(), 0, pSeg * 1000 * 60);
	}// end Start
 
	public void Stop() {
		System.out.println("Stop");
		frozen = true;
	}// end Stop
 
    public void Reset() {
		System.out.println("Reset");
		frozen = true;
		segundos = 0;
	}// end Reset
 
}// end Reloj
