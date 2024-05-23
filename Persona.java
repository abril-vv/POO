package Problema1;
    public abstract class Persona{
        protected String nombre;
        protected String apellido1;
        protected String apellido2;
        protected  Hombre padre;
        protected  Mujer madre;

        public Persona(String nombre, String apellido1, String apellido2){
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
        }
    
        public Persona(String nombre,Hombre padre, Mujer madre){
            this.nombre = nombre;
            this.padre = padre;
            this.madre = madre;
        }
    
        public abstract String toString();
    }
