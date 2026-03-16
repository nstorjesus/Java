package bloque5_poo_avanzada;

public class Empleado {

    /* -------------------------------------------------------------------
     * 1. MIEMBROS DE INSTANCIA vs MIEMBROS DE CLASE (STATIC)
     * ------------------------------------------------------------------- */
    
    // ATRIBUTO DE INSTANCIA: Cada empleado tiene su propio nombre. 
    // Si creo 5 empleados, habrá 5 cajas de memoria distintas para los nombres.
    private String nombre;

    // ATRIBUTO DE CLASE (STATIC): Pertenece a la "plantilla", no al objeto.
    // Solo existe UNA caja en la memoria compartida por todos. 
    // Si un empleado le suma 1, todos ven ese cambio. Ideal para contadores.
    private static int contadorEmpleados = 0;

    /* -------------------------------------------------------------------
     * 2. CONSTRUCTOR NORMAL
     * ------------------------------------------------------------------- */
    public Empleado(String nombre) {
        this.nombre = nombre;
        // Cada vez que nace un empleado, sumamos 1 al contador global
        contadorEmpleados++; 
    }

    /* -------------------------------------------------------------------
     * 3. EL CONSTRUCTOR DE COPIA (Pregunta de examen)
     * -------------------------------------------------------------------
     * Sirve para "clonar" un objeto. En vez de recibir un String, 
     * recibe OTRO objeto de su misma clase y le copia los datos.
     */
    public Empleado(Empleado empleadoACopiar) {
        this.nombre = empleadoACopiar.nombre;
        contadorEmpleados++; // Es un empleado nuevo, así que también suma
    }

    /* -------------------------------------------------------------------
     * 4. MODIFICADORES DE ACCESO: EL MÉTODO PRIVADO
     * -------------------------------------------------------------------
     * Al ser 'private', este método NO se puede llamar desde el 'main'.
     * Solo la propia clase Empleado puede usarlo internamente como ayuda.
     */
    private double calcularBonusInterno() {
        return 50.0; // Un cálculo secreto de la empresa
    }

    // Método público normal que SÍ se puede ver desde fuera
    public void trabajar() {
        System.out.println(nombre + " está trabajando como un empleado normal.");
        // Desde aquí SÍ podemos llamar al método privado, porque estamos "en casa"
        double miBonus = calcularBonusInterno(); 
    }

    // Getter estático (para leer la variable estática, se usa un método estático)
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
    
    public String getNombre() {
        return nombre;
    }
}