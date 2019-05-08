package practicas;

import java.util.Scanner;

class Particula {
	private double tiempo;
	private double velocidad_inicial;
	private double velocidad_final;
	private double aceleracion;
	private double desplazamiento;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "1) Registrar datos\n2) Mostrar los resultados\n3) Salir";
		double v=0, t=0;
		Particula particula = new Particula();
		int opcion;
		boolean datosRegistrados = false;

		do {
			System.out.println(menu);
			opcion = sc.nextInt();

			switch(opcion) {
				case 1:
					do {
						System.out.println("Valor de v: ");
						v = sc.nextDouble();
					} while(v < -100 || v > 100);
					do {
						System.out.println("Valor de t: ");
						t = sc.nextDouble();
					} while(t < 0 || t > 200);
					particula.registrarDatos(v, t);
					datosRegistrados = true;
					System.out.println("Datos registrados.");
				break;
				case 2:
					if(datosRegistrados) {
						//System.out.println("Desplazamiento: "+particula.getDesplazamiento());
						System.out.println(particula.toString());
					}
					else
						System.out.println("Primero debes registrar datos.");
				break;
			}
		} while(opcion != 3);
	}

	public Particula(double velocidad_final, double tiempo) {
		this.tiempo = tiempo;
		this.velocidad_inicial = 0;
		this.velocidad_final = velocidad_final;
		this.calcularAceleracion();
		this.calcularDesplazamiento();
	}

	public Particula() {
		this.tiempo = 0;
		this.velocidad_inicial = 10;
		this.velocidad_final = 0;
		this.aceleracion = 0;
		this.desplazamiento = 0;
	}

	public void registrarDatos(double velocidad_final, double tiempo) {
		this.setVelocidadFinal(velocidad_final);
		this.setTiempo(tiempo);
		this.calcularAceleracion();
		this.calcularDesplazamiento();
	}

	public void calcularAceleracion() {
		this.aceleracion = (this.velocidad_final - this.velocidad_inicial) / tiempo;
	}

	public void calcularDesplazamiento() {
		this.desplazamiento = this.velocidad_inicial * tiempo - 1/2*aceleracion * Math.pow(tiempo, 2);
	}

	public double getDesplazamiento() {
		return this.desplazamiento;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public void setVelocidadFinal(double velocidad_final) {
		this.velocidad_final = velocidad_final;
	}

	public String toString() {
		return "Tiempo: "+this.tiempo
				+"\nVelocidad inicial: "+this.velocidad_inicial
				+"\nVelocidad final: "+this.velocidad_final
				+"\nAceleración: "+this.aceleracion
				+"\nDesplazamiento: "+this.desplazamiento;
	}
}
