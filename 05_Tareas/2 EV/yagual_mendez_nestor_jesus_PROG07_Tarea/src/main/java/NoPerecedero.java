import java.util.Objects;

public class NoPerecedero extends Producto {
    private String fechaConsumoPreferente;

    public NoPerecedero(String nombre, double precio, String descripcion, int cantidadStock, String fechaConsumoPreferente) {
        super(nombre, precio, descripcion, cantidadStock);
        this.fechaConsumoPreferente = fechaConsumoPreferente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Consumo Preferente: " + fechaConsumoPreferente;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        NoPerecedero that = (NoPerecedero) o;
        return Objects.equals(fechaConsumoPreferente, that.fechaConsumoPreferente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaConsumoPreferente);
    }
}