package Problema2;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    HashMap<String, Autor> autores;
    HashMap <String, Libro> libros;

    public Biblioteca(){
        this.autores = new HashMap<>();
        this.libros = new HashMap<>();
    }

    public void anyadirAutor(String nombre, String email){
        Autor autor = new Autor(nombre, email);
        this.autores.put(email, autor);
    }

    public void anyadirLibro(String titulo, Autor autor, String isbn){
        Libro libro = new Libro(titulo, autor, isbn);
        this.libros.put(isbn, libro);
    }

    public Libro getLibro(String isbn){
        return this.libros.get(isbn);
    }

    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor("Eric", "eric@gmail.com");
        biblioteca.anyadirLibro("Head First", autor, "978-2");
        biblioteca.anyadirAutor("Erik", "eric@gmail.com");
        Scanner scan = new Scanner(System.in);
        System.out.println("Buscar libro con isbn: ");
        String isbn = scan.nextLine();
        Libro libro = biblioteca.getLibro(isbn);
        System.out.println(libro.toString());
    }
}