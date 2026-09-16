package Parte_F;

public class Ejercicio31_ProductoFabrica {
    String nombre;
    double precio;
    int stock;

    public Ejercicio31_ProductoFabrica(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Ejercicio31_ProductoFabrica crearProductoBasico() {
        return new Ejercicio31_ProductoFabrica("Genérico", 1000.0, 10);
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + (int) precio + " - Stock: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio31_ProductoFabrica productoBasico = Ejercicio31_ProductoFabrica.crearProductoBasico();
        productoBasico.mostrarProducto();
    }
}