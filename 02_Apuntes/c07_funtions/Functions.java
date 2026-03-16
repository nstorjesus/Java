package c07_funtions;

public class Functions {

    public static void main(String[] args) {

        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }
        sendEmailToUser("tecno-automatiza@gmail.com");
        sendEmailToUser("tecno-automatiza@gmail.com", "Don Yagual");

    }

    //Creo una funcion que envía un email
    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Se envía el email");
    }

    // Función con parámetros
    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

     // Sobrecarga de funciones: utilizo la misma funcion pero le añado mas variables y el programa es capaz de saber
    // a que funcion estoy llalmando
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envía el email a " + email + " con nombre " + name);
    }
}