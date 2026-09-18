package Parte_G;

public class Ejercicio40_Pelicula {
    String nombre;
    String genero;
    int minutos;

    public Ejercicio40_Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " - Género: " + genero + " - Minutos: " + minutos);
    }

    public static void main(String[] args) {
        Ejercicio40_Pelicula pelicula = new Ejercicio40_Pelicula("Interestelar", "Ciencia Ficción", 169);
        pelicula.mostrarFicha();
    }
}