package practicasu3;

public class Carrera {
	public static void main(String[] args)
	{
		Tortuga tortuga = new Tortuga();
		Thread liebre = new Thread(new Liebre());
		tortuga.start();
		liebre.start();
	}
}
