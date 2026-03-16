/*
EJERCICIO 2. 

Crea una clase Rebajas, con atributos precio y precioRebajado (double ambos) y 
que tenga un método descubrePorcentaje() que descubra el descuento aplicado en un producto.
El método recibe el precio original del producto y el rebajado y halla el porcentaje.

double descubrePorcentaje(double precio, double PrecioRebajado)
Mostrar también el toString del objeto Rebajas
*/

public class Rebajas {
    
    double precioOriginal;
    double precioRebajado;

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public void setPrecioRebajado(double precioRebajado) {
        this.precioRebajado = precioRebajado;
    }

    public double descubrePorcentaje(double precioOriginal, double precioRebajado) {
        double calculo = ((precioOriginal - precioRebajado) / precioOriginal) * 100;
        return calculo;
    }

    @Override 
    public String toString() {
        return "Rebajas: Antes " + this.precioOriginal + " | Ahora " + this.precioRebajado;
    }
}