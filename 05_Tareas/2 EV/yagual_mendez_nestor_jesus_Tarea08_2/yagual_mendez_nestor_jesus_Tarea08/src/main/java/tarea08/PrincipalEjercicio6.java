package tarea08;
import java.util.*;

/* --------------------------------------------------------------------------
 * EJERCICIO 6. Programa que lea 12 números enteros de una lista 
 * (ArrayList o LinkedList) y los visualice al revés, es decir, comienza 
 * por el final de la lista y termina por el elemento 0.
 * -------------------------------------------------------------------------- */
public class PrincipalEjercicio6 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        for (int i = 0; i<=11; i++) {
            System.out.println("Introduce el número " + (i+1) + " :"); 
            int numero = teclado.nextInt();
            
            listaNumeros.add(numero);
            
        }
            
        for (int i = listaNumeros.size()-1; i >= 0; i--) {
            
            System.out.println(listaNumeros.get(i));
        }
        
    }
}