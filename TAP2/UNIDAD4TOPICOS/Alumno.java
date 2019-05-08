
    public class  Alumno
    {  
        private string nombre;
        private int numControl;
        private float calif1 , calif2;
        
        
    }
    
    public Alumno ()
    {
        
        nombre = "";
        numControl= 0;
        calif1 = 0.0;
        calif2 = 0.0;
           
    }
    
    public Alumno(String n , int nc ,double c1, double c2)
    {
        nombre = n ;
        numControl = nc;
        calif1 = c1;
        calif2 = c2;
    } 
        
         public  void setNombre(String nuevoNombre)  
           
           {
    	   nombre = nuevoNombre;
    	   
           }
           
    	    public void setCalif1(float nuevoCalificacion1)
    	    {
    	    	calif1 = nuevoCalificacion1;
    	    }
    	    
    	 	
    	    public void setCalif2(float nuevoCalif2)
    	    	
    	    {
    	    	calif2 = nuevoCalificacion2;
    	    }
    	    
    	    
    	    public String getNombre()
    	    {
    	    	return nombre;
    	    }
    	    
    
    	    public float getCalif1()
    	    {
    	    	return calificacion1;
    	    	
    	    }
    	    
    	    
    	    public float  getCalif2()
    	    {
    	    	return calificacion2;
    	    }
    	    
    	    
    	    public float getCalificacion3()
    	    {
    	    	return calificacion3;
    	    }
    
