// 4. Crea una clase Car con atributos brand y model y un mÃ©todo showData().
package c08_opp.Ejercicios;

public class Car {
    private String brand;
    private String model;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //GETTER Y SETTER BRAND
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    //GETTER Y SETTER MODEL
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //MÉTODO
    public void showData() {
        System.out.println("La marca del coche es " + brand + " y el modelo es " + model);
    }
    @Override
    public String toString () {
        return "Car { brand='" + brand + "', model='" + model + "' }";
    }

}
