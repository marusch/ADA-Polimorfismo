package entidades;

public abstract class Transporte {

    protected int ruedas;
    protected int ventanas;
    protected int asientos;

    public Transporte(int ruedas, int ventanas, int asientos) {
        this.ruedas = ruedas;
        this.ventanas = ventanas;
        this.asientos = asientos;
    }

    public Transporte() {
    }

    //Metodo abtracto para implementar y mostrar su velocidad
    public abstract void velocidad();

    //Metodo abtracto para implementar y mostrar los datos
    public abstract void MostrarDatos();
}
