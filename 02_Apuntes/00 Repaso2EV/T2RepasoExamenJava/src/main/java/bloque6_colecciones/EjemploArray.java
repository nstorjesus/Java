package bloque6_colecciones;

/*
 * TEORÍA DE ARRAYS (Vectores/Matrices):
 * 1. Tamaño FIJO: Al crearlo tienes que decir cuántos huecos tiene. No puede crecer ni encoger.
 * 2. Homogéneo: Todos los elementos tienen que ser del mismo tipo.
 * 3. Índices: Empiezan siempre en la posición 0 y terminan en (tamaño - 1).
 * 4. Para saber su tamaño se usa '.length' (¡sin paréntesis!).
 */
public class EjemploArray {

    public static void main(String[] args) {
        System.out.println("=== 1. PRUEBA DE ARRAYS (ESTÁTICOS) ===\n");

        // Declaración e instanciación de un array de 5 huecos
        int[] numeros = new int[5];

        // Llenamos algunas posiciones (recuerda, empieza en 0)
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50; 
        
        // Si intentamos hacer numeros[5] = 60; -> ¡Dará error IndexOutOfBoundsException!

        System.out.println("Recorriendo el Array con un bucle for clásico:");
        // Fíjate que usamos numeros.length (sin paréntesis)
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}