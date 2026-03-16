// 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
// sus datos.
// 3. Añaade un constructor a la clase Book que reciba title y author.
// 2. Crea una clase Dog con un mÃ©todo bark() que imprima su sonido.
// 4. Crea una clase Car con atributos brand y model y un mÃ©todo showData().

// 5. Crea una clase Student con atributo score y un mÃ©todo que diga si aprobÃ³
// (mayor o igual a 60).

// 6. Crea una clase BankAccount con atributo balance y un mÃ©todo deposit() que
// sume el saldo.

// 7. Crea una clase Rectangle con mÃ©todos para calcular el Ã¡rea y el perÃ­metro.

// 8. Crea una clase Worker que reciba nombre y salario, y un mÃ©todo para
// mostrar su salario.

// 9. Crea varios objetos Person y guÃ¡rdalos en un ArrayList.

// 10. Crea una clase Product y un mÃ©todo que aplique un descuento sobre su
// precio.

package c08_opp.Ejercicios;
import java.util.Scanner;
public class Principal {

    public static void bark() {
        System.out.println("Guau!");
    }


    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
        // sus datos.
        // 3. Añaade un constructor a la clase Book que reciba title y author.

        var book1 = new Book("La vida de una poronga", "Ivan B");
        book1.TheBook();

        book1.setTitle("la vida de un programador calvo");
        System.out.println(book1);

        var book2 = new Book();

        // 2. Crea una clase Dog con un mÃ©todo bark() que imprima su sonido.
        bark();

        // 4. Crea una clase Car con atributos brand y model y un mÃ©todo showData().

        var coche1 = new Car("Renault", "Megane");
        coche1.showData();

        System.out.println(coche1);


        float num1;
        float num2;
        Scanner in = new Scanner(System.in);

        System.out.println("¿Cual es la medida de tu primer lado?");
        num1 = in.nextFloat();
        System.out.println("¿Cual es la medida de tu segundo lado?");
        num2 = in.nextFloat();

        Rectangulo r2 = new Rectangulo(num1, num2);
        System.out.println(r2);
        System.out.println(r2.isCuadrado()? "Es un cuadrado":"No es un cuadrado");



    }

}