/* relizar un programa que pueda realizar una semna, una resta, una multiplicacion o una división
 * de dos numerot enteros, dependidnedo de la decisión del usuario
 * 
 * - Si operacion es igual a 1, realizar una suma
 * - Si opreracion es igual a 2, realizar una resta
 * - Si operacion es igual a 3, realizar una multiplicación
 * - Si operacion es igual a 4, realizar una división
 * - Si operacion no es ninguna de las anteriores, mostrar un mensaje de error
 */


public class N10_1_CondicionalesAnidadas {
    public static void main(String[] args) {

        int operacion=4;
        int num1=8;
        int num2=3;
        int resultado=0;

        if(operacion ==1) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion == 2){
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + (num1 - num2));

        } else if (operacion == 3) {
            resultado = num1 * num2;    
            System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
        } else if (operacion == 4) {
            resultado = num1 / num2;    
            System.out.println("El resultado de la division es: " + ((double)num1 / num2)); // casteo para obtener un resultado decimal
        } else {
            System.out.println("Error: Operación no válida");
        }
    }
}
