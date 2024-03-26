public class taller2 {
    public static void main(String[] args) {
        Debugging debugging = new Debugging();
        
   
    
        System.out.println(debugging.xor(false, true));
        System.out.println(debugging.iguales(new int[]{1, 2, 3}, new int[]{1, 2, 3,4,5}));
        System.out.println(debugging.todosPositivos(new int[]{1, 2, 3, -4, 5}));
        System.out.println(debugging.maximo(new int[]{8, 22, -4, 92, 5}));
        System.out.println(debugging.ordenado(new int[]{3, 2, 3, 4, 5}));
    }
}
