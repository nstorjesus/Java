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

public class Persona {
    private String nombre;
    private int edad;
    public static int contador = 0;
    
    
   public Persona(String nombre, int edad) {
       
       this.nombre = nombre;
       this.edad = edad;
       contador++;
   }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola soy " + nombre + " y tengo " + edad + " años");
   }
   
}
