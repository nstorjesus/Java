/*
 * ==========================================================
 * EJERCICIO 1: CALCULADORA CON VALIDACIÓN
 * ==========================================================
 *
 * INSTRUCCIONES:
 * ---------------
 * 1. Pide al usuario que ingrese dos números enteros.
 * 2. Luego pregunta qué operación desea realizar:
 *      1 = Suma
 *      2 = Resta
 *      3 = Multiplicación
 *      4 = División
 *
 * 3. Usa una estructura SWITCH - CASE para realizar la operación.
 * 
 * 4. Si el usuario elige una opción inválida, muestra un mensaje:
 *      "Error: Operación no válida"
 *
 * 5. Si elige la división, muestra el resultado como número decimal,
 *      usando un CASTEO con (double).
 *
 * 6. Si el segundo número es 0 y elige división,
 *      muestra un mensaje de error:
 *      "No se puede dividir entre cero."
 *
 * PISTAS:
 * -------
 * - Usa la clase Scanner para leer los valores del teclado.
 * - Declara una variable 'resultado' para guardar el valor calculado.
 * - Muestra el resultado con System.out.println().
 *
 * OBJETIVO:
 * ----------
 * Poner en práctica:
 * - Entrada de datos con Scanner.
 * - Uso del switch-case.
 * - Uso del break y default.
 * - Validación con if dentro del case (para la división).
 */
import java.util.Scanner;

public class N010_Ejercicio1 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    int num1 , num2, operacion, resultado = 0;
    
    
    System.out.println("Dame el primer número ");
    num1 = in.nextInt();
    System.out.println("Dame el segundo número ");
    num2 = in.nextInt();
    
    System.out.println("¿cual es la operacion que quieres ejecutar? 1 (suma), 2 (resta), 3 (multiplicacion), 4 (division)");
    operacion = in.nextInt();
    
    switch (operacion) {
        case 1: resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
        break;
        
        case 2: resultado = num1 - num2;
        System.out.println("El resultado de la resta es " + resultado);
        break;
        
        case 3: resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es " + resultado);
        break;
        
        case 4: if (num2 == 0) {
            System.out.println("ERROR: El segundo valor no puede ser 0"); 
        } else {
            resultado = num1 / num2;
            System.out.println("El resultado de la división es " + ((double)num1 / num2));
        }
        break;
        
        default: System.out.println("Error: Operación no válida");
        break;
        
    }
}
    
}
