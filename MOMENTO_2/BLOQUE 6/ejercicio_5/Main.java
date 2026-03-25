import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos del Libro
        System.out.println("--- Ingrese datos del LIBRO ---");
        System.out.print("Título: ");
        String tituloLibro = sc.nextLine();
        System.out.print("Precio: ");
        float precioLibro = sc.nextFloat();
        System.out.print("Número de páginas: ");
        int paginas = sc.nextInt();
        System.out.print("Año de publicación: ");
        int anio = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Datos del Disco
        System.out.println("\n--- Ingrese datos del DISCO ---");
        System.out.print("Título: ");
        String tituloDisco = sc.nextLine();
        System.out.print("Precio: ");
        float precioDisco = sc.nextFloat();
        System.out.print("Duración en minutos: ");
        float duracion = sc.nextFloat();

        // Crear instancias
        Libro libro = new Libro(tituloLibro, precioLibro, paginas, anio);
        Disco disco = new Disco(tituloDisco, precioDisco, duracion);

        // Mostrar datos
        System.out.println("\n=============================");
        libro.mostrar();
        System.out.println("=============================");
        disco.mostrar();
        System.out.println("=============================");

        sc.close();
    }
}
