
/*
1.- Crea un proyecto en Netbeans denominado PROG02_Ejerc1 con una clase clase y método main y declara e inicializa una variable para almacenar cada uno de los siguientes valores. Trata de utilizar el tipo de datos de mas se ajuste a los datos. Justifica tu elección.

Valor máximo no modificable: 5000.
Si el nuevo empleado tiene carnet de conducir o no.
Un mes del año en formato numérido y como cadena.
El nombre y apellidos de una persona.
Sexo: con dos valores posibles 'V' o 'M'.
Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
Saldo de una cuenta bancaria.
Distancia en kms desde la Tierra a Júpiter.
 */
public class PROG02_Ejerc1 {

    public static void main(String args[]) {
        final int NoModificables = 5000; // Este tipo de datos se utiliza para declarar constantes
        boolean carnet = true; //Este tipo de dato se utilza para saber si una variable es true o false
        int mes = 10; //Este tipo de dato se utiliza para variables de tipo entero como números sin decimales
        String Mes = "Diciembre" ; //Este tipo de dato se utiliza para variables de tipo cadena de texto
        String nombre = "Nestor Yagual" ; //Este tipo de dato se utiliza para variables de tipo cadena de texto
        char sexo = 'M' ; //Este tipo de dato se utiliza para variables de tipp caracter, es decir, solo me deja poner un caracter, en este caso (M) masculino o (F) femenino
        long ms = 6565656 ; // //Este tipo de dato se utiliza para variables de tipo entero con valores muy garndes
        double dinero = 0.0 ; //Este tipo de dato se utiliza para variables con decimal
        double KmTierra = 0 ; //Este tipo de dato se utiliza para variables con decimal
        
        System.out.print(NoModificables + "\n");
        System.out.print(carnet + "\n");
        System.out.print(mes + "\n");
        System.out.print(Mes + "\n");
        System.out.print(nombre + "\n");
        System.out.print(sexo + "\n");
        System.out.print(ms + "\n");
        System.out.print(dinero + "\n");
        System.out.print(KmTierra + "\n");
    }
}
