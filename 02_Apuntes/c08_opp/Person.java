package c08_opp;

public class Person {

    //Atributos: Variables que definen el estado o caracteristicas del objeto
    String name;
    int age;

    //Constructor: mecanismo de inicializacion
    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }


    //Métodos: funciones que definen el comportamiento del objeto

    public void sayHello() {

        System.out.println("Hola, soy " + name + " y tengo " + age + "años");
    }

}
