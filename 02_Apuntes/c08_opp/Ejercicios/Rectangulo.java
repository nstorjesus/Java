package c08_opp.Ejercicios;

public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getter y Setter de base y altura
    public float getBase() {
        return this.base;
    }
    public void setBase (float base) {
        this.base = base;
    }

    public float getAltura () {
        return this.altura;
    }
    public void setAltura (float altura) {
        this.altura = altura;
    }

    //Método para obtener el area del rectángulo
    public float getArea () {
        return this.base * this.altura;
    }
    //Método para saber si es cuadrado
     public boolean isCuadrado () {
        return this.base == this.altura;
     }

     @Override
     public String toString()  {
        if (isCuadrado()){
            return "Este cuadrado con base " + getBase() + " y altura " + getAltura() + " tiene un area de " + getArea();
        } else {
            return "Este rectangulo con base " + getBase() + " y altura " + getAltura() + " tiene un area de " + getArea();
        }
     }
}
