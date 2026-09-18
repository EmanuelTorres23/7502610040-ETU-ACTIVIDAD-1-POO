package Parte_E;

public class Ejercicio23_LibroVacio {
    String titulo;
    String autor;
    int paginas;

    public Ejercicio23_LibroVacio() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Ejercicio23_LibroVacio libro = new Ejercicio23_LibroVacio();
        libro.mostrarLibro();
    }
}