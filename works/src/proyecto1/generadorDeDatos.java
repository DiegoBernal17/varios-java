package proyecto1;

public class generadorDeDatos
{
    public static  void mejorCaso (int [] arreglo){
        for(int i=0 ; i<arreglo.length ; i++){
            arreglo[i] = i;
        }
    }

    public static void peorCaso (int [] arreglo){
        for(int i=0 ; i<arreglo.length ; i++){
            arreglo[i] = arreglo.length-i-1;
        }
    }

    public static void casoPromedio (int [] arreglo){
        for(int i=0 ; i<arreglo.length ; i++){
            arreglo[i] = (int) (Math.random() * arreglo.length + 1);
        }
    }

    public static void casoMixto (int [] arreglo, int porcentaje){
        int hasta;
        if(porcentaje <= 90 && porcentaje >= 10)
            hasta = porcentaje/(arreglo.length * 100);
        else
            hasta = arreglo.length/2-1;
        for(int i=0 ; i<hasta ; i++){
            arreglo[i] = i+1;
        }
        for(int i=hasta; i<arreglo.length; i++){
            arreglo[i] = (int) (Math.random() * arreglo.length + 1);
        }
    }
}

