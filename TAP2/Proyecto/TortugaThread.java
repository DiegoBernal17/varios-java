import java.awt.*;
import java.applet.Applet;

public class TortugaThread extends Thread
{
    public void  run()
    {
        int i =0;
        
        System.out.println("COMIENZA LA TORTUGA");
        while(i<5)
        {
         try
         {
          Thread.sleep(5000);
          System.out.println("Tortuga");
        }
          catch(InterruptedException ex)
          {
          }
          i++;
        }
        System.out.println("TERMINA LA TORTUGA");
    }
}