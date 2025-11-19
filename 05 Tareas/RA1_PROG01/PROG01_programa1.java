
/**
 *APARTADO A.

Descarga desde la web recomendada en los contenidos, Java SE e instálalo en tu equipo. Recuerda que puedes descargar el OracleJDK u OpenJDK. Se recomienda utilizar una versión posterior a la 11 LTS.

Siguiendo las indicaciones dadas para configurar las variables PATH y CLASSPATH, lleva a cabo la configuración de las mismas.

Comprueba a través de consola de comandos, que has realizado correctamente la instalación y configuración del JDK y JRE.

Crea una carpeta en tu equipo para alojar los ejercicios y programas que se irán generando en cada una de las actividades que se planteen en las unidades de trabajo. Te recomendamos que el nombre de esta carpeta sea sencillo, sin espacios en blanco (puedes sustituirlos por guiones bajos), ni caracteres especiales. Por ejemplo: Ejercicios_Java.

En dicha carpeta, crea utilizando algún editor de texto un archivo con extensión “.java” al que debes llamar PROG01_programa1.java. En su interior, basándote en el ejercicio resuelto de la unidad, inserta las líneas necesarias de código Java para obtener por pantalla el siguiente resultado (las partes en negrita deben ser sustituidas por tus datos):

Módulo Profesional - PROGRAMACIÓN. UNIDAD DE TRABAJO 01
Introducción a la programación
Nombre y apellidos del alumno/a
Localidad y provincia
Fecha de realización del ejercicio
Programa1

Una vez creado el código fuente, guarda el archivo y, mediante línea de comandos, realiza la compilación del mismo.

Comprueba lo que ha ocurrido en la carpeta donde esta el archivo “.java” que acabas de compilar.

Realiza la ejecución del programa creado.

Visualiza en pantalla los resultados.

Si no se ajustan al ejemplo, realiza las modificaciones necesarias sobre el archivo fuente, vuelve a compilarlo y lanza su ejecución otra vez.

APARTADO B.

Descarga desde los enlaces ofrecidos Netbeans e instálalo en tu ordenador. Desde el enlace descarga Netbeans (si tu sistema operativo es Windows)
Inicia Netbeans, realizar algún ajuste en la configuración si es necesario y visualiza las partes del entorno.
Crea un proyecto en Netbeans, denominado "PrimeraAplicNetbeans". Dentro del paquete por defecto, crea una clase que contenga el método main. Añade el código necesario para mostrar por pantalla la información del apartado 1.
Añade algún comentario aclaratorio, compila y ejecuta dicho programa.
Observa los resultados en el área reservada para tal efecto en el entorno.
Nombre: Néstor
 */
public class PROG01_programa1 {

    public static void main(String args[]) {
        System.out.println("Nestor Jesus Yagual Mendez");
        System.out.println("El Palmar, Murcia");
        System.out.println("19/10/2025");
    }
}
