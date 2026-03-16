import java.util.Scanner;

public class Prog04_Ejerc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 1000.0;
        int opcion = 0;

        System.out.println("=== CAJERO AUTOMÁTICO ===");

        while (opcion != 3) {

            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Saldo actual: " + saldo + "€");
                    break;

                case 2:
                    System.out.print("¿Cuánto quieres retirar? ");
                    double cantidad = sc.nextDouble();

                    if (cantidad <= 0) {
                        System.out.println("Error: La cantidad debe ser mayor que cero.");
                    } else if (cantidad > saldo) {
                        System.out.println("Error: Fondos insuficientes.");
                    } else {
                        saldo -= cantidad;
                        System.out.println("Retirado: " + cantidad + "€");
                        System.out.println("Saldo restante: " + saldo + "€");
                    }
                    break;

                case 3:
                    System.out.println("¡Gracias por usar nuestro cajero!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }

        sc.close();
    }
}
