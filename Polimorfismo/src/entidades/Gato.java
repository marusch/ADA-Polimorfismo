package entidades;

//Aplicamos herencia
public class Gato extends Animal{

    //Atributo particular de la clase hija
    protected String tamaño;

    //Constructor de la clase hija
    public Gato(String tamaño) {
        this.tamaño = tamaño;
    }

    //Constructor compartido con atributos de la clase padre e hija
    public Gato(String nombre, String color, int patas, String tamaño) {
        super(nombre, color, patas);
        this.tamaño = tamaño;
    }

    //Implementacion del metodo abstracto para visualizar su sonido
    @Override
    public void Sonido() {
        System.out.println("Miau...");
    }

    //Implementacion del metodo abstracto para visualizar sus datos
    @Override
    public void MostrarDatos() {
        System.out.println( "Mi nombre es: " + nombre + ", Soy de color: " + color
                + ", Tengo " + patas + " patas," + " Mi tamaño es " + tamaño);
    }
}
