class Funciones {

    int cuadrado(int x) {
        return x * x;
    }

    double distancia(double x, double y) { // pitagoras
        return (double) Math.sqrt(x * x + y * y);
    }

    boolean esPar(int n) {
        return n % 2 == 0;
    }

    boolean esBisiesto(int n) {
        if ((n % 4 == 0 & n % 100 != 0) || n % 400 == 0)
            return true;
        return false;
    }

    int factorialIterativo(int n) {
        int total = 1;
        for(int i = 1; i <=n; i++){
            total = total *i;
        }
        return total;
    }

    int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }

    boolean esPrimo(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    int sumatoria(int[] numeros) {
        int sumatTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatTotal += numeros[i];
        }
        return sumatTotal;

    }

    int busqueda(int[] numeros, int buscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                return i;
            }
        }
        return -1;

    }
    boolean tienePrimo(int[] numeros) {
        for(int i=0; i<numeros.length;i++){
            if(esPrimo(numeros[i]) == true){
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1) {
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(s1.length() - i - 1) != s2.charAt(s2.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
