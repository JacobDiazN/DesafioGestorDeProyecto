package cl.praxis.DesafioGestorDeProyectos.dto;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "Apellido = " + apellido + "\n" +
                "Edad = " + edad;
    }
}
