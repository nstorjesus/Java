public class Numero {
    private int numero;
    
    public Numero (int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void suma(int mas){
        this.numero += mas;
    }
    
    public void resta(int menos){
            this.numero -= menos;
    }
    
    public int getDoble(){
        return this.numero*2;
    }
    
    public int getTriple(){
        return this.numero*3;
    }
}
