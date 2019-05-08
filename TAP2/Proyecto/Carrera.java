
public class Carrera
{
    public static void main(String[] args)
    {
        TortugaThread tortuga= new TortugaThread();
        Thread liebre = new Thread(new LiebreThread());
        tortuga.start();
        liebre.start();
    }
}