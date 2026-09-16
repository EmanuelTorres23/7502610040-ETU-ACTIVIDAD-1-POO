package Parte_J;

public class Ejercicio58_InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public Ejercicio58_InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularValorTotal() {
        return this.cantidad * this.precioUnitario;
    }

    public void mostrarInventario() {
        System.out.println("Nombre: " + nombre + " - Cantidad: " + cantidad + " - Precio Unitario: $" + (int) precioUnitario + " - Valor Total: $" + (int) calcularValorTotal());
    }

    public static void main(String[] args) {
        Ejercicio58_InventarioItem item = new Ejercicio58_InventarioItem("Laptop Lenovo", 5, 3500000.0);
        item.mostrarInventario();
    }
}