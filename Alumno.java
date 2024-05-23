package Problema3;
public class Alumno extends Persona{
    private Profesor profesor;
    public Alumno(String nif, String profesor){
        super(nif, profesor);
    }

    public Profesor getProfesor(){
        return profesor;
    }
}
