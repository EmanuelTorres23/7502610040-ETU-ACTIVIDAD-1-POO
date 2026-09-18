package Parte_E;

public class Ejercicio25_ObjetosLibro {
    String titulo;
    String autor;
    int paginas;

    public Ejercicio25_ObjetosLibro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public Ejercicio25_ObjetosLibro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Ejercicio25_ObjetosLibro libroVacio = new Ejercicio25_ObjetosLibro();
        Ejercicio25_ObjetosLibro libroParametros = new Ejercicio25_ObjetosLibro("Cien años de soledad", "Gabriel García Márquez", 417);

        libroVacio.mostrarLibro();
        System.out.println();
        libroParametros.mostrarLibro();
    }
}