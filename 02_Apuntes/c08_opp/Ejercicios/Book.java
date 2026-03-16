package c08_opp.Ejercicios;

// Atributos
public class Book {
    private String title;
    private String author;
// Constructor con atributos
    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }
//Constructor inicializado a 0
    public Book() {
        this.title = "";
        this.author = "";
    }

    public String getTitle() {
        return this.title;

    }
    public void setTitle (String title) {
        this.title = title;

    }


    public String getAuthor() {
        return this.author;
    }

    public void TheBook() {
        System.out.println("El título del libro es " + title + " y su autor es el célebre Don " + author);
    }

// Métodos



}
