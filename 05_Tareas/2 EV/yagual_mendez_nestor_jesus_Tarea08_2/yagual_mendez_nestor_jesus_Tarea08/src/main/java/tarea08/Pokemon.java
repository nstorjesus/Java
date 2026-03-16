package tarea08;
import java.util.*;

public class Pokemon {

    private String nombre;
    private String tipo;
    private int hp;
    private int nivel;

    public Pokemon(String nombre, String tipo, int hp, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = hp;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", tipo=" + tipo + ", hp=" + hp + ", nivel=" + nivel + '}';
    }

    public static void mostrarPokemonsIterator(Set<Pokemon> pokemons) {
        Iterator<Pokemon> it = pokemons.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void mostrarPokemonsForEach(Set<Pokemon> pokemons) {
        for (Pokemon p : pokemons) {
            System.out.println(p);
        }
    }
}