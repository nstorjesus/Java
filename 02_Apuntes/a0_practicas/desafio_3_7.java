//Create a class named "Challenge3_7.java".
//a) Show the numbers from 1 to 100 that which are multiple of 4 (4, 8, 12, 16…).
//b) Modify the previous exercise to show the multiples of 4 that are not multiple of 5.


package a0_practicas;
import java.util.Scanner;

public class desafio_3_7 {

    public static void main(String[] args) {

        System.out.println("Múltiplos de 4 entre 1 y 100:");
        for (int i = 4; i <= 100; i += 4) {
            System.out.println(i);
        }

        System.out.println("\nMúltiplos de 4 que NO son múltiplos de 5:");
        for (int i = 4; i <= 100; i += 4) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }

    }
}
