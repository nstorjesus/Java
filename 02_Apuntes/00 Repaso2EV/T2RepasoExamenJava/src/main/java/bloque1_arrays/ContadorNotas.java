

/*
 * EJERCICIO 1: EL CONTADOR DE NOTAS
 * 1. Crea un vector de tipo double con capacidad para 5 notas.
 * 2. Pide al usuario por teclado (Scanner) que introduzca las 5 notas.
 * 3. Calcula la nota media y muéstrala.
 * 4. Indica cuántas notas son superiores o iguales a 5 (aprobados).
 */

package bloque1_arrays;
import java.util.Locale;
import java.util.Scanner;

public class ContadorNotas {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        double suma = 0;
        int aprobados = 0;
        
        double[] notas= new double[5];
        
        for (int i=0; i < notas.length; i++){
            
            System.out.println("Introduce la nota " + (i + 1) + ":");
            notas[i] = teclado.nextDouble();
            
            if (notas[i] < 0 || notas[i] > 10 ) {
                System.out.println("!!Error!! La nota " + notas[i] + " no es válida (debe ser de 0 a 10).");
                i--;
            } else {
            
                if (notas[i] >= 5){
                    aprobados++;
                }
            }
        }
        

        
        
        for (int i =0; i < notas.length; i++) {
            System.out.println("La nota " + (i + 1) + " es de " + notas[i] + "/10");
        }
        
        System.out.println("-------------------");
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        
        double media = suma / notas.length;
        
        System.out.println("La suma total es: " + suma);
        System.out.println("La nota media es: " + media);
        System.out.println("Número de aprobados: " + aprobados);
        
    }
}
