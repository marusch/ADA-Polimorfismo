import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import entidades.Vaca;

public class Main {
    public static void main(String[] args) {

        //Aplicacion del Polimorfismo

        //Invocamos a la clase Padre Animal, haciendo referencia a que crearemos un animal,
        //- creamos el objeto, luego instanciamos la clase hija a especificar
        //implementando los atributos de la clase hija, ya haciendo referencia a que animal es.

        //Decimos que es un Animal, denomimamos nuestro objeto y decimos que es un nuevo gato(Clase hija)
        Animal gato = new Gato("Naranjoso", "Naranja", 4,"Pequeño");
        gato.MostrarDatos(); //mostramos sus datos
        gato.Sonido(); //Visualizamos su sonido

        Animal perro = new Perro("Jerry", "Marron",4,"Pincher");
        perro.MostrarDatos();
        perro.Sonido();

        Animal vaca = new Vaca("Lola","Blanca",4, 2);
        vaca.MostrarDatos();
        vaca.Sonido();

    }
}