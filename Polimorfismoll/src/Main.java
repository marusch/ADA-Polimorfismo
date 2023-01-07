import entidades.Auto;
import entidades.Autobus;
import entidades.Transporte;

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto desde nuestra clase Padre Transporte,
        // y luego declaramos que tipo de transporte es con su clase Hija "Autobus"
        Transporte autobus = new Autobus(4,16,14, 122);
        autobus.MostrarDatos();//Mostramos sus datos con el metodo abstracto
        autobus.velocidad();//Implementamos el metodo abstracto

        // Creamos un objeto desde nuestra clase Padre Transporte,
        // y luego declaramos que tipo de transporte es con su clase Hija "Auto"
        Transporte auto = new Auto(4,4,4,"Ferrari");
        auto.MostrarDatos();
        auto.velocidad();
    }
}