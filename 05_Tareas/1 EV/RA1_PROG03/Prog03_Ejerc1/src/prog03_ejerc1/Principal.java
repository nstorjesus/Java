package prog03_ejerc1;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Primera fecha, inicializada con el primer constructor");

        // Objeto creado con el primer constructor (solo el mes)
        Fecha objFecha1 = new Fecha(enumMes.FEBRERO);

        // Actualizamos día y año con los métodos set
        objFecha1.setDia(20);
        objFecha1.setAnio(2000);

        // Mostramos la fecha en formato largo
        System.out.println("La fecha es: " + objFecha1.toString());

        // Indicamos si es verano usando el operador ternario ? :
        System.out.println(objFecha1.isSummer() ? "Es verano" : "No es verano");


        System.out.println();
        System.out.println("Segunda fecha, inicializada con el segundo constructor");

        // Objeto creado con el segundo constructor
        Fecha objFecha2 = new Fecha(15, enumMes.JULIO, 2015);

        // Mostrar solo el año
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAnio());

        // Mostrar la fecha en formato largo
        System.out.println("La fecha es: " + objFecha2.toString());

        // Ver si es verano
        System.out.println(objFecha2.isSummer() ? "Es verano" : "No es verano");
    }
}
