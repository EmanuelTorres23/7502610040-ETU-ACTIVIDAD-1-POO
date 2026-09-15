package Parte_C;

public class Ejercicio13_CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public Ejercicio13_CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("El valor a consignar debe ser mayor a 0.");
        }
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + " | Titular: " + titular + " | Saldo: $" + (int) saldo);
    }

    public static void main(String[] args) {
        Ejercicio13_CuentaBancaria cuenta = new Ejercicio13_CuentaBancaria("67239812", "Emanuel", 1500000.0);

        System.out.println("Estado inicial:");
        cuenta.mostrarCuenta();

        System.out.println("\nConsignando $500,000...");
        cuenta.consignar(500000.0);
        cuenta.mostrarCuenta();
    }
}