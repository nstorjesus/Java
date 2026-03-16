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

public class Programador extends Empleado{
    
    private String lenguaje;

    public Programador(String lenguaje, String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El lenguaje que utiliza es " +  lenguaje);
    }
    
    
    
    
    
    
    
}
