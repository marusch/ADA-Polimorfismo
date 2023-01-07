package entidades;

//Aplicamos herencia
public class Perro extends Animal{

    //Atributo particular de la clase hija
    protected String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    //Constructor compartido con atributos de la clase padre e hija
    public Perro(String nombre, String color, int patas, String raza) {
        super(nombre, color, patas);
        this.raza = raza;
    }

    //Implementacion del metodo abstracto para visualizar su sonido
    @Override
    public void Sonido() {
        System.out.println("Guau...");
    }

    //Implementacion del metodo abstracto para visualizar sus datos
    @Override
    public void MostrarDatos() {
        System.out.println("Mi nombre es: " + nombre + ", Soy de color: " + color
                + ", Tengo " + patas + " patas," + " Mi raza es: " + raza);
    }
}
