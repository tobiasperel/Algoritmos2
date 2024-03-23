public class Funciones {

    public static int cuadrado(int n) {
        return n*n;
    }
    public static float distancia(float x, float y) { // pitagoras
        return (float) Math.sqrt(x*x + y*y);
    }
    public static boolean EsPar(int n) {
        return n%2 == 0;
    }
    public static boolean esBisiesto(int n) {
        if((n%4==0 & n%100!=0) || n%400==0 )
            return true;
        return false;
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n *factorial(n-1);
    } 
    public static boolean esPrimo(int n){
        if (n == 1 ){
            return false;
        }
        for(int i =2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // public static boolean esPrimo(int n) {
    //     boolean[] esPrimo = new boolean[n+1];
    //     Arrays.fill(esPrimo, true);
    //     esPrimo[0] = esPrimo[1] = false;
    
    //     for (int i = 2; i * i <= n; i++) {
    //         if (esPrimo[i]) {
    //             for (int j = i * i; j <= n; j += i) {
    //                 esPrimo[j] = false;
    //             }
    //         }
    //     }
    
    //     return esPrimo[n];
    // } 
    public static int sumatoria(int [] numeros){
        int sumatTotal =0;
        for (int i=0; i<numeros.length;i++){
            sumatTotal += numeros[i];
        }
        return sumatTotal;

    }
    public static int busqueda(int[] secuencia, int numeroABuscar){
        for(int i=0; i<secuencia.length;i++){
            if (secuencia[i] == numeroABuscar){
                return i;
            }
        }
        return -1;

    }
    public static boolean todosPares(int [] numeros){
        for(int i=0;i<numeros.length;i++){
            if (numeros[i]%2 ==1){
                return false;
            }
        }
        return true;
    }
    public static boolean esPrefijo(String a, String b){
        if(a.length() >b.length()){
            return false;
        }        
        for(int i=0; i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean esSufijo(String a, String b){
        if(a.length() >b.length()){
            return false;
        }        
        for(int i=0; i<a.length();i++){
            if(a.charAt(a.length()-i-1) != b.charAt(b.length()-i-1)){
                return false;
            }
        }
        return true;
    }


}


