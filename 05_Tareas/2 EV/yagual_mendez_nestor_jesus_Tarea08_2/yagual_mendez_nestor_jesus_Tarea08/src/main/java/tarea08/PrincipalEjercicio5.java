package tarea08;
import java.util.*;

/* --------------------------------------------------------------------------
 * EJERCICIO 5. Leer 7 letras de una lista (ArrayList o LinkedList). 
 * Visualiza cuántas vocales hay.
 * -------------------------------------------------------------------------- */

public class PrincipalEjercicio5{
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaLetras = new ArrayList<>();
        
        for (int i = 0; i <= 6; i++) {
            System.out.println("Introduce la letra nº " + (i+1) + ":");
            String letra = teclado.nextLine();
            if (letra.equals("")){
                i--;
                System.out.println("--Error: campo vacio--");
            } else {
               listaLetras.add(letra); 
            }
            
        }
        int contador=0;
        for (String e:listaLetras) {
            if (e.toLowerCase().equals("a") || e.toLowerCase().equals("e") || e.toLowerCase().equals("i") || e.toLowerCase().equals("o") || e.toLowerCase().equals("u")){
                contador++;
                
            }
        }
        System.out.println("Se han introducido " + contador + " vocales");
    }
    
}