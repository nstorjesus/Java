public class Cadena {
    private String texto;

    public Cadena() {
    }

    public Cadena(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLongitud() {
        return this.texto.length();
    }
    
    public char getPrimeraLetra() {
        return this.texto.charAt(0);
    }
}