 /*
 * EJERCICIO: CALCULADORA DE GASTOS DE ENVÍO
 * * Una empresa de logística necesita un programa para calcular el 
 * coste de envío de sus paquetes según las siguientes reglas:
 * * 1. Entrada de datos (por teclado):
 * - Peso del paquete (kg).
 * - Distancia del envío (km).
 * * 2. Cálculo de la Tarifa Base según el peso:
 * - Menos de 5 kg: 5€
 * - Entre 5 kg y 15 kg (inclusive): 10€
 * - Más de 15 kg: 20€
 * * 3. Suplemento por Distancia:
 * - Si la distancia es > 100 km, se cobra 0.50€ por cada km adicional
 * (solo se cobran los kilómetros que pasan de 100).
 * * 4. Salida de datos:
 * - Mostrar el desglose: Coste base, Recargo por distancia y Total.
 */

import java.util.Scanner; // Importamos la utilidad para leer datos

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Creamos una instancia de nuestra clase lógica
        CalculadoraEnvios calculadora = new CalculadoraEnvios();

        // --- ENTRADA DE DATOS ---
        System.out.println("--- GESTIÓN DE ENVÍOS DAW ---");
        System.out.print("Introduce el peso del paquete (kg): ");
        double pesoEntrada = sc.nextDouble();
        
        System.out.print("Introduce la distancia del envío (km): ");
        double distanciaEntrada = sc.nextDouble();

        // --- CÁLCULOS (Llamando a los métodos de la otra clase) ---
        double costeBase = calculadora.calcularTarifaBase(pesoEntrada);
        double suplemento = calculadora.calcularSuplemento(distanciaEntrada);
        double total = costeBase + suplemento;

        // --- SALIDA DE RESULTADOS ---
        System.out.println("\n--- RESUMEN DEL ENVÍO ---");
        System.out.println("Coste Base: " + costeBase + "€");
        System.out.println("Suplemento distancia: " + suplemento + "€");
        System.out.println("-------------------------");
        System.out.println("TOTAL A PAGAR: " + total + "€");
        
        sc.close(); // Cerramos el scanner por buena práctica
    }
}
