package entidades;

public class Alumno extends Persona{

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void CrearPersona() {
        super.CrearPersona();
    }

    @Override
    public void Accion() {
        System.out.println("Alumno" + "\n" + "Vengo a estudiar");
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
    }
}
