package tarea08;
import java.util.*;

/* --------------------------------------------------------------------------
 * EJERCICIO 1. Leer 8 números con la clase Scanner, almacenarlos en 
 * una lista (ArrayList o LinkedList) y visualizarlos.
 * -------------------------------------------------------------------------- */
public class PrincipalEjercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i <=7; i++) {
            
            System.out.println("Introduce el número " + (i+1));
            int numero = teclado.nextInt();
            lista.add(numero);
        }
        System.out.println("La lista de números es la siguiente: ");
        System.out.println(lista);
    }
}