package Parte_A;

public class Ejercicio3_Producto {
    String nombre;
    double precio;
    int stock;

    public Ejercicio3_Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Información del producto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio3_Producto producto = new Ejercicio3_Producto("Laptop", 2500000.0, 10);
        producto.mostrarProducto();
    }
}