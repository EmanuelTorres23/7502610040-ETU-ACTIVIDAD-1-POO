package Parte_D;

public class Ejercicio21_AtributosCompartidos {
    String nombre;
    double precio;
    int stock;

    public Ejercicio21_AtributosCompartidos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + (int) precio + " - Stock: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio21_AtributosCompartidos producto1 = new Ejercicio21_AtributosCompartidos("Mouse Gamer", 50000.0, 15);
        Ejercicio21_AtributosCompartidos producto2 = new Ejercicio21_AtributosCompartidos("Teclado Oficina", 50000.0, 30);

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();
    }
}