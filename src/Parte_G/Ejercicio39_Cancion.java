package Parte_G;

public class Ejercicio39_Cancion {
    String titulo;
    String artista;
    double duracion;

    public Ejercicio39_Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " - Artista: " + artista + " - Duración: " + duracion + " min");
    }

    public static void main(String[] args) {
        Ejercicio39_Cancion cancion = new Ejercicio39_Cancion("Mojabi Ghost", "Bad Bunny", 3.52);
        cancion.mostrarInfo();
    }
}