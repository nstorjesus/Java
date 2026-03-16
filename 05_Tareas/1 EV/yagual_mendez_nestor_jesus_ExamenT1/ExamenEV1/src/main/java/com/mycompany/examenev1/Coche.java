
package com.mycompany.examenev1;

public class Coche {
    //Atributos de la clase
    private String marca;
    private String modelo;
    private int velocidad;
    
    
    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public Coche(){
        String marca = "Sin Marca";
        String modelo = "Sin modelo";
        int velocidad = 0;
    }
      
    //Getter de los 3 atributos
    public String getmarca() {
        return marca;
    }
    
    public String getmodelo() {
        return modelo;
    }
    
    public int getvelocidad() {
        return velocidad;
    }
    
    //Setter de marca y modelo
    
    public void setmarca(String marca) {
        this.marca = marca;
    }
    
    public void setmodelo(String modelo) {
        this.modelo = modelo;   
    }
    //Método encender
    public void enceder() {
        System.out.println("Coche encendido");
    }
    //Método acelerar 
    public void acelerar(){
        this.velocidad += 10;
        System.out.println("Acelerando ..." + this.velocidad);
    }
    //Método frenar
    public void frenar(){
        
        if(this.velocidad >=10) {
            this.velocidad -= 10;
            System.out.println("Frenando... " + this.velocidad + "km/h");
        } else {
            System.out.println("El coche está detenido");
        }
    }
    
    public void aceleracionRapida() {
        System.out.println("Inicio de aceleración rápida");
        for (int i=0; i<=60;i+=20) {
        
            System.out.println("Acelerenado: " + (this.velocidad += i));
        }
    }
    
    public void frenadaProgresiva (){
        System.out.println("Inicio de frenada");
        while (this.velocidad > 0){
            this.velocidad -=5;
            System.out.println("Frenando... Velocidad:" + this.velocidad + "km/h");
    }
        System.out.println("Vehículo parado");
    }
    
    public void arranqueEspecial(){
     System.out.println("Iniciando arranque especial: ");
                    
    }
    
    
    @Override
   public String toString(){
         return "Coche: " + this.marca + " " + this.modelo + " - " + "velocidad: " + this.velocidad + "km/h";
    }
}

