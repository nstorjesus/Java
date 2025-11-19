/*
* Diseña un programa Java denominado PROG02_Ejerc5 que dado un número de segundos, muestre en pantalla cuántos minutos, horas y días contiene.
*/


import java.util.Scanner;
public class PROG02_Ejerc5 {


    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        long numero=0;
        long dias=0;
        long horas=0;
        long minutos=0;
        long segundos=0;
        
        System.out.println("Introduce un número en segundos");
        numero = in.nextLong();
        
        dias = numero / 86400;
        horas = (numero % 86400) / 3600;
        minutos = (numero % 3600) / 60;
        segundos = numero % 60;
        
        System.out.println("Equivale a: " + dias + " dias, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos, ");
    }
}
