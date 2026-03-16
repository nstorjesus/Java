 package prog03_ejerc1;

// Tipo enumerado para los meses del año
enum enumMes {
    ENERO,
    FEBRERO,
    MARZO,
    ABRIL,
    MAYO,
    JUNIO,
    JULIO,
    AGOSTO,
    SEPTIEMBRE,
    OCTUBRE,
    NOVIEMBRE,
    DICIEMBRE
}

// Clase Fecha
public class Fecha {

    // Atributos de la clase
    private int dia;
    private enumMes mes;
    private int anio;

    // Constructor que solo recibe el mes
    // El día y el año se ponen a 0
    public Fecha(enumMes mes) {
        this.dia = 0;
        this.mes = mes;
        this.anio = 0;
    }

    // Constructor que recibe todos los datos
    public Fecha(int dia, enumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // MÉTODOS GET Y SET

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public enumMes getMes() {
        return this.mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método que dice si la fecha está en verano
    // Considero verano: JUNIO, JULIO y AGOSTO
    public boolean isSummer() {
        return (this.mes == enumMes.JUNIO
                || this.mes == enumMes.JULIO
                || this.mes == enumMes.AGOSTO);
    }

    // Método que devuelve la fecha en formato largo
    // Ejemplo: "20 de FEBRERO del 2000"
    @Override
    public String toString() {
        String fechaLarga = this.dia + " de " + this.mes + " del " + this.anio;
        return fechaLarga;
    }
}
