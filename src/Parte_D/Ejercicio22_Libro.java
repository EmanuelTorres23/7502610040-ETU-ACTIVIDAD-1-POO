package Parte_D;

public class Ejercicio22_Libro {
    /*
     - Conclusión: La clase Libro actúa como plantilla porque define el molde general
     - (atributos y métodos) que todo libro debe tener. Los cuatro objetos son casos
     - concretos porque representan instancias reales e independientes en la memoria
     - con sus propios valores particulares.
     */
    String titulo;
    String autor;
    int paginas;

    public Ejercicio22_Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Ejercicio22_Libro libro1 = new Ejercicio22_Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        Ejercicio22_Libro libro2 = new Ejercicio22_Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        Ejercicio22_Libro libro3 = new Ejercicio22_Libro("1984", "George Orwell", 328);
        Ejercicio22_Libro libro4 = new Ejercicio22_Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        libro1.mostrarLibro();
        System.out.println();
        libro2.mostrarLibro();
        System.out.println();
        libro3.mostrarLibro();
        System.out.println();
        libro4.mostrarLibro();
    }
}