package entidades;

//Aplicamos herencia
public class Vaca extends Animal{

    //Atributo particular de la clase hija
    protected int años;

    public Vaca(int años) {
        this.años = años;
    }

    //Constructor compartido con atributos de la clase padre e hija
    public Vaca(String nombre, String color, int patas, int años) {
        super(nombre, color, patas);
        this.años = años;
    }

    //Implementacion del metodo abstracto para visualizar su sonido
    @Override
    public void Sonido() {
        System.out.println("Muuuh...");
    }

    //Implementacion del metodo abstracto para visualizar sus datos
    @Override
    public void MostrarDatos() {
        System.out.println("Mi nombre es: " + nombre + ", Soy de color: " + color
                + ", Tengo " + patas + " patas," + " Tengo " + años + " años");
    }
}
