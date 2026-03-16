import java.util.Scanner;

public class Prog04_Ejerc2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String repetir = "s";

        System.out.println("=== SUMADOR DE NÚMEROS ===");

        while (repetir.equalsIgnoreCase("s")) {

            System.out.print("¿Cuántos números quieres sumar? ");
            int cantidad = sc.nextInt();

            double suma = 0.0;

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Número " + i + ": ");
                double num = sc.nextDouble();
                suma += num;
            }

            System.out.println("\nLa suma total es: " + suma);

            System.out.print("\n¿Quieres hacer otra suma? (s/n): ");
            repetir = sc.next();
        }

        System.out.println("¡Adiós!");

        sc.close();
    }
}
