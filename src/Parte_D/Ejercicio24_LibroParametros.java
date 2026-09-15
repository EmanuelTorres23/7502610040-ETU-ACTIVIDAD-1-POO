package Parte_D;

public class Ejercicio24_LibroParametros {
    String titulo;
    String autor;
    int paginas;

    public Ejercicio24_LibroParametros(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Ejercicio24_LibroParametros libro = new Ejercicio24_LibroParametros("Cien años de soledad", "Gabriel García Márquez", 417);
        libro.mostrarLibro();
    }
}