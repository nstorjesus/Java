import java.util.Objects;

public class Perecedero extends Producto {
    private String fechaCaducidad;

    public Perecedero(String nombre, double precio, String descripcion, int cantidadStock, String fechaCaducidad) {
        super(nombre, precio, descripcion, cantidadStock);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha Caducidad: " + fechaCaducidad;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Perecedero that = (Perecedero) o;
        return Objects.equals(fechaCaducidad, that.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad);
    }
}