package entidades;

//Clase Padre que no va ser instanciada
public abstract class Animal {

    //Atributos
    protected String nombre;
    protected String color;
    protected int patas;

    public Animal() {
    }

    public Animal(String nombre, String color, int patas) {
        this.nombre = nombre;
        this.color = color;
        this.patas = patas;
    }

    //Metodo abstracto para su respectiva implementacion para ver sus sonidos
    public abstract void Sonido();

    //Metodo abstracto para su respectiva implementacion para mostar todos los datos
    public  abstract void MostrarDatos();


}
