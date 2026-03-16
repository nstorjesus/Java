package bloque5_poo_avanzado;

// 'extends' significa que Director hereda todo lo público de Empleado
public class Director extends Empleado {

    private String departamento;

    /* -------------------------------------------------------------------
     * 5. CONSTRUCTOR DE LA SUPERCLASE (super)
     * -------------------------------------------------------------------
     */
    public Director(String nombre, String departamento) {
        // ¡REGLA DE ORO! 'super()' llama al constructor del padre (Empleado).
        // Tiene que ser OBLIGATORIAMENTE la primera instrucción del constructor.
        super(nombre); 
        this.departamento = departamento;
    }

    /* -------------------------------------------------------------------
     * SOBRESCRITURA DE MÉTODOS (@Override)
     * -------------------------------------------------------------------
     * El Director no trabaja como un empleado normal, así que cambiamos 
     * el comportamiento del método que heredó.
     */
    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está dirigiendo el departamento de " + departamento);
    }
}