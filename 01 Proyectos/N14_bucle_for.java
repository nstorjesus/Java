

/* teoria:
 * Bucle for en Java
 * -----------------        
 * El bucle for es una estructura de control que permite repetir un bloque de código un número específico de veces. Es especialmente útil cuando se conoce de antemano cuántas iteraciones se desean realizar.  
 *  Estructura del Bucle for:
 * -----------------------
 * for (inicialización; condición; actualización) {
 *    // Código a ejecutar en cada iteración
 * }        
 * Componentes del Bucle for:
 * -----------------------
 * 1. Inicialización: Se ejecuta una vez al inicio del bucle. Aquí se suelen declarar e inicializar las variables de control del bucle.
 * 2. Condición: Se evalúa antes de cada iteración. Si es verdadera, el bucle continúa; si es falsa, el bucle termina.
 * 3. Actualización: Se ejecuta al final de cada iteración. Aquí se suelen modificar las variables de control del bucle.
 * 4. Cuerpo del Bucle: Es el bloque de código que se ejecuta en cada iteración mientras la condición sea verdadera.
 * Ejemplo Básico:
 */
/*
* Ejercicio 1: Contando del 1 al 10
* Intenta Resolverlo Primero: Piensa en cómo usar un bucle para mostrar cada número desde 1 hasta 10 en la consola. ¿Qué tipo de bucle sería más adecuado si sabes exactamente cuántas veces quieres repetir la acción?
* Enunciado: Escribe un programa en Java que utilice un bucle for para imprimir los números enteros del 1 al 10, cada uno en una nueva línea.
* Solución:
*/

public class N14_bucle_for {

public static void main(String[] args) {
    for (int i=1; i<=10; i++) {
        System.out.println(i);
       }
    
}
    
}
