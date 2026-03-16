package c05_structures;

public class Arrays {

    public static void main (String[] args) {

        // Declaracion y creación de un Array
        // Con el dato .length acabo viendo la longitud

        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Nestor", "Yagual", "Tecno-Automatiza"};
        System.out.println(names);

        //Acceso a esos datos
        System.out.println(names[0]); //Accedo a la posicion 0 de names que es Nestor


        //Modificar
        //Designo los enteros a los huevos que hemos reservado en numbers[3]
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //numbers[3] = 4; daria error porque no tengo mas de 3 espacios reservados a ese Array

    }
}
