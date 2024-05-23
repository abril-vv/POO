package Problema3;
import java.util.ArrayList;
import java.util.List;

public class AcademiaDejava {
    private List <Profesor> profesores;
    private List <Alumno> alumnos;
    public AcademiaDejava(){
        this.profesores = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void anyadirProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    public void anyadirAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void imprimirAlumnosDeProfesor(Profesor profesor){
        System.out.println(profesor.toString());
    }

    public static void main(String[] args){
        AcademiaDejava academia = new AcademiaDejava();
        Profesor profesor = new Profesor("12345678A", "John");
        Alumno alumno1 = new Alumno("12345678B", "Mark");
        Alumno alumno2 = new Alumno("12345678C", "Luis");

        academia.anyadirProfesor(profesor);
        academia.anyadirAlumno(alumno1);
        academia.anyadirAlumno(alumno2);

        academia.imprimirAlumnosDeProfesor(profesor);
    }
}
