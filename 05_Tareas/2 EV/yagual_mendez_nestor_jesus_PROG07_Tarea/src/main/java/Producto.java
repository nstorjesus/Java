import java.util.Objects;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected String descripcion;
    protected int cantidadStock;

    public Producto(String nombre, double precio, String descripcion, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getCantidadStock() { return cantidadStock; }
    public void setCantidadStock(int cantidadStock) { this.cantidadStock = cantidadStock; }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio + ", Stock: " + cantidadStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0 && cantidadStock == producto.cantidadStock && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, cantidadStock);
    }
}