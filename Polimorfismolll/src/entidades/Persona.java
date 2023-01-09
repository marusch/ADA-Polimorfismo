package entidades;

import java.util.Scanner;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void CrearPersona(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cual es el nombre?");
        nombre = input.nextLine();

        System.out.println("Cual es su apellido?");
        apellido = input.nextLine();

        System.out.println("Cual es su edad?");
        edad = input.nextInt();
    }

    public abstract void Accion();

    public void MostrarDatos(){
        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n"
        + "Edad: " + edad);
    }

}
