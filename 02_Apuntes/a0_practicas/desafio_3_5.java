//Create a class named "Challenge3_5.java".
//a) By using the “for” statement, write the 7 times table (multiplication table).
//b) Modify the previous exercise to write all times tables from 1 to 10.


//Tabla de multipicar
package a0_practicas;
import java.util.Scanner; //importo la libreria Scanner para la entrada de datos

public class desafio_3_5 {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int num1=0;
        int mul1=0;

        System.out.println("Escribe tu número");
        num1 = in.nextInt();

        System.out.println("______________________________________");
        System.out.println("La tabla de multiplicar de " + num1 + " es:");
        System.out.println("______________________________________");
        for (int i = 1; i<=10; i++) {
            mul1 = num1 * i;
            System.out.println(num1 + " x "+ i +" = " + mul1);
        }
    }
}
