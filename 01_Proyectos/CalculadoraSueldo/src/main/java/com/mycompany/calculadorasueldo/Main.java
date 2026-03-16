 /*
 * EJERCICIO: CALCULADORA DE SALARIO SEMANAL
 * * OBJETIVO: Crear un programa modular para calcular el sueldo de empleados.
 * * ESTRUCTURA DEL PROYECTO:
 * 1. Clase 'CalculadoraSueldo' (Lógica):
 * - Método 'calcularBruto(double horas)': 
 * * Primeras 40h -> 15€/h.
 * * Horas extra (más de 40) -> 25€/h cada una.
 * - Método 'calcularImpuestos(double sueldoBruto)':
 * * Si bruto <= 600€ -> 0€ de impuestos.
 * * Si bruto > 600€ -> 15% de impuestos sobre el total.
 * * 2. Clase 'Principal' (Main e Interacción):
 * - Pedir por teclado (Scanner) las horas trabajadas.
 * - Instanciar la calculadora.
 * - Mostrar el desglose: Sueldo Bruto, Impuestos y Sueldo Neto.
 * * REGLA DE ORO: No hagas los cálculos en el Main, usa los métodos de la clase.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
    }
    
}
