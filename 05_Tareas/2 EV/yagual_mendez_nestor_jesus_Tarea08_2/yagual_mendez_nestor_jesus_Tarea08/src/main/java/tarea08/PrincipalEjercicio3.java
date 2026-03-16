package tarea08;
import java.util.*;

/* --------------------------------------------------------------------------
 * EJERCICIO 3. Programa que lea 9 números sobre una lista (ArrayList o LinkedList), 
 * multiplique cada uno de los elementos por 2 y visualice el contenido de la lista.
 * -------------------------------------------------------------------------- */
public class PrincipalEjercicio3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<=8; i++) {
            
            System.out.println("Introduce el número " + (i+1) + " :"); 
            int numero = teclado.nextInt();
            
            lista.add(numero);
                       
        }
        
        for (int i=0; i<lista.size(); i++){
            int numero = lista.get(i);
            lista.set(i, numero * 2);
        }
        System.out.println("La lista multiplicada x2 es la siguiente: ");
        System.out.println(lista);
    }
}
