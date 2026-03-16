
public class Paciente {
    private String nss; //Número de la seguridad social
    private String nombre;
    private int edad;
    private String direccion;
    
    
    public Paciente() {
        
    }
    
    public Paciente(String nss, String nombre, int edad, String direccion){
        this.nss = nss;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public void setNss(String nss) { this.nss = nss; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getNss() { return this.nss; }
    public String getNombre() { return this.nombre; }
    public int getEdad() { return this.edad; }
    public String getDireccion() { return this.direccion; }
    
}
