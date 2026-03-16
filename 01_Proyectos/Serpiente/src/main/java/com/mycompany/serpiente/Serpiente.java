import java.util.Scanner;

public class Serpiente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int serpienteX = 5;
        int serpienteY = 5;
        int comidaX = 3;
        int comidaY = 3;
        boolean juegoTerminado = false;
        int turno = 1; // Contador de turnos para no perdernos en NetBeans

        System.out.println("--- SNAKE PARA NETBEANS ---");
        System.out.println("IMPORTANTE: Escribe la letra y PULSA ENTER.");
        System.out.println("Pulsa ENTER para empezar...");
        teclado.nextLine();

        while (!juegoTerminado) {
            
            // EN NETBEANS USAMOS UNA BARRA PARA SEPARAR TURNOS
            System.out.println("---------------- TURN " + turno + " ----------------");
            
            // DIBUJAR TABLERO
            for (int fila = 0; fila < 10; fila++) {
                for (int col = 0; col < 10; col++) {
                    if (fila == serpienteY && col == serpienteX) {
                        System.out.print("O ");
                    } else if (fila == comidaY && col == comidaX) {
                        System.out.print("@ ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println(); 
            }

            // INSTRUCCIONES CLARAS
            System.out.println("---------------------------------------");
            System.out.print("Escribe w/a/s/d y PULSA ENTER: ");
            
            // LEER
            String entrada = teclado.next().toLowerCase();
            char direccion = entrada.charAt(0);

            // CALCULAR MOVIMIENTO (Lógica blindada)
            int nuevaX = serpienteX;
            int nuevaY = serpienteY;

            if (direccion == 'w') nuevaY--;
            if (direccion == 's') nuevaY++;
            if (direccion == 'a') nuevaX--;
            if (direccion == 'd') nuevaX++;

            // DETECTAR CHOQUE
            if (nuevaX < 0 || nuevaX >= 10 || nuevaY < 0 || nuevaY >= 10) {
                System.out.println("\n¡PUM! Te has chocado contra la pared.");
                System.out.println("Has sobrevivido " + turno + " turnos.");
                juegoTerminado = true;
            } else {
                // MOVER
                serpienteX = nuevaX;
                serpienteY = nuevaY;

                // COMER
                if (serpienteX == comidaX && serpienteY == comidaY) {
                    System.out.println("¡RICO! Manzana comida.");
                    comidaX = (int) (Math.random() * 10);
                    comidaY = (int) (Math.random() * 10);
                }
            }
            turno++;
        }
    }
}