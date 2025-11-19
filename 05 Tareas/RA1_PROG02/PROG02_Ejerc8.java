/*
8.- Diseña un programa Java denominado PROG02_Ejerc8 que dados el número de alumnos matriculados en Programación, número de alumnos matriculados en Entornos de Desarrollo y número de alumnos matriculados en Base de datos.
El programa deberá mostrar el % de alumnos matriculado en cada uno de los tres módulos. Se supone que un alumno sólo puede estar matrículado en un módulo. Trata de mostrar un solo decimal en los porcentajes
*/
import java.util.Scanner;

public class PROG02_Ejerc8 {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int programacion = 0;
        int entornos = 0;
        int baseDatos = 0;
        int total = 0;
        
       
        
        System.out.print("Número de alumnos en Programación: ");
        programacion = sc.nextInt();

        System.out.print("Número de alumnos en Entornos de Desarrollo: ");
        entornos = sc.nextInt();

        System.out.print("Número de alumnos en Base de Datos: ");
        baseDatos = sc.nextInt();

    
        total = programacion + entornos + baseDatos;

        if (total == 0) {
            System.out.println("No hay alumnos matriculados en ningún módulo.");
        } else {
            double porcProgramacion = (double) programacion / total * 100;
            double porcEntornos = (double) entornos / total * 100;
            double porcBaseDatos = (double) baseDatos / total * 100;

        
            System.out.println("\n--- Porcentaje de alumnos por módulo ---");
            System.out.printf("Programación: %.1f%%%n", porcProgramacion);
            System.out.printf("Entornos de Desarrollo: %.1f%%%n", porcEntornos);
            System.out.printf("Base de Datos: %.1f%%%n", porcBaseDatos);
    }
}
}    
    
