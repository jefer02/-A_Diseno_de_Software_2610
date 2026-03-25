public class Main {
    public static void main(String[] args) {
        // Prueba Shape
        Shape shape = new Shape("blue", false);
        System.out.println("Shape: " + shape);

        // Prueba Circle
        Circle c = new Circle(5.0, "green", true);
        System.out.println("\nCircle: " + c);
        System.out.printf("Area: %.4f%n", c.getArea());
        System.out.printf("Perimetro: %.4f%n", c.getPerimeter());

        // Prueba Rectangle
        Rectangle r = new Rectangle(4.0, 7.0, "red", false);
        System.out.println("\nRectangle: " + r);
        System.out.printf("Area: %.4f%n", r.getArea());
        System.out.printf("Perimetro: %.4f%n", r.getPerimeter());

        // Prueba Square
        Square sq = new Square(5.0, "yellow", true);
        System.out.println("\nSquare: " + sq);
        System.out.printf("Area: %.4f%n", sq.getArea());
        System.out.printf("Perimetro: %.4f%n", sq.getPerimeter());

        // Verificar que width == length en Square
        sq.setSide(8.0);
        System.out.println("Lado actualizado: " + sq.getSide());
        System.out.println("Width == Length: " + (sq.getWidth() == sq.getLength()));
    }
}
