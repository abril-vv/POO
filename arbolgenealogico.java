package Problema1;

public class arbolgenealogico {
    public static void main(String[] args){
        Hombre padre = new Hombre("Joan", "Marti", "Martinez");
        Mujer madre = new Mujer("Joana", "Garcia", "Perez");
        Hombre hijo = new Hombre("Joanet", padre, madre);
        hijo.apellido1 = padre.apellido1;
        hijo.apellido2 = madre.apellido1;
    }
}
