package bloque6_colecciones;

import java.util.ArrayList;

/*
 * TEORÍA DE ARRAYLIST:
 * 1. Tamaño DINÁMICO: Crece y encoge automáticamente según metes o sacas datos.
 * 2. Tipos Envoltorio: Solo admite Objetos, no tipos primitivos (usa Integer en vez de int, String, Double...).
 * 3. ORDEN: Mantiene estrictamente el orden en el que insertas las cosas.
 * 4. DUPLICADOS: SÍ permite meter valores repetidos.
 * 5. Para saber su tamaño se usa '.size()' (¡con paréntesis!).
 */
public class EjemploArrayList {

    public static void main(String[] args) {
        System.out.println("=== 2. PRUEBA DE ARRAYLIST (DINÁMICO, ADMITE REPETIDOS) ===\n");

        // Creamos un ArrayList de tipo String
        ArrayList<String> listaCompra = new ArrayList<>();

        // Añadimos elementos (crece solo)
        listaCompra.add("Manzanas");
        listaCompra.add("Leche");
        listaCompra.add("Pan");
        
        // ¡Atención! Metemos un duplicado a propósito
        listaCompra.add("Leche"); 

        System.out.println("Contenido de la lista (Fíjate que 'Leche' sale dos veces y en orden):");
        
        // Recorremos con un bucle for-each (el más recomendado para colecciones)
        for (String producto : listaCompra) {
            System.out.println("- " + producto);
        }
        
        System.out.println("\nTamaño actual del ArrayList: " + listaCompra.size());
        
        // Acceder a un elemento concreto (usamos .get() en lugar de corchetes [])
        System.out.println("El primer elemento es: " + listaCompra.get(0));
    }
}