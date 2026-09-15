package Parte_C;

public class Ejercicio16_ProductoReabastecer {
    String nombre;
    double precio;
    int stock;

    public Ejercicio16_ProductoReabastecer(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    // Método para reabastecer (aumentar el stock)
    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se han reabastecido " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor a 0.");
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + (int) precio + " | Stock: " + stock);
    }

    public static void main(String[] args) {
        Ejercicio16_ProductoReabastecer producto = new Ejercicio16_ProductoReabastecer("Laptop", 2500000.0, 5);

        System.out.println("Estado inicial:");
        producto.mostrarProducto();

        System.out.println("\nReabasteciendo 10 unidades...");
        producto.reabastecer(10);
        producto.mostrarProducto();
    }
}