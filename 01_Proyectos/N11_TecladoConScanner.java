import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class N11_TecladoConScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nombre = "Ingrese su nombre: ";
        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("¿cual es su nombre?");
        nombre = in.nextLine(); // Lee una línea de texto ingresada por el usuario: Si guardamos tecto sera Line

        System.out.println("dame el primer valor para su suma:");
        num1 = in.nextInt(); // Lee un número entero ingresado por el usuario. Si guardamos un entero sera nextInt

        System.out.println("dame el segundo valor para su suma:");
        num2 = in.nextInt(); // Lee otro número entero ingresado por el usuario

        resultado = num1 + num2; // Suma los dos números ingresados

        System.out.println("Hola " + nombre + ", el resultado de la suma es: " + resultado); // Muestra el resultado de la suma junto con el nombre del usuario
        }
    
}
