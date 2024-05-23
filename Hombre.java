package Problema1;
public class Hombre extends Persona{
    public Hombre(String nombre, String apellido1, String apellido2){
        super(nombre, apellido1, apellido2);
    }

    public Hombre(String nombre, Hombre padre, Mujer madre){
        super(nombre, padre, madre);
    }
    public String toString(){
        return "Hombre  { nombre " + nombre + "\napellido1 " + apellido1 + "\napellido2" + apellido2 + "\npadre" + padre + "\nmadre" + madre + "}";
    }
}
