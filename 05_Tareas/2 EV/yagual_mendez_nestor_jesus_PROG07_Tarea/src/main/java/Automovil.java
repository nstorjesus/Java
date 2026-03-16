public class Automovil {

    private final Motor motor;

    public Automovil() {

        this.motor = new Motor();
    }

    public void encenderMotor() {
        if (!motor.estaEncendido()) {
            motor.encender();
        } else {
            System.out.println("Error: El motor ya está encendido.");
        }
    }

    public void apagarMotor() {
        if (motor.estaEncendido()) {
            motor.apagar();
        } else {
            System.out.println("Error: El motor ya está apagado.");
        }
    }
}