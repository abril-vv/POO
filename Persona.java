package Problema3;
public class Persona {
    protected String nif;
    protected String nombre;

    public Persona(String nif, String nombre){
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNif(){
        return nif;
    }

    public String toString(){
        return "nif = " + nif + ", nombre = " + nombre;
    }
}
