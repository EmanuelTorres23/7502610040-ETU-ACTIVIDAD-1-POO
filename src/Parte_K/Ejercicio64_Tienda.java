package Parte_K;

/*
 - Ejercicio 64: Tienda

 - Atributos:
   - nombre (String)
   - categoria (String)
   - productosDisponibles (int)

 - Métodos:
   - venderProducto()
   - mostrarInfo()

 - Objetos reales potenciales:
  - tienda1: Minimercado del barrio
  - tienda2: Tienda de ropa local
 */
public class Ejercicio64_Tienda {
    String nombre;
    String categoria;
    int productosDisponibles;

    public Ejercicio64_Tienda(String nombre, String categoria, int productosDisponibles) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.productosDisponibles = productosDisponibles;
    }

    public void venderProducto() {
        if (this.productosDisponibles > 0) {
            this.productosDisponibles--;
        }
    }

    public void mostrarInfo() {
        System.out.println("Tienda: " + nombre + " - Categoría: " + categoria + " - Productos Disponibles: " + productosDisponibles);
    }

    public static void main(String[] args) {
        Ejercicio64_Tienda tienda = new Ejercicio64_Tienda("Los Abastos La Campiña", "Víveres", 120);
        tienda.mostrarInfo();
        System.out.println();
        tienda.venderProducto();
        tienda.mostrarInfo();
    }
}