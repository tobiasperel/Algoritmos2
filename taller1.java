public class taller1 {
    public static void main(String[] args) {
    Funciones funciones = new Funciones();
        // System.out.println(funciones.cuadrado(0)); // 0
        // System.out.println(funciones.cuadrado(2));
        // System.out.println(funciones.cuadrado(3));
        // System.out.println("valores Esperados: 0, 4, 9");
        // System.out.println(funciones.distancia(0, 0));
        // System.out.println(funciones.distancia(3, 4));
        // System.out.println(funciones.distancia(1, 1));
        // System.out.println(funciones.distancia(7, 4));
        // System.out.println("valores Esperados: 0, 5, 1.41421356237, 8.0622577483");
        // System.out.println(funciones.esPar(0));
        // System.out.println(funciones.esPar(-2));
        // System.out.println(funciones.esPar(8));
        // System.out.println(funciones.esPar(14));

        // System.out.println(funciones.esPar(1));
        // System.out.println(funciones.esPar(-7));
        // System.out.println(funciones.esPar(33));
        // System.out.println("valores Esperados: true, true, true, true, false, false, false");
        // System.out.println(funciones.esBisiesto(2024));
        // System.out.println(funciones.esBisiesto(2012));
        // System.out.println(funciones.esBisiesto(2000));
        // System.out.println(funciones.esBisiesto(2023));
        // System.out.println(funciones.esBisiesto(2014));
        // System.out.println(funciones.esBisiesto(2100));
        // System.out.println("valores Esperados: true, true, true, false, false, false");
        System.out.println(funciones.factorialIterativo(0));
        System.out.println(funciones.factorialIterativo(1));
        System.out.println(funciones.factorialIterativo(2));
        System.out.println(funciones.factorialIterativo(5));
        System.out.println(funciones.factorialIterativo(10));
        System.out.println("valores Esperados: 1, 1, 2, 120, 3628800");
        System.out.println(funciones.factorialRecursivo(0));
        System.out.println(funciones.factorialRecursivo(1));
        System.out.println(funciones.factorialRecursivo(2));
        System.out.println(funciones.factorialRecursivo(5));
        System.out.println(funciones.factorialRecursivo(10));
        System.out.println("valores Esperados: 1, 1, 2, 120, 3628800");
        System.out.println(funciones.esPrimo(0));
        System.out.println(funciones.esPrimo(1));
        System.out.println(funciones.esPrimo(4));
        System.out.println(funciones.esPrimo(49));
        System.out.println(funciones.esPrimo(2));
        System.out.println(funciones.esPrimo(3));
        System.out.println(funciones.esPrimo(17));
        System.out.println("valores Esperados: false, false, false, false, true, true, true");
        System.out.println(funciones.sumatoria(new int[]{}));
        System.out.println(funciones.sumatoria(new int[]{0,1,2,3,4,5}));
        System.out.println(funciones.sumatoria(new int[]{2,3,5}));
        System.out.println(funciones.sumatoria(new int[]{5, -25, 4, 8}));
        System.out.println("valores Esperados: 0, 15, 10, -8");
        System.out.println(funciones.busqueda(new int[]{1, 2, 3}, 1));
        System.out.println(funciones.busqueda(new int[]{10, 11, 15, 24}, 15));
        System.out.println(funciones.busqueda(new int[]{10, 11, 15, 24}, 24));
        System.out.println("valores Esperados: 0, 2, 3");
        System.out.println(funciones.tienePrimo(new int[]{1,4,6,15}));
        System.out.println(funciones.tienePrimo(new int[]{7,4,6,15}));
        System.out.println(funciones.tienePrimo(new int[]{1,4,7,15}));
        System.out.println(funciones.tienePrimo(new int[]{1,4,6,7}));
        System.out.println(funciones.tienePrimo(new int[]{2, 5, 11}));
        System.out.println("valores Esperados: false, true, true, true, true");
        System.out.println(funciones.todosPares(new int[]{6, 2, 14, 20}));
        System.out.println(funciones.todosPares(new int[]{3, 2, 14, 20}));
        System.out.println(funciones.todosPares(new int[]{6, 3, 14, 20}));
        System.out.println(funciones.todosPares(new int[]{6, 2, 14, 7}));
        System.out.println("valores Esperados: true, false, false, false");
        System.out.println(funciones.esPrefijo("abcde", "abcde"));
        System.out.println(funciones.esPrefijo("abcde", "abcdefg"));
        System.out.println(funciones.esPrefijo("abcde", "bcdefg"));
        System.out.println(funciones.esPrefijo("abcde", "abcdfg"));
        System.out.println(funciones.esPrefijo("abcde", "abc"));
        System.out.println("valores Esperados: true, true, false, false, false");
        System.out.println(funciones.esSufijo("edcba", "edcba"));
        System.out.println(funciones.esSufijo("edcba", "gfedcba"));
        System.out.println(funciones.esSufijo("edcba", "gfedcb"));
        System.out.println(funciones.esSufijo("edcba", "gfdcba"));
        System.out.println(funciones.esSufijo("edcba", "cba"));
        System.out.println("valores Esperados: true, true, false, false, false");


    }
}