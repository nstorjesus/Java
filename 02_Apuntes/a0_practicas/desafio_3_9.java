/*
Crea una clase llamada "Challenge3_9.java".

Usando la sentencia "while", haz un programa que almacene en una variable
un número secreto entre 1 y 10.

El programa debe pedir al usuario que introduzca un número para intentar
adivinar el número secreto.

Cada vez que el usuario introduzca un número, el programa debe indicar:
- si el número introducido es menor que el número secreto,
- si es igual,
- si es mayor que el número secreto,
- o si el usuario ha acertado (en ese caso, el programa debe terminar).
*/


package a0_practicas;
import java.util.Random;
import java.util.Scanner;

public class desafio_3_9 {

    public static void main(String[] args){

        Random random = new Random();
        int numero = random.nextInt(10) + 1;
        System.out.println(numero);
        Scanner in = new Scanner (System.in);
        int num1 = 0;



        while (num1 != numero) {

            System.out.println("Escribe tu número");
            num1 = in.nextInt();

            if (num1 > numero) {
                System.out.println("El número es mayor al random");
            } else if (num1 < numero) {
                System.out.println("El número es menor al random");
            } else {
                System.out.println("¡Has acertado!");
            }
        }
    }
}