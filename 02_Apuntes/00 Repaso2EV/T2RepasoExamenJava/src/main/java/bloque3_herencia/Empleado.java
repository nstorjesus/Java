 /*
 * EJERCICIO 4: HERENCIA EN LA EMPRESA
 * * 1. Clase Empleado (Padre):
 * - Atributos: nombre, sueldoBase.
 * - Constructor para inicializar ambos.
 * - Método mostrarDatos().
 *
 * 2. Clase Programador (Hijo de Empleado):
 * - Atributo extra: lenguaje (String).
 * - Constructor: ¡OJO! Debe usar super() para pasar el nombre y sueldo al padre.
 * - Sobrescribe (@Override) el método mostrarDatos() para que también diga el lenguaje.
 *
 * 3. Clase TestEmpresa:
 * - Crea un Programador y usa sus métodos.
 */
package bloque3_herencia;

public class Empleado {
    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void mostrarDatos() {
        
        System.out.println("Los datos del empleado son:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldoBase + "k al año");
    }
    
   
    
}
