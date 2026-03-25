import java.util.Scanner;

public class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    public Direccion() {
        super();
        this.calle = "";
        this.ciudad = "";
        this.provincia = "";
        this.codigoPostal = "";
    }

    public void nueva_direccion(Scanner sc) {
        System.out.print("Calle: ");
        this.calle = sc.nextLine();
        System.out.print("Ciudad: ");
        this.ciudad = sc.nextLine();
        System.out.print("Provincia: ");
        this.provincia = sc.nextLine();
        System.out.print("Código postal: ");
        this.codigoPostal = sc.nextLine();
    }

    public void nuevo_nombre(Scanner sc) {
        leer_nombre(sc);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Calle: " + calle);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Provincia: " + provincia);
        System.out.println("Código postal: " + codigoPostal);
    }
}
