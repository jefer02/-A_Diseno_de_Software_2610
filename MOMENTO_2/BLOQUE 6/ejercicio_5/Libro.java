public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro(String titulo, float precio, int numeroPaginas, int anioPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    @Override
    public void mostrar() {
        System.out.println("=== LIBRO ===");
        super.mostrar();
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
