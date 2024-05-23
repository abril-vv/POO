package Problema3;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private List <Alumno> alumnos;
    public Profesor(String nif, String nombre){
        super(nif, nombre);
        alumnos = new ArrayList<>();
    }

    public String toString(){
        return "Profesor = "  + ", alumnos = " + alumnos;
    }
}
