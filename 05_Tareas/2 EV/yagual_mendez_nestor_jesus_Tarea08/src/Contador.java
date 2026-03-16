public class Contador {
    private int valor;

    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        this.valor--;
    }
}