package proyecto1;

/**
 * Write a description of class metodosDeOrdenamiento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class metodosDeOrdenamiento
{

public static void burbuja(int[] x){
        int temp;
        for(int i=1;i < x.length;i++){
            for (int j=0 ; j < x.length- 1; j++){
                if (x[j] > x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }
    public static void burbujaConSenal(int[] x){
     int temp,tmp[];
     boolean hasChanged=true;
        for(int i=1;i < x.length && hasChanged;i++){
            tmp=x;
            hasChanged=false;
            for (int j=0 ; j < x.length- 1; j++){
                if (x[j] > x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                    hasChanged=true;
                }
            }
        }
    }
  public static void shakerSort(int[] v) {
        final int N = v.length;
        int limInferior = 0;
        int limSuperior = N-1;
        while(limInferior <= limSuperior) {
            for(int j=limInferior; j<limSuperior; j++) {
                if(v[j]>v[j+ 1]) {
                    int tmp = v[j];
                    v[j]    = v[j+1];
                    v[j+1]  = tmp;
                }
            }
            limSuperior--;
            for(int j=limSuperior;j>limInferior; j--) {
                if(v[j]<v[j-1]) {
                    int tmp = v[j];
                    v[j]    = v[j-1];
                    v[j-1]  = tmp;
                }
            }
            limInferior++;
        }
    }
    public static void Insercion (int[] x) {
      for (int i=1; i < x.length; i++) {
         int aux = x[i];
         int j;
         for (j=i-1; j >=0 && x[j] > aux; j--){
              x[j+1] = x[j];
          }
         x[j+1] = aux;
      }
   }
   public static void seleccionDirecta(int[]x){
        int i, k, p, buffer, limite = x.length-1;
        for(k = 0; k < limite; k++){
            p = k;
            for(i = k+1; i <= limite; i++){
                if(x[i] < x[p])
                p = i;
                if(p != k){
                    buffer = x[p];
                    x[p] = x[k];
                    x[k] = buffer;
                }
            }
        }
    }

    public static void mergesort(int[ ] matrix, int init, int n){
        int n1;
        int n2;
        if (n > 1){
            n1 = n / 2;
            n2 = n - n1;
            mergesort(matrix, init, n1);
            mergesort(matrix, init + n1, n2);
            merge(matrix, init, n1, n2);
       }
    }

    private static void merge(int[ ] matrix, int init, int n1, int n2){
        int[ ] buffer = new int[n1+n2];
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        int i;
        while ((temp1 < n1) && (temp2 < n2)){
            if (matrix[init + temp1] < matrix[init + n1 + temp2]){
                buffer[temp++] = matrix[init + (temp1++)];
            }else{
                buffer[temp++] = matrix[init + n1 + (temp2++)];
            }
        }
        while (temp1 < n1){
            buffer[temp++] = matrix[init + (temp1++)];
        }
        while (temp2 < n2){
            buffer[temp++] = matrix[init + n1 + (temp2++)];
        }
        for (i = 0; i < n1+n2; i++){
            matrix[init + i] = buffer[i];
        }
    }

    public static void ordenacionMonticulos(int[] v) {
        final int N = v.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = v[0];
            v[0]    = v[nodo];
            v[nodo] = tmp;
            hacerMonticulo(v, 0, nodo-1);
        }
    }

    public static void hacerMonticulo(int[] v, int nodo, int fin) {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        if(v[nodo] < v[may]) {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp;
            hacerMonticulo(v, may, fin);
        }
    }

    public static void radixSort(int[] arr){
        if(arr.length == 0)
            return;
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k=0;k<4;k++){
            for(i=0;i<(np.length-1);i++)
                np[i][1] = i+1;
            np[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<arr.length;i++){
                j = ((0xFF<<(k<<3))&arr[i])>>(k<<3);
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(np[l][1] != -1)
                        l = np[l][1];
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                    arr[j++] = np[l][0];
        }
    }

    public void shellSort(int[] x)
    {
        for ( int increment = x.length / 2; increment > 0; increment =
                (increment == 2 ? 1 : (int) Math.round(increment / 2.2)))
        {
            for (int i = increment; i < x.length; i++)
            {
                for (int j = i; j >= increment && x[j - increment] >
                        x[j]; j -= increment)
                {
                    int temp = x[j];
                    x[j] = x[j - increment];
                    x[j - increment] = temp;
                }
            }
        }
    }




}