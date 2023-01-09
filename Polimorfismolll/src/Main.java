import entidades.Alumno;
import entidades.Persona;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) {

        Persona person1 = new Profesor();
        person1.CrearPersona();
        person1.Accion();
        person1.MostrarDatos();

        Persona person2 = new Alumno();
        person2.CrearPersona();
        person2.Accion();
        person2.MostrarDatos();

    }
}