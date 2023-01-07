package entidades;

public class Autobus extends Transporte{

    protected int linea;

    public Autobus(int ruedas, int ventanas, int asientos, int linea) {
        super(ruedas, ventanas, asientos);
        this.linea = linea;
    }

    public Autobus(int linea) {
        this.linea = linea;
    }

    //Metodo abstracto implementado
    @Override
    public void velocidad() {
        System.out.println("Velocidad media-baja");
    }

    //Metodo abstracto implementado
    @Override
    public void MostrarDatos() {
        System.out.println("AUTOBUS - Ruedas: " + ruedas + ", Ventanas: " + ventanas
                + ", Asientos: " + asientos + ", Linea: " + linea);
    }
}
