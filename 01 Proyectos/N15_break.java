// -------------------------------------------
// EJERCICIO: COMPROBAR SI UN NÚMERO ES PRIMO
// -------------------------------------------
//
// Queremos verificar si un número es primo usando fuerza bruta.
// Para ello:
//
// 1. Comenzamos con el número 97.
// 2. Probamos divisores desde 2 hasta number/2.
// 3. Por cada divisor que probemos, debemos imprimir:
//        "Checking divisor: X"
//
// 4. Si encontramos un divisor exacto (resto 0):
//        "Found divisor: X"
//    Y debemos usar 'break' para parar las comprobaciones.
//
// 5. Si NO encontramos ningún divisor, significa que es primo.
//
// Al final imprimimos:
//        "97 is prime!"
//        o
//        "97 is not prime!"
//
// Ejemplo de salida usando el número 15:
// Checking if 15 is prime...
// Checking divisor: 2
// Checking divisor: 3
// Found divisor: 3
// 15 is not prime!
//
// -------------------------------------------
//  CÓDIGO DEL EJERCICIO
// -------------------------------------------

public class N15_break {
    public static void main(String[] args) {

        // Número que vamos a comprobar
        int number = 97;

        // Suponemos que es primo al inicio
        boolean isPrime = true;

        System.out.println("Checking if " + number + " is prime...");

        // Recorremos posibles divisores
        // Empezamos en 2 porque 1 divide a todos los números
        // Acabamos en number/2 porque ningún número mayor a la mitad puede ser divisor
        for (int divisor = 2; divisor <= number / 2; divisor++) {

            // Mostrar qué divisor estamos probando
            System.out.println("Checking divisor: " + divisor);

            // Si el divisor divide al número EXACTAMENTE, no es primo
            if (number % divisor == 0) {

                // Marcamos que NO es primo
                isPrime = false;

                // Mostramos el divisor que lo encontró
                System.out.println("Found divisor: " + divisor);

                // Paramos el bucle porque ya no tiene sentido seguir
                break;
            }
        }

        // Mensaje final dependiendo si se encontró o no un divisor
        System.out.println(number + " is " + (isPrime ? "prime!" : "not prime!"));
    }
}
