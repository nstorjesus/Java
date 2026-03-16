package bloque3_herencia;

/*
 * Al usar 'extends', Moto hereda todo lo de Vehiculo.
 * Como Vehiculo es abstracta, Moto está OBLIGADA a implementar sus métodos abstractos.
 */
public class Moto extends Vehiculo {

    private int cilindrada;

    // 1. Constructor
    public Moto(String marca, int cilindrada) {
        // OJO AL EXAMEN: super() llama al constructor del padre. 
        // Tiene que ser SIEMPRE la primera línea del constructor hijo.
        super(marca); 
        this.cilindrada = cilindrada;
    }

    /*
     * 2. IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO
     * Aquí es donde cumplimos la obligación que nos impuso la clase padre.
     * Le damos un cuerpo (código entre llaves) al método hacerRuido().
     */
    @Override
    public void hacerRuido() {
        System.out.println("La moto " + marca + " de " + cilindrada + "cc hace: ¡Brum, brum, brum!");
    }
}