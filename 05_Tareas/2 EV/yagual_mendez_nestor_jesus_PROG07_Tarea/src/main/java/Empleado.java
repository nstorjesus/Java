public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario + "€";
    }
}