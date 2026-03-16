package bloque3_herencia;

public class ClaseAbstracta {

    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA DE CLASES ABSTRACTAS Y POLIMORFISMO ===\n");

        // 1. Instanciamos la clase hija (Moto)
        // Fíjate en el Polimorfismo: Declaramos un Vehiculo (izquierda), 
        // pero instanciamos una Moto (derecha).
        Vehiculo miMoto = new Moto("Yamaha", 600);

        // 2. Llamamos a un método normal heredado del padre
        miMoto.arrancar();

        // 3. Llamamos al método abstracto que hemos sobrescrito (Enlace Dinámico)
        // Java ejecuta el ruido de la moto, no el del vehículo genérico.
        miMoto.hacerRuido();
        
        System.out.println("\n------------------------------------------------");
        
        /* * PREGUNTA DE EXAMEN (Descomenta la línea de abajo quitando las dos barras //)
         * Si intentas crear un objeto directo de la clase Vehiculo, NetBeans 
         * te dará un error en rojo que dice: "Vehiculo is abstract; cannot be instantiated"
         */
        
        // Vehiculo miCoche = new Vehiculo("Ford"); 
    }
}