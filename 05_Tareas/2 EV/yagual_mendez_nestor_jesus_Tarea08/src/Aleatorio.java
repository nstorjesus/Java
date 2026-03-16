public class Aleatorio {
    
    public static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}