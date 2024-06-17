public class taller2 {
    public static void main(String[] args) {
        Debugging debugging = new Debugging();
        
        System.out.println(debugging.xor(false, false));
        System.out.println(debugging.xor(false, true));
        System.out.println(debugging.xor(true, false));
        System.out.println(debugging.xor(true, true));
        System.out.println("Resultado esperado: false, true, true, false");

        System.out.println(debugging.iguales(new int[0], new int[0]));
        System.out.println(debugging.iguales(new int[]{1,2,3}, new int[]{1,2,3}));
        System.out.println(debugging.iguales(new int[]{1,2,3}, new int[]{1,2,4}));
        System.out.println(debugging.iguales(new int[]{1,2,3}, new int[]{3,2,1}));
        System.out.println(debugging.iguales(new int[]{1,2,3}, new int[]{1,2,3,4}));
        System.out.println(debugging.iguales(new int[]{1,2,3,4}, new int[]{1,2,3}));
        System.out.println("Resultado esperado: true, true, false, false, false, false");

        System.out.println(debugging.todosPositivos(new int[0]));
        System.out.println(debugging.todosPositivos(new int[]{4}));
        System.out.println(debugging.todosPositivos(new int[]{5, 8, 3}));
        System.out.println(debugging.todosPositivos(new int[]{7, 4, 0}));
        System.out.println(debugging.todosPositivos(new int[]{7, -2, 4}));
        System.out.println("Resultado esperado: true, true, true, false, false");

        System.out.println(debugging.maximo(new int[]{0}));
        System.out.println(debugging.maximo(new int[]{1}));
        System.out.println(debugging.maximo(new int[]{4, 8, 10}));
        System.out.println(debugging.maximo(new int[]{40, 8, 10}));
        System.out.println(debugging.maximo(new int[]{40, 80, 10}));
        System.out.println(debugging.maximo(new int[]{-6, -2, -5}));
        System.out.println("Resultado esperado: 0, 1, 10, 40, 80, -2");

        System.out.println(debugging.ordenado(new int[0]));
        System.out.println(debugging.ordenado(new int[]{5}));
        System.out.println(debugging.ordenado(new int[]{7,7,7}));
        System.out.println(debugging.ordenado(new int[]{4,5,6}));
        System.out.println(debugging.ordenado(new int[]{6,20,31,98}));
        System.out.println(debugging.ordenado(new int[]{4,5,4}));
        System.out.println(debugging.ordenado(new int[]{3,2,1}));
        System.out.println(debugging.ordenado(new int[]{8, 14, 12, 25}));
        System.out.println("Resultado esperado: true, true, true, true, true, false, false, false");
    }
}
