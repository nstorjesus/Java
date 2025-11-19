/*Ejercicio
 * Le empresa Coca-Cola company desea un sistema que determine los dias de vacaciones lo que tienen
 * derecho un trabajor, tamando en cuentas las siguientes caracteristicas:
 * 
 * Existen tres departamentos dentro de la empresa con sus respectivas claves:
 *   1.Departamento de tación al cliente (clave 1)
 *   2.Departamento de Logística (clave 2)
 *   3.Departamento de Gerencia (clave 3)
 * 
 * Trabajaores con clave 1 (atención al cliente)
 *  - 1 año de servicio: 6 dias de vacaciones
 *  - 2 a 6 años de servicio: 14 dias de vacaciones
 *  - 7 o mas años de servicio: 20 dias de vacaciones
 * 
 * Trabajadores con clave 2 (Logística)
 *  - 1 año de servicio: 7 dias de vacaciones
 *  - 2 a 6 años de servicio: 15 dias de vacaciones
 *  - 7 o mas años de servicio: 22 dias de vacaciones
 * 
 * Trabajadores con clave 3 (Gerencia)
 *  - 1 año de servicio: 10 dias de vacaciones
 * - 2 a 6 años de servicio: 20 dias de vacaciones
 *  - 7 o mas años de servicio: 30 dias de vacaciones
 * 
 * NOTA: El sistema debe de solicitar el "Nombre", "clave del departamento" y "Antiguedad (años de servicio)" del trabajador,
 *       para despues mostrarle un mensaje con el nombre del trabajador y los dias de vacaciones que le corresponden
 * 
 */
import java.util.Scanner;
public class N12_CondicionesCompuestas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "Ingrese su nombre: ";
        int clave = 0;
        int antiguedad = 0;

        System.out.println("¿cual es su nombre?"); // Pregunta por el nombre del trabajador
        nombre = in.nextLine();
        System.out.println("Ingrese la clave de su departamento (1-Atención al cliente, 2-Logística, 3-Gerencia):"); // Pregunta por la clave del departamento
        clave = in.nextInt();
        System.out.println("Ingrese su antiguedad (años de servicio):"); // Pregunta por la antiguedad del trabajador
        antiguedad = in.nextInt();

        if (clave == 1) { // Departamento de atención al cliente
            if (antiguedad <=1 ) {
                System.out.println("El trabajador " + nombre + "no tiene derecho a vacaciones. trabaja mas bro antes de pedir"); // Mensaje si no tiene derecho a vacaciones
            } else if (antiguedad == 1) {
                System.out.println("el trabajador " + nombre + " tiene derecho a 6 dias de vacaciones "); // Mensaje si tiene 1 año de servicio
            } else if (antiguedad >=2 && antiguedad <=6) {
                System.out.println("El trabajador " + nombre + "tiene derecho a 14 días de vacaciones ") ; // Mensaje si tiene entre 2 y 6 años de servicio
            } else if (antiguedad >=7) {
                System.out.println("El trabajador " + nombre + "tiene derecho a 20 días de vacaciones ") ; // Mensaje si tiene 7 o más años de servicio
            } 

        } else if (clave == 2) { // Departamento de Logística
            if (antiguedad <=1 ) {
                System.out.println("El trabajador " + nombre + "no tiene derecho a vacaciones. trabaja mas bro antes de pedir"); // Mensaje si no tiene derecho a vacaciones
            } else if (antiguedad == 1) {
                System.out.println("el trabajador " + nombre + " tiene derecho a 7 dias de vacaciones "); // Mensaje si tiene 1 año de servicio
            } else if (antiguedad >=2 && antiguedad <=6) {
                System.out.println("El trabajador " + nombre + "tiene derecho a 15 días de vacaciones ") ; // Mensaje si tiene entre 2 y 6 años de servicio  
            } else if (antiguedad >=7) {
                System.out.println("El trabajador " + nombre + "tiene derecho a 22 días de vacaciones ") ; // Mensaje si tiene 7 o más años de servicio
            } 

        } else if (clave == 3) { // Departamento de Gerencia
            if (antiguedad <=1 ) {
                System.out.println("El trabajador " + nombre + "no tiene derecho a vacaciones. trabaja mas bro antes de pedir"); // Mensaje si no tiene derecho a vacaciones
            } else if (antiguedad == 1) {
                System.out.println("el trabajador " + nombre + " tiene derecho a 10 dias de vacaciones "); // Mensaje si tiene 1 año de servicio
            } else if (antiguedad >=2 && antiguedad <=6) {
                System.out.println("El trabajador " + nombre + "tiene derecho a 20 días de vacaciones ") ; // Mensaje si tiene entre 2 y 6 años de servicio
            } else if (antiguedad >=7) {
                System.out.println("El trabajador " + nombre + "tiene derecho a 30 días de vacaciones ") ; // Mensaje si tiene 7 o más años de servicio
            } 

        } else {
            System.out.println("Clave de departamento no válida. Por favor, ingrese una clave entre 1 y 3."); // Mensaje si la clave del departamento no es válida
        }

  
    
    }
}
