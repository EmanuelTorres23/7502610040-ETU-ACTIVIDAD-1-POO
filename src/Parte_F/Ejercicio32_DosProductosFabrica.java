package Parte_F;

public class Ejercicio32_DosProductosFabrica {
    String nombre;
    double precio;
    int stock;

    public Ejercicio32_DosProductosFabrica(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Ejercicio32_DosProductosFabrica crearProductoBasico() {
        return new Ejercicio32_DosProductosFabrica("Genérico", 1000.0, 10);
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + (int) precio + " - Stock: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio32_DosProductosFabrica producto1 = Ejercicio32_DosProductosFabrica.crearProductoBasico();
        Ejercicio32_DosProductosFabrica producto2 = Ejercicio32_DosProductosFabrica.crearProductoBasico();

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();
    }
}