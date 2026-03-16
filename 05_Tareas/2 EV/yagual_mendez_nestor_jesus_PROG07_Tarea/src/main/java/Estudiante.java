public class Estudiante extends Persona {
    private String cicloFormativo;

    public Estudiante() {
        super();
        this.cicloFormativo = "DAW";
    }

    public Estudiante(String nombre, int edad, String cicloFormativo) {
        super(nombre, edad);
        this.cicloFormativo = cicloFormativo;
    }

    public Estudiante(Estudiante otro) {
        super(otro);
        this.cicloFormativo = otro.cicloFormativo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ciclo: " + cicloFormativo;
    }
}