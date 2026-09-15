package Parte_C;

public class Ejercicio15_ProductoVender {
    String nombre;
    double precio;
    int stock;

    public Ejercicio15_ProductoVender(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para vender (disminuir stock si hay suficiente)
    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente stock disponible para realizar la venta.");
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + (int) precio + " | Stock: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio15_ProductoVender producto = new Ejercicio15_ProductoVender("Laptop", 2500000.0, 10);

        System.out.println("Estado inicial:");
        producto.mostrarProducto();

        System.out.println("\nVendiendo 3 unidades...");
        producto.vender(3);
        producto.mostrarProducto();
    }
}