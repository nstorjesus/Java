
//Ejercicio 2: Suma de los Primeros N Números Naturales

//Intenta Resolverlo Primero: ¿Cómo podrías acumular la suma de números en una variable mientras recorres desde 1 hasta un número N? Necesitarás una variable para guardar la suma total.

//Enunciado: Crea un programa que calcule la suma de los primeros 5 números naturales (1 + 2 + 3 + 4 + 5) usando un bucle for e imprima el resultado total.


public class N14_1_bucle_for {

public static void main(String[] args) {
    int suma = 0; // Variable para almacenar la suma total


    for (int i=1; i<=5; i++) {
        suma += i;
        System.out.println("Sumando: " + i + ", Suma parcial: " + suma);
       }
    
}
    
}
// Al finalizar el bucle, imprimir la suma total
// System.out.println("La suma de los primeros 5 números naturales es: " + suma);