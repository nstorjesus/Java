package com.prog03.figuras;

public class Rectangulo {

    // Atributos
    private float base;
    private float altura;

    // Constructor vacío: todo a 0
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Constructor con parámetros
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // GET y SET de base
    public float getBase() {

        return this.base;
    }

    public void setBase(float base) {

        this.base = base;
    }

    // GET y SET de altura
    public float getAltura() {

        return this.altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }

    // Devuelve el área del rectángulo
    public float getArea() {

        return this.base * this.altura;
    }

    // Devuelve una cadena con su altura y su área
    @Override
    public String toString() {
        String texto = "Altura: " + this.altura + " - Área: " + this.getArea();
        return texto;
    }

    // Devuelve true si el rectángulo es cuadrado (base = altura)
    public boolean isCuadrado() {
        return this.base == this.altura;
    }
}
