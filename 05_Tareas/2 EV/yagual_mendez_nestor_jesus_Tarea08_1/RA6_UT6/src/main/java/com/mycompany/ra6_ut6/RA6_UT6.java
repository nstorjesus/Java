

package com.mycompany.ra6_ut6;

public class RA6_UT6 {

    public static void main(String[] args) {

        // --- EJERCICIO 1 ---
        String codigo = "WXYZ-12";
        String regex = "[A-Z]{3}-[0-9]{4}";

        System.out.println("--- Ejercicio 1 ---");
        System.out.println("Código analizado: " + codigo);

        if (codigo.matches(regex)) {
            System.out.println("Resultado: El código es correcto.");
        } else {
            System.out.println("Resultado: El código NO es válido (Formato incorrecto).");
        }

        System.out.println();

        // --- EJERCICIO 2 ---
        String texto = "10#20#30#40";
        String[] partes = texto.split("#");
        int[] temps = new int[partes.length];
        double suma = 0;

        for (int i = 0; i < partes.length; i++) {
            temps[i] = Integer.parseInt(partes[i]);
            suma = suma + temps[i];
        }

        double media = suma / temps.length;

        System.out.println("--- Ejercicio 2 ---");
        System.out.println("Temperaturas detectadas: " + temps.length);
        System.out.println("La media es: " + media + " grados.");

        System.out.println();

        // --- EJERCICIO 3 ---
        int[][] matriz = new int[3][];
        matriz[0] = new int[2];
        matriz[1] = new int[4];
        matriz[2] = new int[3];

        matriz[0][0] = 10; matriz[0][1] = 20;
        matriz[1][0] = 5;  matriz[1][1] = 5;  matriz[1][2] = 5;  matriz[1][3] = 5;
        matriz[2][0] = 100; matriz[2][1] = 200; matriz[2][2] = 300;

        System.out.println("--- Ejercicio 3 ---");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Balda " + i + ": [ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}