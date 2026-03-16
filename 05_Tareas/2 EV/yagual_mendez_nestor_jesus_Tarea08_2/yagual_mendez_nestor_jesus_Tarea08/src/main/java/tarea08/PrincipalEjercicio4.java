package tarea08;
import java.util.*;

/* --------------------------------------------------------------------------
 * EJERCICIO 4. Introducir la edad de 7 personas en una lista 
 * (ArrayList o LinkedList). ¿Cuántas son mayores de edad?
 * -------------------------------------------------------------------------- */
public class PrincipalEjercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> listaEdades = new ArrayList<> ();
        
        
        for (int i=0; i<=6; i++) {
            System.out.println("Introduce la edad de la persona nº "+ (i+1) + ":");
            int edad = teclado.nextInt();
            
            if (edad>0 && edad<100) {
               listaEdades.add(edad);  
            } else {
                System.out.println("Edad no válida");
                i--;
            }
                      
        }
        
        int contador = 0;
        
        for (Integer i:listaEdades){
            if (i >= 18) {
               contador++; 
        }
               
        }
        System.out.println("Hay " + contador + " personas mayores de edad");
    }
}