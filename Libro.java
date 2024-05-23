package Problema2;
public class Libro {
    private String titulo;
    private Autor autor;
    private String isbn;

    public Libro(String titulo, Autor autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String toString(){
        return "Libro  { titulo " + titulo + "\nautor " + autor + "\nisbn" + isbn + "}";
    }
}
