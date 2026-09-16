package Parte_F;

public class Ejercicio33_LibroCopia {
    String titulo;
    String autor;
    int paginas;

    public Ejercicio33_LibroCopia(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Constructor copia
    public Ejercicio33_LibroCopia(Ejercicio33_LibroCopia otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Ejercicio33_LibroCopia libro = new Ejercicio33_LibroCopia("1984", "George Orwell", 328);
        libro.mostrarLibro();
    }
}