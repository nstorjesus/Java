public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        // Llamamos al constructor del padre
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        // Aprovechamos el toString del padre y le añadimos el departamento
        return super.toString() + ", Departamento: " + departamento;
    }
}