//package aed;

public class taller3 {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(10, 6);
        // System.out.println(fecha.mes());
        // System.out.println(fecha.dia());
        // Fecha fecha2 = new Fecha(10, 6);
        // System.out.println(fecha2.toString());
        // Fecha f = new Fecha(6, 10);
        // Fecha f2 = new Fecha(6, 10);
        // Fecha f3 = new Fecha(7, 10);
        // Fecha f4 = new Fecha(6, 11);
        // String fstring = "6/10";
        // if (f.equals(f2)) {
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // if (f.equals(f3)) {
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // if (f.equals(f4)) {
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // if (f.equals(fstring)) {
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // if (fstring.equals(f)) {
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // Fecha f9 = new Fecha(28, 6);
        // f9.incrementarDia();
        // if(f9.dia() == 29 && f9.mes() == 6){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // f9.incrementarDia();
        // if(f9.dia() == 30 && f9.mes() == 6){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // f9.incrementarDia();
        // if(f9.dia() == 1 && f9.mes() == 7){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // Fecha f10 = new Fecha(28, 2);
        // if(f10.dia() == 28 && f10.mes() == 2){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // f10.incrementarDia();
        // if(f10.dia() == 1 && f10.mes() == 3){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }

        // Fecha f11 = new Fecha(31, 12);
        // f11.incrementarDia();
        // if(f11.dia() == 1 && f11.mes() == 1){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // Horario h = new Horario(10, 30);
        // if(h.hora() == 10 && h.minutos() == 30){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // if(h.toString().equals("10:30")){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // Horario h2 = new Horario(10, 30);
        // Horario h3 = new Horario(10, 35);
        // Horario h4 = new Horario(11, 30);
        // String hstring = "10:35";

        // if(h.equals(h2)){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }
        // if(h.equals(h3)){
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // if(h.equals(h4)){
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // if(h.equals(hstring)){
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }
        // if(hstring.equals(h)){
        //     System.out.println("No funciona");
        // } else {
        //     System.out.println("funciona");
        // }

        Fecha f = new Fecha(10, 6);
        Horario h = new Horario(9, 45);
        String mensaje = "Consulta con dentista";

        Recordatorio recordatorio = new Recordatorio(mensaje, f, h);
        if(recordatorio.fecha().equals(f)){
            System.out.println("funciona");
        } else {
            System.out.println("No funciona");
        }
        if(recordatorio.horario().equals(h)){
            System.out.println("funciona");
        } else {
            System.out.println("No funciona");
        }
        if(recordatorio.mensaje().equals(mensaje)){
            System.out.println("funciona");
        } else {
            System.out.println("No funciona");
        }
        if(recordatorio.toString().equals("Consulta con dentista @ 10/6 9:45")){
            System.out.println("funciona");
        } else {
            System.out.println("No funciona");
        }
        Agenda a = new Agenda(new Fecha(10, 05));
        if(a.fechaActual().equals(new Fecha(10, 05))){
            System.out.println("funciona");
        } else {
            System.out.println("No funciona");
        }
        a.agregarRecordatorio(new Recordatorio("Clase Algoritmos", new Fecha(10, 05), new Horario(17, 00)));
        a.agregarRecordatorio(new Recordatorio("Labo Algoritmos", new Fecha(10, 05), new Horario(19, 00)));
        
        
        // String esperado = "10/5\n"
        //         .concat("=====\n")
        //         .concat("Clase Algoritmos @ 10/5 17:0\n")
        //         .concat("Labo Algoritmos @ 10/5 19:0\n");
        
        // if(a.toString().equals(esperado)){
        //     System.out.println("funciona");
        // } else {
        //     System.out.println("No funciona");
        // }

    }
    
}
