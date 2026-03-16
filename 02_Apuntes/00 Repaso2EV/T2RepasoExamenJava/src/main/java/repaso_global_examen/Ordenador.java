package repaso_global_examen;

/*
 * ============================================================================
 * PARTE 2: CLASE Ordenador (Hereda de Dispositivo)
 * ============================================================================
 * - Atributo de instancia (privado): 'memoriaRAM' (int).
 * - Constructor normal: Recibe marca, nSerie y memoriaRAM. (¡OBLIGATORIO usar super()!).
 * - Constructor de copia: Recibe otro objeto Ordenador y copia sus datos. 
 * (¡Ojo! Al hacer una copia nace un dispositivo nuevo, por lo que el contador global 
 * estático de la clase padre también debería aumentar. Piensa cómo hacerlo).
 * - Método privado: 'calcularPrecioEstimado()' que devuelva un double.
 * (Invéntate el cálculo, por ejemplo: memoriaRAM * 15.5).
 * - Sobrescritura (Override): Implementa el método abstracto 'mostrarDetalles()'.
 * Debe imprimir la marca, el nSerie, la RAM y, llamando a tu método privado, el precio.
 */
public class Ordenador extends Dispositivos{
    
    private int memoriaRam;
    
    
    public Ordenador ( String marca, String nSerie, int memoriaRam) {
    
    super(marca, nSerie);
    this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    
    
    
    public Ordenador (Ordenador or1){
    super(or1.getMarca(), or1.getnSerie());
    this.memoriaRam = or1.memoriaRam;
    
    }
    
    private double calcularPrecioEstimado(){
        
        return memoriaRam * 1.5;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("La marca es: " + getMarca() + " con nº de serie: " + getnSerie() + " con una memoria Ram de: " + memoriaRam + " y un precio de: " + calcularPrecioEstimado() + "€");
    }
    
    
    

    
    
}



