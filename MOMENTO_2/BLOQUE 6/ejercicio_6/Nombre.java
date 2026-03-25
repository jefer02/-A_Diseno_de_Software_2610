import java.util.Scanner;

public class Nombre {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
    }

    public void leer_nombre(Scanner sc) {
        System.out.print("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Primer apellido: ");
        this.primerApellido = sc.nextLine();
        System.out.print("Segundo apellido: ");
        this.segundoApellido = sc.nextLine();
    }

    public void mostrar() {
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}
