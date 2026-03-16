 /*
 * EJERCICIO 3: MI PRIMERA CLASE
 * * PARTE A: Crea la clase 'Persona' con:
 * - Atributos: nombre (String), edad (int) y un atributo ESTÁTICO llamado contador (int).
 * - Constructor: Que reciba nombre y edad, e incremente el contador cada vez que se cree alguien.
 * - Un método llamado 'saludar()' que imprima "Hola, soy [nombre] y tengo [edad] años".
 *
 * PARTE B: En la clase 'PrincipalPersona':
 * - Crea 3 objetos de tipo Persona con diferentes datos.
 * - Llama al método saludar de cada uno.
 * - Imprime el valor del atributo estático 'contador' (accediendo desde la clase).
 */

package bloque2_poo;

public class PrincipalPersona {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Luis el caballo Juan", 23 );
        Persona p2 = new Persona("Ivan GPT", 25);
        Persona p3 = new Persona("Néstor el mejor", 27);
        
        
        p1.saludar();
        p2.saludar();
        p3.saludar();
        
        System.out.println("Hay " + Persona.contador + " personas creadas");
        
        
    }
    
}
