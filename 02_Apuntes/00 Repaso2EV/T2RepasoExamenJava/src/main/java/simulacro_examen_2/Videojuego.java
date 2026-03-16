package simulacro_examen_2;

/*
 * ============================================================================
 * EVALUACIÓN RA4 (UT5) y RA7 (UT7) - CLASE HIJA
 * ============================================================================
 * NOTA DE LA PROFESORA: "Constructor de la superclase / Constructor de copia / 
 * Si un método se pide como privado, es porque solo debe usarse internamente"
 * * INSTRUCCIONES:
 * 1. Haz que herede de Articulo.
 * 2. Atributo de instancia (privado): 'plataforma' (String).
 * 3. Constructor normal: Recibe codigo, precioBase y plataforma. 
 * (OBLIGATORIO: Llama al constructor de la superclase con super() para los dos primeros).
 * 4. CONSTRUCTOR DE COPIA: Recibe otro objeto 'Videojuego' (ej: v1) y copia todos sus datos 
 * al nuevo objeto que estamos creando. (Recuerda usar el super() pasándole los getters del v1).
 * 5. Método PRIVADO: Crea un método llamado 'calcularPrecioFinal()' que devuelva un double.
 * Este método debe devolver el precioBase del artículo sumándole un 21% de IVA.
 * (Pista: precioBase * 1.21).
 * 6. Sobrescritura (Override): Implementa el método abstracto 'mostrarInformacion()'.
 * Debe imprimir por consola el código, la plataforma y el precio FINAL (llamando
 * obligatoriamente a tu método privado 'calcularPrecioFinal()').
 */
public class Videojuego extends Articulo{
    
    private String plataforma;
    
    
    public Videojuego(String codigo, double precioBase, String plataforma) {
        super(codigo, precioBase);
        this.plataforma = plataforma;
        
        
    }
    
    public Videojuego(Videojuego v1) {
        super(v1.getCodigo(), v1.getPrecioBase());
        this.plataforma=v1.plataforma;
    }
    
    private double calcularPrecioFinal(){
        
        return super.getPrecioBase() *1.21;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    

    @Override
    public void mostrarInformacion() {
        System.out.println("el codigo del videojuego es " + super.getCodigo() + " , la plataforma es " + plataforma + " y tiene un precio de " + calcularPrecioFinal() + "€");
    }
    
    
}
