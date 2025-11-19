/*
Diseña un programa Java denominado PROG02_Ejerc4 que dada la edad de una persona, muestre un mensaje indicando si es mayor de edad. NO se puede utilizar el operador condicional if.
*/

import java.util.Scanner;
public class PROG02_Ejerc4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int edad;
        
        System.out.println("Cual es tu edad?");
        edad = in.nextInt();
        
        String mensaje = (edad >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
        
        System.out.println(mensaje);

    }
}
