

import java.awt.*;
import java.applet.Applet;

public class LiebreThread implements Runnable
{
    public void  run()
    {
        int i =0;
        
        System.out.println("COMIENZA LA LIEBRE");
        while(i<5)
        {
         try
         {
          Thread.sleep(2000);
          System.out.println("LIEBRE");
        }
          catch(InterruptedException ex)
          {
          }
          i++;
        }
        System.out.println("TERMINA LA LIEBRE");
    }
}