package Parte_J;

public class Ejercicio52_FacturaSimple {
    String numero;
    String cliente;
    double valor;

    public Ejercicio52_FacturaSimple(String numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento() {
        this.valor = this.valor * 0.90; // Aplica un 10% de descuento
    }

    public void mostrarFactura() {
        System.out.println("Número: " + numero + " - Cliente: " + cliente + " - Valor con Descuento: $" + (int) valor);
    }

    public static void main(String[] args) {
        Ejercicio52_FacturaSimple factura = new Ejercicio52_FacturaSimple("FAC-001", "Emanuel", 250000.0);
        factura.aplicarDescuento();
        factura.mostrarFactura();
    }
}