package Parte_B;

public class Ejercicio8_Producto {
    String nombre;
    double precio;
    int stock;

    public Ejercicio8_Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Información del producto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + (int) precio);
        System.out.println("Stock disponible: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio8_Producto p1 = new Ejercicio8_Producto("Laptop", 28000000.0, 10);
        Ejercicio8_Producto p2 = new Ejercicio8_Producto("Mouse", 40000.0, 25);
        Ejercicio8_Producto p3 = new Ejercicio8_Producto("Teclado", 1350000.0, 15);

        p1.mostrarProducto();
        System.out.println();
        p2.mostrarProducto();
        System.out.println();
        p3.mostrarProducto();
    }
}