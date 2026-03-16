package repaso_global_examen;

/*
 * ============================================================================
 * PARTE 1: CLASE Dispositivo (Debe ser abstracta)
 * ============================================================================
 * - Atributos de instancia (protegidos o privados): 'marca' (String) y 'nSerie' (String).
 * - Atributo de clase / estático (privado): 'totalDispositivos' (int) inicializado a 0.
 * - Constructor normal: Recibe marca y nSerie. Debe incrementar el contador estático en 1.
 * - Método abstracto: 'mostrarDetalles()'. No devuelve nada, pero obliga a los hijos.
 * - Crea los Getters/Setters habituales y el método toString().
 * - Crea un getter estático para poder consultar 'totalDispositivos' desde fuera.
 */
public abstract class Dispositivos {
    
    private String marca;
    private String nSerie;
    private static int totalDispositivos = 0;

    public Dispositivos(String marca, String nSerie) {
        totalDispositivos++;
        this.marca = marca;
        this.nSerie = nSerie;
    }

    public abstract void mostrarDetalles();    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public static int getTotalDispositivos() {
        return totalDispositivos;
    }

    @Override
    public String toString() {
        return "Dispositivos{" + "marca=" + marca + ", nSerie=" + nSerie + '}';
    }

    
    
    
}
