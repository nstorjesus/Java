
package com.mycompany.examenev1;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escribe marca del coche");
        String marca1 = in.nextLine();
        
        System.out.println("Escribe modelo del coche");  
        String modelo1 = in.nextLine();
        
        Coche c1 = new Coche(marca1, modelo1, 0);
        
        System.out.println("=== Prueba del sistema ===");
        System.out.println("La marca del coche es:"+ c1.getmarca());
        System.out.println("El modelo del coche es:"+ c1.getmodelo());
        
        //métodos básicos
        c1.enceder();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c1.frenar();
        
        
        //Aceleración rápida
        c1.aceleracionRapida();
        
        //Frenada Progresiva
        c1.frenadaProgresiva();
        
        //Arranque especial
        c1.arranqueEspecial();
        
        //Información final
        System.out.println(c1);

        

    }
}
