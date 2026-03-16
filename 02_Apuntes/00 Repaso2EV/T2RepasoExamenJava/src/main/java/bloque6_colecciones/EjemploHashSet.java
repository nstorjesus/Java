package bloque6_colecciones;

import java.util.HashSet;

/*
 * TEORÍA DE HASHSET:
 * 1. Tamaño DINÁMICO: Igual que el ArrayList, crece solo.
 * 2. DUPLICADOS: ¡NO PERMITE REPETIDOS! Si intentas meter un dato que ya existe, lo ignora.
 * 3. ORDEN: NO mantiene el orden de inserción. Los guarda de forma "caótica" (usando un código Hash) para que buscar sea rapidísimo.
 * 4. Como no hay orden, NO se puede usar .get(i) para sacar el elemento de la posición 0, 1, etc.
 */
public class EjemploHashSet {

    public static void main(String[] args) {
        System.out.println("=== 3. PRUEBA DE HASHSET (SIN ORDEN, NO ADMITE REPETIDOS) ===\n");

        // Creamos un HashSet de tipo String (por ejemplo, para DNIs, que no pueden repetirse)
        HashSet<String> conjuntoDNI = new HashSet<>();

        // Añadimos elementos
        conjuntoDNI.add("11111111A");
        conjuntoDNI.add("22222222B");
        conjuntoDNI.add("33333333C");

        // ¡Atención! Intentamos meter un duplicado a propósito
        boolean sePudoInsertar = conjuntoDNI.add("11111111A"); 
        
        System.out.println("¿Se pudo insertar el duplicado? " + sePudoInsertar + "\n");

        System.out.println("Contenido del HashSet (Fíjate que el duplicado no está y el orden puede variar):");
        
        // Solo podemos recorrerlo con un for-each o con un Iterator (no podemos usar un for clásico con la 'i')
        for (String dni : conjuntoDNI) {
            System.out.println("- " + dni);
        }
        
        System.out.println("\nTamaño del HashSet: " + conjuntoDNI.size());
    }
}