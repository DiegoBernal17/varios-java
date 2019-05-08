package proyecto1;

public class metodosDeBusqueda {
	public static  int busquedaSecuencial(int []arreglo,int dato){
		 int posicion = -1;
		  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
		      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
		    posicion = i;//Si es verdadero guardamos la posicion
		    break;//Para el ciclo
		   }
		 }
		 return posicion;
		}
	public static int busquedaBinaria(int  vector[], int dato){
			  int n = vector.length;
			  int centro,inf=0,sup=n-1;
			   while(inf<=sup){
			     centro=(sup+inf)/2;
			     if(vector[centro]==dato) return centro;
			     else if(dato < vector [centro] ){
			        sup=centro-1;
			     }
			     else {
			       inf=centro+1;
			     }
			   }
			   return -1;
			 }
}
