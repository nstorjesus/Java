package tarea08;
import java.util.*;

/* --------------------------------------------------------------------------
 * EJERCICIO 2. Introducir 5 números en una lista (ArrayList o LinkedList) 
 * y visualizar cuántos son mayores que el último valor introducido en una 
 * lista (ArrayList o LinkedList).
 * -------------------------------------------------------------------------- */
public class PrincipalEjercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<> ();
        
        for (int i = 0; i<=4 ; i++) {
            System.out.println("Introduce el número "+ (i+1));
            int numero = teclado.nextInt();
            
            lista.add(numero);
            
        }
        
        System.out.println("La lista de números mayores al último de la lista es: ");
        int contador = 0;
        
        for (int i = 0; i<lista.size() ; i++) {
            
            if (lista.get(i) > lista.get(4)) {
                contador++;
                System.out.println(lista.get(i));
            }
            
        }
        
        System.out.println("El número total de valores mayores al número último de la lista es de " + contador + " numeros");
    }
}