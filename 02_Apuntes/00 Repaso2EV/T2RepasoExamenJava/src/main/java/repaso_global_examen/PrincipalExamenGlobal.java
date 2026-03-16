package repaso_global_examen;

import java.util.*;

/*
 * ============================================================================
 * PARTE 3: CLASE PrincipalExamenGlobal (Con el método main)
 * ============================================================================
 * Aquí demostrarás el uso de Colecciones (RA6) y Polimorfismo. Haz lo siguiente en orden:
 *
 * 1. ARRAYS (Estáticos):
 * - Crea un Array (vector) normal de tamaño 3, de tipo String.
 * - Guárdale 3 marcas de ordenadores (ej: "HP", "Dell", "Apple").
 * - Recórrelo con un for clásico e imprímelas.
 *
 * 2. HASHSET (Sin duplicados):
 * - Crea un HashSet de tipo String llamado 'numerosDeSerie'.
 * - Añade estos números usando .add(): "A111", "B222", "A111".
 * - Imprime el tamaño (.size()) del HashSet (debería ser 2, demostrando que ignora repetidos).
 *
 * 3. POLIMORFISMO Y ENLACE DINÁMICO:
 * - Crea un objeto declarando la variable como 'Dispositivo' (Declaración), pero
 * instanciándolo como un nuevo 'Ordenador' (Instanciación).
 * (Dale los datos: marca "HP", nSerie "A111", RAM 8).
 * - Llama al método 'mostrarDetalles()' sobre ese objeto.
 *
 * 4. ARRAYLIST Y CONSTRUCTOR DE COPIA:
 * - Crea un ArrayList de tipo 'Dispositivo' llamado 'inventario'.
 * - Añade el ordenador que creaste en el paso 3 al ArrayList.
 * - Usa tu CONSTRUCTOR DE COPIA para crear un ordenador exactamente igual al primero.
 * - A esta copia, cámbiale la memoria RAM a 16 usando su método setter.
 * - Añade la copia al ArrayList.
 * - Recorre el ArrayList con un bucle for-each y llama a 'mostrarDetalles()' de cada elemento.
 *
 * 5. MIEMBRO ESTÁTICO:
 * - Imprime el total de dispositivos creados en el sistema llamando directamente 
 * al método estático de la clase Dispositivo.
 */

public class PrincipalExamenGlobal {
    public static void main(String[] args) {
        
        String[] listaMarcas = new String[3];
        
        listaMarcas[0] = "HP";
        listaMarcas[1] = "Dell";
        listaMarcas[2] = "Apple";
        
        // USO DE FOR NORMAL
        System.out.println("Las marcas disponibles son: ");
        for (int i=0; i<listaMarcas.length; i++){
            System.out.println(listaMarcas[i]);    
        }
        
        //USO DE FOR EACH
        for (String lm:listaMarcas){
            System.out.println(lm);
        }
        
        HashSet<String> numerosDeSerie = new HashSet<>();
        
        numerosDeSerie.add("A111");
        numerosDeSerie.add("A111");
        numerosDeSerie.add("B222");
        
        System.out.println("El tamaño del HashSet es de: " + numerosDeSerie.size());
        
        
        Dispositivos pc1 = new Ordenador("HP", "A111", 8);
        pc1.mostrarDetalles();
        
        
        ArrayList<Dispositivos> inventario = new ArrayList<>();
        
        inventario.add(pc1);
        
        Ordenador pc2 = new Ordenador((Ordenador)pc1);
        pc2.setMemoriaRam(16);
        
        
        inventario.add(pc2);
        
        System.out.println("Actualmente hay estos ordenadores en el inventario");
        for( Dispositivos pcs: inventario){
            pcs.mostrarDetalles();
           
        }
        
        System.out.println("hay un total de " + Dispositivos.getTotalDispositivos() + " dispositivos");
    }


}
