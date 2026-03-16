package com.prog03.principal;

import com.prog03.figuras.Rectangulo;

public class principal {

    public static void main(String[] args) {

        // Primer rectángulo usando el constructor vacío
        Rectangulo r1 = new Rectangulo();
        r1.setBase(5.0f);
        r1.setAltura(10.0f);

        System.out.println("Primer rectángulo");
        System.out.println(r1.toString());
        System.out.println(r1.isCuadrado() ? "Es cuadrado" : "No es cuadrado");

        System.out.println();

        // Segundo rectángulo usando el constructor con parámetros
        Rectangulo r2 = new Rectangulo(7.0f, 7.0f);

        System.out.println("Segundo rectángulo");
        System.out.println(r2.toString());
        System.out.println(r2.isCuadrado() ? "Es cuadrado" : "No es cuadrado");
    }
}
