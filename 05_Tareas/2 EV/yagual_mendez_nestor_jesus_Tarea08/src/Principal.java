
import java.util.Scanner; // Importamos la herramienta para leer del teclado

public class Principal {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        // ==========================================
        // EJERCICIO 1: PERRO
        // ==========================================
        System.out.println("---- EJERCICIO 1 ----");

        Perro miPerro = new Perro();
        miPerro.color = 'n';
        miPerro.edad = 5;

        System.out.println("El perro es de color: " + miPerro.color);
        System.out.println("Tiene una edad de: " + miPerro.edad + " años.");
        System.out.println("-------------------");

        // ==========================================
        // EJERCICIO 2: REBAJAS
        // ==========================================
        System.out.println("---- EJERCICIO 2 ----");


        System.out.print("Dime el precio original: ");
        double original = teclado.nextDouble();

        System.out.print("Dime el precio rebajado: ");
        double rebajado = teclado.nextDouble();


        Rebajas misRebajas = new Rebajas();


        misRebajas.setPrecioOriginal(original);
        misRebajas.setPrecioRebajado(rebajado);


        double elDescuento = misRebajas.descubrePorcentaje(original, rebajado);

        System.out.println("El descuento ha sido de un: " + elDescuento + "%");
        System.out.println(misRebajas);

        System.out.println("-------------------");

        
        // ==========================================
        // EJERCICIO 3: PACIENTE
        // ==========================================
        System.out.println("---- EJERCICIO 3 ----");
        

        Paciente miPaciente = new Paciente();

        teclado.nextLine(); 
        
        System.out.print("Introduce el Nombre: ");
        String nom = teclado.nextLine();
        miPaciente.setNombre(nom);
        
        System.out.print("Introduce el NSS: ");
        String nss = teclado.nextLine();
        miPaciente.setNss(nss);
        
        System.out.print("Introduce la Dirección: ");
        String dir = teclado.nextLine();
        miPaciente.setDireccion(dir);
        
        System.out.print("Introduce la Edad: ");
        int edad = teclado.nextInt();
        miPaciente.setEdad(edad);
       
        
        System.out.println("--- DATOS DEL PACIENTE ---");
        System.out.println("Nombre: " + miPaciente.getNombre());
        System.out.println("NSS: " + miPaciente.getNss());
        System.out.println("Dirección: " + miPaciente.getDireccion());
        System.out.println("Edad: " + miPaciente.getEdad());
        
        System.out.println("-------------------");

        
        
        // ==========================================
        // EJERCICIO 4: NUMERO
        // ==========================================
        System.out.println("---- EJERCICIO 4 ----");        
        
        teclado.nextLine(); 
        
        System.out.print("Introduce el número: ");
        int valorLeido = teclado.nextInt();
        
        Numero miNumero = new Numero(valorLeido);
        
        System.out.println("El doble de " + valorLeido + " es " + miNumero.getDoble());
        System.out.println("El triple de " + valorLeido + " es " + miNumero.getTriple());
        
        miNumero.suma(15);
        System.out.println("Si le sumamos 15, ahora vale: " + miNumero.getNumero());

        System.out.println("-------------------");
      
        // ==========================================
        // EJERCICIO 5: EMPLEADO
        // ==========================================
  
        System.out.println("---- EJERCICIO 5 ----");
        
        // ------ Empleado 1 -------
        teclado.nextLine(); 
        
        System.out.println("Introduce los datos del empleado");
        
        System.out.println("Nombre del empleado: ");
        String nombreAux = teclado.nextLine();
        
        System.out.print("Introduce el DNI: ");
        String dniAux = teclado.nextLine();
        
        System.out.print("Introduce el Sueldo: ");
        double sueldoAux = teclado.nextDouble();
        
        Empleado e1 = new Empleado(nombreAux, dniAux, sueldoAux);
        
        System.out.println("¡Contratado! Bienvenido " + e1.getNombre());
        System.out.println("Total empleados ahora: " + Empleado.getNumEmpleados());
        
        // ------ Empleado 2 -------
        teclado.nextLine(); 
        
        System.out.println("Introduce los datos del empleado");
        
        System.out.println("Nombre del empleado: ");
        nombreAux = teclado.nextLine();
        
        System.out.print("Introduce el DNI: ");
        dniAux = teclado.nextLine();
        
        System.out.print("Introduce el Sueldo: ");
        sueldoAux = teclado.nextDouble();
        
        Empleado e2 = new Empleado(nombreAux, dniAux, sueldoAux);
        
        System.out.println("¡Contratado! Bienvenido " + e2.getNombre());
        System.out.println("Total empleados ahora: " + Empleado.getNumEmpleados());        
        
        // ------ Empleado 3 -------
        
        teclado.nextLine(); 
        
        System.out.println("Introduce los datos del empleado");
        
        System.out.println("Nombre del empleado: ");
        nombreAux = teclado.nextLine();
        
        System.out.print("Introduce el DNI: ");
        dniAux = teclado.nextLine();
        
        System.out.print("Introduce el Sueldo: ");
        sueldoAux = teclado.nextDouble();
        
        Empleado e3 = new Empleado(nombreAux, dniAux, sueldoAux);
        
        System.out.println("¡Contratado! Bienvenido " + e3.getNombre());
        System.out.println("Total empleados ahora: " + Empleado.getNumEmpleados());
     
        System.out.println("-------------------");

        
        // ==========================================
        // EJERCICIO 6: CONTAR
        // ==========================================
        System.out.println("---- EJERCICIO 6 ----");
        
        System.out.print("Introduce valor inicial del contador: ");
        int valContador = teclado.nextInt();
        
        Contador miContador = new Contador(valContador);
        
        miContador.incrementar();
        System.out.println("Valor tras incrementar: " + miContador.getValor());
        
        miContador.decrementar();
        System.out.println("Valor tras decrementar: " + miContador.getValor());
        
        System.out.println("-------------------");        


        // ==========================================
        // EJERCICIO 7: CADENA
        // ==========================================
        System.out.println("---- EJERCICIO 7 ----");
        
        teclado.nextLine(); 
        
        System.out.print("Introduce una frase o palabra: ");
        String textoUsuario = teclado.nextLine();
        
        Cadena miCadena = new Cadena(textoUsuario);
        
        System.out.println("Texto guardado: " + miCadena.getTexto());
        System.out.println("Longitud: " + miCadena.getLongitud());
        System.out.println("Primera letra: " + miCadena.getPrimeraLetra());
        
        System.out.println("-------------------");        


        // ==========================================
        // EJERCICIO 8: ALEATORIO
        // ==========================================
        System.out.println("---- EJERCICIO 8 ----");
        
        System.out.print("Introduce mínimo: ");
        int min = teclado.nextInt();
        
        System.out.print("Introduce máximo: ");
        int max = teclado.nextInt();
        
        int numeroGenerado = Aleatorio.generarNumero(min, max);
        System.out.println("Número aleatorio generado: " + numeroGenerado);
        
        System.out.println("-------------------");        


        // ==========================================
        // EJERCICIO 9: MATEMÁTICAS
        // ==========================================
        System.out.println("---- EJERCICIO 9 ----");
        
        System.out.print("Introduce primer número: ");
        int numA = teclado.nextInt();
        
        System.out.print("Introduce segundo número: ");
        int numB = teclado.nextInt();
        
        System.out.println("Suma: " + Matematicas.sumar(numA, numB));
        System.out.println("Resta: " + Matematicas.restar(numA, numB));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(numA, numB));
        System.out.println("División: " + Matematicas.dividir(numA, numB));
        
        System.out.println("-------------------");
        
    } 
} 
