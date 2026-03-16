package simulacro_examen_2;

import java.util.*;

/*
 * ============================================================================
 * EVALUACIÓN RA6 (UT6 y UT8) - COLECCIONES Y MAIN
 * ============================================================================
 * NOTA DE LA PROFESORA: "Array, ArrayList y HashSet / Declaración e Instanciación"
 * * INSTRUCCIONES: Sigue el orden exacto.
 *
 * 1. ARRAYS:
 * - Crea un Array (vector) de tamaño 4 de tipo String llamado 'secciones'.
 * - Asigna manualmente: "Acción", "Deportes", "Rol", "Estrategia".
 * - Recórrelo con un for normal (clásico) e imprímelas.
 *
 * 2. HASHSET:
 * - Crea un HashSet de tipo String llamado 'codigosSeguridad'.
 * - Añade los siguientes códigos: "A1", "B2", "C3", "A1", "B2".
 * - Imprime el tamaño del HashSet con un texto aclaratorio. 
 * (Debería ser 3, comprobando que no admite duplicados).
 *
 * 3. POLIMORFISMO Y ENLACE DINÁMICO:
 * - Crea un objeto. La DECLARACIÓN debe ser 'Articulo', pero la INSTANCIACIÓN 
 * debe ser 'Videojuego'.
 * - Pásale estos datos: codigo "V-001", precioBase 50.0, plataforma "PS5".
 * - Llama a su método 'mostrarInformacion()'.
 *
 * 4. ARRAYLIST Y CONSTRUCTOR DE COPIA:
 * - Crea un ArrayList genérico para guardar objetos del tipo 'Articulo'.
 * - Añade el videojuego del paso 3 a la lista.
 * - Usando tu CONSTRUCTOR DE COPIA, crea un clon exacto del primer videojuego.
 * (¡Cuidado con el casting si Java se queja por el Polimorfismo del paso 3!).
 * - A ese clon, cámbiale la plataforma a "Xbox" usando el setter.
 * - Añade el clon al ArrayList.
 * - Recorre el ArrayList con un bucle for-each y llama a 'mostrarInformacion()' 
 * de cada elemento.
 *
 * 5. MIEMBROS DE CLASE (ESTÁTICOS):
 * - Imprime cuántos artículos se han creado en total llamando al método estático 
 * directamente desde el nombre de la clase padre.
 */

public class PrincipalTienda {
    public static void main(String[] args) {
        String[] secciones = new String[4];
        
        secciones[0] = "Accion";
        secciones[1] = "Deportes";
        secciones[2] = "Rol";
        secciones[3] = "Estrategia";
        
        System.out.println("Las secciones son: ");
        
        for (int i=0; i<secciones.length; i++){
            System.out.println(secciones[i]);
        }
        
        HashSet<String> codigosSeguridad = new HashSet<>();
        
        codigosSeguridad.add("A1");
        codigosSeguridad.add("B2");
        codigosSeguridad.add("C3");
        codigosSeguridad.add("A1");
        codigosSeguridad.add("B2");
        
        System.out.println("Hay un total de " + codigosSeguridad.size() + " sin repetir");
        
        Articulo vd1 = new Videojuego("V-001", 50, "PS5");
        vd1.mostrarInformacion();
        
        ArrayList<Articulo> listaVideojuegos = new ArrayList<>();
        
        listaVideojuegos.add(vd1);
        
        
        Videojuego vd2 = new Videojuego((Videojuego)vd1);
        vd2.setPlataforma("Xbox mi bro");
        
        listaVideojuegos.add(vd2);
        
        System.out.println("La informacion de los videojuegos en la lista en la siguiente: ");
        for (Articulo vj: listaVideojuegos){
            vj.mostrarInformacion();
            
        }
        
        System.out.println("Hay un total de " + Articulo.getTotalArticulosCreados() + " articulos creados");
    }
}