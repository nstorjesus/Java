package c05_structures;

import java.util.ArrayList;

public class List {

    public static void main (String[] args) {

        //Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño del ArrayList
        System.out.println(names.size()); //Imprimirá 0 porque no le hemos dicho
                                          //el tamaño de este ArrayList

        // Añadir elementos

        names.add("Nestor");              //Elemento en la posicion 0
        System.out.println(names.size()); //Al añadir un dato, imprimirá el tamaño de 1
                                          //Con esto vemos que el ArrayList es dinámico
                                          //Cambia su tamaño con lo que añadamos y no es
                                          // estático como el ARRAY donde fijabamos un tamaño
                                          // al inicio

        //Acceder a los elementos
        names.add("Jesus");
        names.add("Yagual");
        System.out.println(names.getFirst()); //Me imprime el elemento 0 del ArrayList "names" (Nestor)
        System.out.println(names.getLast());  //Me imprimer el último elemento del ArrayList "names" (Yagual)
        System.out.println(names.get(1));     //Me imprimer el elemento de la posicion 1 del ArrayList "names" (Jesus)

        //Modificar los elememos

        names.set(2,"Una poronga");
        System.out.println(names.getLast()); //Ahora me imprimirá "Una poronga" en vez de "Yagual"

        //Eliminar elementos

        names.remove(2);               // Elimino el último elemento "Una Poronga"
      //System.out.println(names.getLast());    Esto me dará error en JAVA porque estamos intentando
                                             //acceder a un indice que no existe

        //Buscar elementos

        System.out.println(names.contains("Nestor")); //Este ArrayList contiene la cadena de texto "Nestor"?
                                                      //Me imprimirá un True
        System.out.println(names.contains("Una poronga")); //Imprimirá False porque eliminamos este elemento antes

        //Eliminar o limpiar ArrayList
        names.clear();
        System.out.println(names.size()); //Ahora imprimirá el tamaño 0 porque ya no hay elementos en este
                                          //ArrayList



    }
}
