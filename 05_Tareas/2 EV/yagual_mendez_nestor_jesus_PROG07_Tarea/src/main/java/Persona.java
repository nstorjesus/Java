public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
        this.nombre = "Carmen Gaña";
        this.edad = 30;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.edad = otra.edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}