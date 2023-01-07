package entidades;

public class Auto extends Transporte{

    protected String marca;

    public Auto(int ruedas, int ventanas, int asientos, String marca) {
        super(ruedas, ventanas, asientos);
        this.marca = marca;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    //Metodo abstracto implementado
    @Override
    public void velocidad() {
        System.out.println("Velocidad alta");
    }

    //Metodo abstracto implementado
    @Override
    public void MostrarDatos() {
        System.out.println("AUTO - Ruedas: " + ruedas + ", Ventanas: " + ventanas
                + ", Asientos: " + asientos + ", Marca: " + marca);
    }
}
