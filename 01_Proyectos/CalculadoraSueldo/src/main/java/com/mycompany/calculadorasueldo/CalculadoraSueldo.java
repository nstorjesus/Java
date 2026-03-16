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



        if (peso < 5) {
            tarifa = 5.0;
        } else if (peso <= 15) { // Entre 5 y 15 inclusive
            tarifa = 10.0;
        } else { // Más de 15 kg
            tarifa = 20.0;
        }
 */
public class CalculadoraSueldo {

    public double calcularBruto (double horas){
        double precioHoraNormal = 15;
        double precioHoraExtra = 25;
        
        if (horas <= 40){
           return horas * precioHoraNormal;
           
            } else {
                double diferencia = horas-40;
                return (40*precioHoraNormal) + (diferencia*precioHoraExtra);
            }
 
        
    }
    
    public double calcularRetencion(double sueldoBruto) {

        double impuesto = 0;

        // 2. Usamos el IF para ver si supera los 600 euros
        if (sueldoBruto > 600) {
            // AQUÍ TU LÓGICA: 
            // El impuesto será el sueldoBruto multiplicado por 0.15
         impuesto = sueldoBruto * 0.15;
    }

        // 3. Devolvemos el resultado
    return impuesto;
}
}
