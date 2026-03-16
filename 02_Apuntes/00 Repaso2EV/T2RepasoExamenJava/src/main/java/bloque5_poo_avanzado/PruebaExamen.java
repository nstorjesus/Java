package bloque5_poo_avanzado;

public class PruebaExamen {

    public static void main(String[] args) {
        
        System.out.println("=== REPASO: CONSTRUCTOR DE COPIA ===");
        Empleado emp1 = new Empleado("Juan");
        
        // Usamos el constructor de copia para clonar a Juan
        Empleado emp2 = new Empleado(emp1);
        System.out.println("Original: " + emp1.getNombre());
        System.out.println("Copia: " + emp2.getNombre());

        
        System.out.println("\n=== REPASO: STATIC (MIEMBROS DE CLASE) ===");
        // Fíjate que no llamamos a 'emp1.getContador...', llamamos a la CLASE Empleado.
        System.out.println("Total de empleados creados: " + Empleado.getContadorEmpleados());

        
        /* -------------------------------------------------------------------
         * 6. POLIMORFISMO Y ENLACE DINÁMICO (LA PREGUNTA ESTRELLA)
         * -------------------------------------------------------------------
         */
        System.out.println("\n=== REPASO: POLIMORFISMO ===");
        
        // DECLARACIÓN (Izquierda): Le decimos a Java "Voy a usar un Empleado".
        // INSTANCIACIÓN (Derecha): En la memoria real, metemos un Director.
        Empleado elJefe = new Director("Ana", "Ventas");
        
        // ENLACE DINÁMICO: 
        // Aunque la caja por fuera dice "Empleado" (Declaración), Java es listo 
        // y en el último segundo ejecuta el método de lo que hay dentro (Instanciación).
        // Por tanto, imprimirá la frase del Director, no la del empleado normal.
        elJefe.trabajar();
        
        /*
         * DEMOSTRACIÓN DE MÉTODO PRIVADO:
         * Si intentas quitar las barras a la siguiente línea, dará error porque 
         * calcularBonusInterno() es 'private' y no se puede ver desde el main.
         */
        // elJefe.calcularBonusInterno(); 
    }
}