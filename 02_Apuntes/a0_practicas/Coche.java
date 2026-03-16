
/*
Ejercicio: Clase Coche

Crea una clase llamada "Coche" que represente un coche.

1. Atributos privados:
   - marca (String)
   - modelo (String)
   - velocidad (int)

2. Constructores:
   - Constructor por defecto (velocidad inicia en 0)
   - Constructor con marca y modelo
   - Constructor con marca, modelo y velocidad

3. Getters y Setters de todos los atributos.

4. Métodos de comportamiento:
   - acelerar(int cantidad): aumenta la velocidad
   - frenar(int cantidad): disminuye la velocidad sin permitir valores negativos
   - mostrarInfo(): imprime marca, modelo y velocidad

5. Métodos con bucles:
   - acelerarHasta(int objetivo): usando un bucle FOR,
       aumenta la velocidad desde la actual hasta llegar al objetivo.
   - cuentaAtrasVelocidad(): usando WHILE,
       muestra la velocidad hacia abajo hasta llegar a 0.

6. Clase principal (main):
   - Crea 2 coches con distintos constructores.
   - Modifica datos usando setters.
   - Llama a todos los métodos de comportamiento.
   - Usa los métodos con bucles.
   - Muestra la información final del coche usando mostrarInfo().
*/


package a0_practicas;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    //Constructor todo a 0
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.velocidad = 0;
    }
    //Constructor con parámetros
    public Coche(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
    }

    public Coche(String marca, String modelo, int velocidad) {
        this.marca=marca;
        this.modelo=modelo;
        this.velocidad= velocidad;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }



    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public void frenar(int cantidad) {
        if (velocidad - cantidad < 0) {
            velocidad = 0;
        } else {
            velocidad -= cantidad;
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }


    public void acelerarHasta(int objetivo) {

        for (int i = velocidad; i <= objetivo; i++) {
            velocidad = i;
            System.out.println("Velocidad actual: " + velocidad + " km/h");
        }
    }

    public void cuentaAtrasVelocidad() {

        while (velocidad > 0) {
            System.out.println("Velocidad: " + velocidad);
            velocidad--;  // restamos 1
        }

        System.out.println("El coche está detenido (velocidad = 0).");
    }



    @Override
    public String toString() {

        return "La marca del coche es " + getMarca() + ", el modelo es " + getModelo() + " la velocidad es " + getVelocidad();

    }
}

