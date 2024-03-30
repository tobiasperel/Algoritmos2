public class taller2 {
    public static void main(String[] args) {
        Debugging debugging = new Debugging();
        
        System.out.println(debugging.xor(false, false));
        System.out.println(debugging.xor(false, true));
        System.out.println(debugging.xor(true, false));
        System.out.println(debugging.xor(true, true));
        System.out.println("Resultado esperado: false, true, true, false");
        System.out.println(debugging.iguales(null,null));
        System.out.println(debugging.iguales(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(debugging.iguales(new int[]{1, 2, 3}, new int[]{1, 2, 3,4,5}));
        System.out.println(debugging.iguales(new int[]{1,2,3,4}, new int []{1,2}));
        System.out.println("Resultado esperado: true, true, false,false");
        System.out.println(debugging.todosPositivos(null));
        System.out.println(debugging.todosPositivos(new int[]{1, 2, 3}));
        System.out.println(debugging.todosPositivos(new int[]{1, 2, -3}));
        System.out.println("Resultado esperado: false, true, false");
        System.out.println(debugging.maximo(new int[]{8, 22, -4, 92, 5}));
        System.out.println(debugging.maximo(new int[]{8, 22, 4, 2, 5}));
        System.out.println(debugging.maximo(new int[]{-8,-10}));
        System.out.println("Resultado esperado: 92, 22, -8");
        System.out.println(debugging.ordenado(null));
        System.out.println(debugging.ordenado(new int[]{3, 2, 3, 4, 5}));
        System.out.println(debugging.ordenado(new int[]{1, 2, 2, 4, 5}));
        System.out.println("Resultado esperado: false, false, true");

    }
}
