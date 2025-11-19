/*
 * SWITCH - CASE en Java
 * ---------------------
 * El switch es una estructura de control que permite ejecutar diferentes
 * bloques de código según el valor de una variable o expresión.
 */

 /*
  * ESTRUCTURA GENERAL:
  * -------------------
  * switch (variable) {
  *     case valor1:
  *         // código que se ejecuta si variable == valor1
  *         break;
  *     case valor2:
  *         // código que se ejecuta si variable == valor2
  *         break;
  *     default:
  *         // código que se ejecuta si no coincide con ningún case
  * }
  */

 /*
  * FUNCIONAMIENTO:
  * ---------------
  * 1. El programa evalúa el valor de la variable dentro del switch.
  * 2. Busca el 'case' que tenga el mismo valor.
  * 3. Cuando encuentra el 'case' correspondiente, empieza a ejecutar desde ahí.
  * 4. Si no hay un 'break', el programa sigue ejecutando los siguientes 'case'
  *    (esto se llama "fall-through").
  * 5. Si encuentra un 'break', el programa sale del switch.
  * 6. Si ningún 'case' coincide, se ejecuta el bloque 'default' (si existe).
  */

 /*
  * EL 'break':
  * -----------
  * - Es una instrucción que detiene la ejecución del switch.
  * - Si no se usa, el programa continuará ejecutando todos los casos
  *   que estén por debajo del que coincidió, sin volver a comparar valores.
  */

 /*
  * EL 'default':
  * -------------
  * - Es opcional.
  * - Se ejecuta solo si ninguno de los 'case' coincide con el valor de la variable.
  * - Suele colocarse al final, aunque no es obligatorio.
  */

 /*
  * TIPOS DE DATOS PERMITIDOS EN EL SWITCH:
  * ---------------------------------------
  * El switch en Java puede evaluar los siguientes tipos:
  *
  *  - byte
  *  - short
  *  - int
  *  - char
  *  - String (desde Java 7)
  *  - enum (desde Java 5)
  *
  * También se permiten los tipos envolventes equivalentes (Integer, Character, etc.)
  *
  * NO se pueden usar:
  *  - long
  *  - float
  *  - double
  *  - boolean
  */

 /*
  * USO TÍPICO:
  * ------------
  * Se usa cuando se necesita comparar una misma variable contra varios valores
  * posibles (en lugar de usar muchos if-else).
  *
  * Es más legible y organizado cuando hay múltiples opciones fijas.
  */

 /*
  * RESUMEN RÁPIDO:
  * ---------------
  * - switch evalúa una sola variable.
  * - cada case representa una opción.
  * - break detiene la ejecución.
  * - default maneja los casos no contemplados.
  * - solo funciona con ciertos tipos de datos (int, char, String, enum, etc.).
  */

/*
 * ==========================================================
 * CUÁNDO USAR IF - ELSE IF - ELSE  vs  SWITCH - CASE
 * ==========================================================
 *
 * CUANDO USAR IF - ELSE IF:
 * --------------------------
 * ✅ Cuando necesitas comparar RANGOS o CONDICIONES COMPLEJAS.
 *    Ejemplo: if (x > 10 && x < 20)
 *
 * ✅ Cuando usas operadores lógicos (>, <, ==, &&, ||, etc.)
 *
 * ✅ Cuando las comparaciones NO dependen de un solo valor fijo.
 *    Ejemplo: if (edad >= 18 && edad <= 65)
 *
 * ✅ Cuando la variable a evaluar puede ser de CUALQUIER tipo:
 *    int, double, boolean, String, etc.
 *
 * ❌ No es ideal cuando hay muchas opciones simples, porque
 *    el código se hace largo y menos legible.
 *
 * ----------------------------------------------------------
 *
 * CUANDO USAR SWITCH - CASE:
 * ---------------------------
 * ✅ Cuando comparas UNA SOLA VARIABLE con valores FIJOS o EXACTOS.
 *    Ejemplo: switch (opcion) { case 1: ... case 2: ... }
 *
 * ✅ Ideal para MENÚS o selecciones simples:
 *    1 = sumar, 2 = restar, 3 = multiplicar, etc.
 *
 * ✅ El código es más limpio, ordenado y rápido de leer.
 *
 * ✅ Permite tipos de datos: byte, short, int, char, String, enum.
 *
 * ❌ No permite condiciones lógicas (>, <, &&, etc.).
 *
 * ❌ No se puede usar con tipos como long, float, double o boolean.
 *
 * ----------------------------------------------------------
 *
 * RESUMEN:
 * --------
 * ➤ Usa IF - ELSE IF cuando las condiciones son complejas o variables.
 * ➤ Usa SWITCH - CASE cuando comparas un solo valor con varias opciones fijas.
 *
 * ==========================================================
 */


/* relizar un programa que pueda realizar una semna, una resta, una multiplicacion o una división
 * de dos numerot enteros, dependidnedo de la decisión del usuario
 * 
 * - Si operacion es igual a 1, realizar una suma
 * - Si opreracion es igual a 2, realizar una resta
 * - Si operacion es igual a 3, realizar una multiplicación
 * - Si operacion es igual a 4, realizar una división
 * - Si operacion no es ninguna de las anteriores, mostrar un mensaje de error
 * 
 * 
 * el switch case es una estructura de control que permite evaluar una variable
 * y ejecutar diferentes bloques de código dependiendo del valor de esa variable.
 * solo te permite swicht i
 */
import java.util.Scanner;

public class N13_Switch_Case {
    public static void main(String[] args) {

        int num1=8;
        int num2=3;
        int resultado=0;
        Scanner in= new Scanner(System.in);
        int operacion=0;

        System.out.println("¿Cual es la operacion que deseas realizar? (1-Suma, 2-Resta, 3-Multiplicacion, 4-Division)");
        operacion = in.nextInt(); // Lee la operación deseada por el usuario

        switch (operacion) {
            case 1: resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case 2: resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case 3: resultado = num1 * num2;    
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            
            case 4: resultado = num1 / num2;    
                System.out.println("El resultado de la division es: " + ((double)num1 / num2)); // casteo para obtener un resultado decimal
                break;
        
            default:System.out.println("Error: Operación no válida");
                break;
        }


    }
    
}
