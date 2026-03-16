package bloque3_herencia;

/* * REGLA DE ORO DEL EXAMEN: Si una clase tiene al menos un método abstracto, 
 * la clase entera TIENE que declararse como 'abstract'.
 * Las clases abstractas NO se pueden instanciar (no puedes hacer un 'new Vehiculo()').
 */
public abstract class Vehiculo {

    // 1. Atributos (pueden ser private o protected para que los hereden los hijos)
    protected String marca;

    // 2. Constructor de la superclase
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // 3. Método normal (con código). Todos los hijos heredarán esto tal cual.
    public void arrancar() {
        System.out.println("El vehículo ha metido la llave y está arrancando...");
    }

    /* * 4. MÉTODO ABSTRACTO: 
     * Esta es la clave. Solo se pone la "firma" (el nombre) y termina en punto y coma (;).
     * No tiene llaves {}. Sirve para OBLIGAR a las clases hijas a que escriban este código.
     */
    public abstract void hacerRuido();
}