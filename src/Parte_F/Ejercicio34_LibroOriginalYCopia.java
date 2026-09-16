package Parte_F;

public class Ejercicio34_LibroOriginalYCopia {
    String titulo;
    String autor;
    int paginas;

    public Ejercicio34_LibroOriginalYCopia(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Constructor copia
    public Ejercicio34_LibroOriginalYCopia(Ejercicio34_LibroOriginalYCopia otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Ejercicio34_LibroOriginalYCopia original = new Ejercicio34_LibroOriginalYCopia("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Ejercicio34_LibroOriginalYCopia copia = new Ejercicio34_LibroOriginalYCopia(original);

        original.mostrarLibro();
        System.out.println();
        copia.mostrarLibro();
    }
}
