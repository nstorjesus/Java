package simulacro_examen_2;

/*
 * ============================================================================
 * EVALUACIÓN RA4 (UT5) y RA7 (UT7) - CLASE PADRE
 * ============================================================================
 * NOTA DE LA PROFESORA: "Repasad cuándo una clase debe ser obligatoriamente abstract"
 * * INSTRUCCIONES:
 * 1. Define la clase como abstracta.
 * 2. Crea los siguientes atributos de instancia (privados): 
 * - 'codigo' (String)
 * - 'precioBase' (double)
 * 3. Crea un MIEMBRO DE CLASE (atributo estático y privado): 
 * - 'totalArticulosCreados' (int) inicializado a 0.
 * 4. Constructor normal: Recibe 'codigo' y 'precioBase'. 
 * ¡Importante!: Cada vez que pase por aquí, debe incrementar el atributo estático en 1.
 * 5. Crea un método abstracto llamado 'mostrarInformacion()'. No devuelve nada (void).
 * (Al tener un método abstracto, ¿recuerdas qué pasa obligatoriamente con la clase?).
 * 6. Genera Getters, Setters y el método toString() para los atributos de instancia.
 * 7. Crea un método estático 'getTotalArticulosCreados()' que devuelva el contador.
 */
public abstract class Articulo {
    
    private String codigo;
    private double precioBase;
    private static int totalArticulosCreados = 0;
    
    
    public Articulo (String codigo, double precioBase) {
        totalArticulosCreados++;
        this.codigo = codigo;
        this.precioBase = precioBase;
        
    }
    
    public abstract void mostrarInformacion();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public static int getTotalArticulosCreados() {
        return totalArticulosCreados;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", precioBase=" + precioBase + '}';
    }
    
    
    
}
