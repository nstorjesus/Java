package a0_practicas;

public class Circulo {
    private float radio;
    private final float pi = 3.14f;

    public Circulo () {
        this.radio = 0;
    }
    public Circulo (float radio){
        this.radio = radio;
    }
    //GETTER y SETTER
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }


    public float getArea () {
        return pi*(this.radio * this.radio);
    }
    public float getPerimetro () {
        return 2 * pi * this.radio;
    }
    public boolean isCero() {
        return this.radio == 0;
    }
    public boolean esIgual(Circulo otro) {
        return this.radio == otro.radio;
    }


    @Override
    public String toString() {
        if (isCero()) {
            return "El círculo no tiene tamaño (radio 0)";
        } return "Circulo de radio " + this.radio + ", area " + getArea() + " y perímetro " + getPerimetro();

    }
}
