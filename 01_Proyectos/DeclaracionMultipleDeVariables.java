
public class DeclaracionMultipleDeVariables {


    public static void main(String args[]) {
       
        int operador1, operador2, operador3; //Se puede declarar de forma múltiple
        int operador4=1, operador5=5, operador6=operador4 + operador5; //se puede declarar e inicializar de forma múltiple
        
        operador1=7;
        operador2=10;
        operador3=1;
        
        System.out.println(operador1 + operador2 + operador3);
        System.out.println(operador6);
    }
}
