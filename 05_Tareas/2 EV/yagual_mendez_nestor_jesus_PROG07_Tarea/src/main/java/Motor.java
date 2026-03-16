public class Motor {

    private boolean encendido;

    public Motor() {
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El motor ha sido encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El motor ha sido apagado.");
    }


    public boolean estaEncendido() {
        return encendido;
    }
}