package Parte_D;

public class Ejercicio26_ObjetosProducto {
    String nombre;
    double precio;
    int stock;

    public Ejercicio26_ObjetosProducto() {
        this.nombre = "Genérico";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Ejercicio26_ObjetosProducto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + (int) precio + " - Stock: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio26_ObjetosProducto productoVacio = new Ejercicio26_ObjetosProducto();
        Ejercicio26_ObjetosProducto productoParametros = new Ejercicio26_ObjetosProducto("Laptop", 2500000.0, 10);

        productoVacio.mostrarProducto();
        System.out.println();
        productoParametros.mostrarProducto();
    }
}