public class CalculadoraEnvios {

    // Método para calcular la tarifa base según el peso
    public double calcularTarifaBase(double peso) {
        double tarifa;
        
        if (peso < 5) {
            tarifa = 5.0;
        } else if (peso <= 15) { // Entre 5 y 15 inclusive
            tarifa = 10.0;
        } else { // Más de 15 kg
            tarifa = 20.0;
        }
        
        return tarifa;
    }

    // Método para calcular el suplemento si supera los 100km
    public double calcularSuplemento(double distancia) {
        double suplemento = 0;
        
        if (distancia > 100) {
            // Calculamos cuántos km se pasa del límite de 100
            double kmAdicionales = distancia - 100;
            suplemento = kmAdicionales * 0.50;
        }
        
        return suplemento;
    }
}








