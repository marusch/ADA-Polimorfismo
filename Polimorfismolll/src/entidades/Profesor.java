package entidades;

public class Profesor extends Persona{

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void CrearPersona() {
        super.CrearPersona();
    }

    @Override
    public void Accion() {
        System.out.println("PROFESOR" + "\n" + "Vengo a enseñar");
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
    }
}
