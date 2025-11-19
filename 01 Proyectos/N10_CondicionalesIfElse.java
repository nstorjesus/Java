/* una estructura condicional es una instruccion que ayuda a nuestro programa que situación deben
 * seguir en el programa en funcion de si se cumple o no una condicióN
 * Existen dos tipos de estructuras condicionales:
 * 1. if else       : si se cumple una condición se ejecuta un bloque de código
 *                    si no se cumple, se ejecuta otro bloque de código
 * 2. switch case    : se utiliza cuando tenemos muchas condiciones que evaluar
 *                   y cada condición tiene un bloque de código diferente
 *                  es más limpio y fácil de leer que una serie de if else
 *                  pero solo se puede utilizar con variables de tipo entero, char o String
 *                  no se puede utilizar con variables de tipo booleano o float/double
 *                  cada bloque de código se denomina case y se evalúa la variable
 *                  con cada case
 *                  si se cumple un case, se ejecuta el bloque de código correspondiente
 *                  y se sale del switch case
 *                  si no se cumple ningún case, se puede ejecutar un bloque de código
 *                  denominado default
 *                  que se ejecuta si no se cumple ningún case
 *                  la estructura switch case es más eficiente que una serie de if else
 *                  cuando se tienen muchas condiciones que evaluar
 *                  ya que el programa no tiene que evaluar todas las condiciones
 *                  sino que evalúa la variable una sola vez
 *                  y salta directamente al case que se cumple
 *                  lo que mejora el rendimiento del programa
 *                  pero en este caso, no es posible utilizar rangos de valores
 *                  como en los if else
 *                  por ejemplo, no se puede evaluar si una variable está entre 1 y 10
 *                  en un switch case
 *                  por lo que en algunos casos, es mejor utilizar if else
 *
 * Ejemplo de if else:
 * if (condición) {
 *   // bloque de código si se cumple la condición
 * } else {
 *  // bloque de código si no se cumple la condición
 * }
 * 
 * 
 * Ejemplo de switch case:
 * switch (variable) {
 * case valor1:
 *  // bloque de código si la variable es igual a valor1
 * break;
 * case valor2:
 *  // bloque de código si la variable es igual a valor2
 * break;
 * default:
 * // bloque de código si la variable no es igual a ningún valor
 * break;
 * }
 * 
 */


 // Ejercicio: Realizar un programa que calcule el promedio final de tres matererias y que el programa nos indique si el alumno aprobó o reporobó
 // calificaciones:
 // Matematicas: 5
 // Biologia: 8
 // Quimica: 7

public class N10_CondicionalesIfElse {

    static void main(String args []) {

        double matematicas=5, biologia=8, quimica=7; //declaro e inicializo las variables de las calificaciones
        double media = (matematicas + biologia + quimica) / 3;  //calculo la media de las calificaciones

         //utilizo una estructura condicional if else para determinar si el alumno aprobó o reprobó

        if (media >=5) {
            System.out.println("El alumno ha aprobado con una media de: " + media);
        } else {
            System.out.println("El alumno ha reprobado con una media de: " + media);
        }
    }

}
