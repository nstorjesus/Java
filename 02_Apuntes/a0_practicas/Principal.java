/*
    ============================
      EJERCICIO PROPUESTO
        - Clase Circulo -
    ============================

    Crea una clase llamada "Circulo" con las siguientes características:

    --------------------------------
    Atributos:
    --------------------------------
    - float radio   (representa el radio del círculo)

    --------------------------------
    Constructores:
    --------------------------------
    1) Constructor sin parámetros
       → Debe inicializar radio a 0.

    2) Constructor con un parámetro (float radio)
       → Debe inicializar el atributo con ese valor.

    --------------------------------
    Métodos:
    --------------------------------
    - Getter y Setter de radio.

    - float getArea()
        Calcula y devuelve el área del círculo.
        Fórmula: área = π * radio^2

    - float getPerimetro()
        Calcula y devuelve el perímetro del círculo.
        Fórmula: perímetro = 2 * π * radio

    - boolean isCero()
        Devuelve true si el radio es 0.

    - String toString()
        Si radio == 0:
            → "El círculo no tiene tamaño (radio 0)"
        Si radio > 0:
            → "Círculo de radio X, área Y y perímetro Z"

    --------------------------------
    En tu clase Principal (la misma que ya tienes):
    --------------------------------

    1) Pide al usuario un número por teclado usando Scanner.
       Será el radio del círculo.

    2) Crea DOS objetos Círculo:
        - Uno usando el constructor vacío.
        - Otro usando el constructor con radio.

    3) Muestra ambos objetos con System.out.println()
       (que llamará automáticamente al método toString())

    ---------------------------------------
    Nivel EXTRA (opcional, para practicar):
    ---------------------------------------

    Añade a la clase Círculo:
        boolean esIgual(Circulo otro)
        - Devuelve true si los radios de ambos círculos son iguales.

    En Principal, compara los dos objetos creados y muestra si son iguales.

    ============================
      FIN DEL EJERCICIO
    ============================
*/


package a0_practicas;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float num1;
        float num2;

        System.out.println("Radio del primer circulo");
        num1 = in.nextFloat();
        System.out.println("Radio del segundo circulo");
        num2 = in.nextFloat();

        Circulo c1 = new Circulo(num1);
        System.out.println(c1);

        Circulo c2 = new Circulo();
        c2.setRadio(num2);
        System.out.println(c2);

        System.out.println(c1.esIgual(c2)? "Ambos circulos son iguales" : "Los circulos no son iguales");




    }


}
