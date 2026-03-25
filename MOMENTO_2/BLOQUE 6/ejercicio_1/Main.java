public class Main {
    public static void main(String[] args) {
        // Prueba Circle
        Circle c1 = new Circle();
        System.out.println("Circle por defecto: " + c1);
        System.out.println("Area: " + c1.getArea());

        Circle c2 = new Circle(5.0, "blue");
        System.out.println("\nCircle con parámetros: " + c2);
        System.out.println("Area: " + c2.getArea());

        // Prueba Cylinder
        Cylinder cyl1 = new Cylinder();
        System.out.println("\nCylinder por defecto: " + cyl1);
        System.out.println("Volumen: " + cyl1.getVolume());

        Cylinder cyl2 = new Cylinder(3.0, 7.0, "green");
        System.out.println("\nCylinder con parámetros: " + cyl2);
        System.out.println("Radio: " + cyl2.getRadius());
        System.out.println("Altura: " + cyl2.getHeight());
        System.out.printf("Volumen: %.4f%n", cyl2.getVolume());
    }
}
