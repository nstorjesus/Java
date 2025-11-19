/*
7.- Diseña un programa Java denominado PROG02_Ejerc7 para resolver una ecuación de primer grado con una incógnita (x), suponiendo que los coeficientes de la ecuación son C1 y C2 se inicializan en el método main:

C1x + C2 = 0

Se debe mostrar el resultado con 4 decimales.

X=-C2 / C1
*/

import java.util.Scanner;

public class PROG02_Ejerc7 {


    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        double c1 = 0;
        double c2 = 0;
        double resultado = 0;
        System.out.println("¿Cual es tu valor para C1?");
        c1 = in.nextDouble();
        System.out.println("¿Cual es tu valor para C2?");
        c2 = in.nextDouble();
        
        if (c2==0) {
            System.out.println("La ecuación no tiene solución.");
        } else {
          resultado = -c2 / c1;
          System.out.printf("La solución es: x = %.4f%n", resultado);  
        }
    }
}
