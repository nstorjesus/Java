package tarea08;
import java.util.*;

public class PrincipalEjercicio8 {

    public static void main(String[] args) {
        
        HashMap<String, String> diccionario = new HashMap<>();
        
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("cielo", "sky");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");
        diccionario.put("arbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("blanco", "white");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra en español para traducir:");
        String palabra = teclado.nextLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {
            System.out.println("La traducción en inglés es: " + diccionario.get(palabra));
        } else {
            System.out.println("Lo siento, esa palabra no está en el diccionario.");
        }
    }
}