import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Direccion dir = new Direccion();

        System.out.println("=== Ingrese el nombre ===");
        dir.nuevo_nombre(sc);

        System.out.println("\n=== Ingrese la dirección ===");
        dir.nueva_direccion(sc);

        System.out.println("\n=============================");
        System.out.println("      INFORMACIÓN COMPLETA   ");
        System.out.println("=============================");
        dir.mostrar();
        System.out.println("=============================");

        sc.close();
    }
}
