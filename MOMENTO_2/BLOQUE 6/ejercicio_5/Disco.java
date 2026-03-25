public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco(String titulo, float precio, float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(float duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    @Override
    public void mostrar() {
        System.out.println("=== DISCO ===");
        super.mostrar();
        System.out.println("Duración (minutos): " + duracionMinutos);
    }
}
