package Parte_K;

/*
 - Ejercicio 62: Biblioteca

 - Atributos:
  - nombre (String)
  - direccion (String)
  - librosDisponibles (int)

 - Métodos:
   - prestarLibro()
   - mostrarInventario()

 - Objetos reales potenciales:
   - biblioteca1: Biblioteca Central de la Universidad de Cartagena
   - biblioteca2: Biblioteca Pública Municipal
 */
public class Ejercicio62_Biblioteca {
    String nombre;
    String direccion;
    int librosDisponibles;

    public Ejercicio62_Biblioteca(String nombre, String direccion, int librosDisponibles) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.librosDisponibles = librosDisponibles;
    }

    public void prestarLibro() {
        if (this.librosDisponibles > 0) {
            this.librosDisponibles--;
        }
    }

    public void mostrarInventario() {
        System.out.println("Biblioteca: " + nombre + " - Dirección: " + direccion + " - Libros Disponibles: " + librosDisponibles);
    }

    public static void main(String[] args) {
        Ejercicio62_Biblioteca biblioteca = new Ejercicio62_Biblioteca("Biblioteca Central", "Campus Piedra de Bolívar", 350);
        biblioteca.mostrarInventario();
        System.out.println();
        biblioteca.prestarLibro();
        biblioteca.mostrarInventario();
    }
}