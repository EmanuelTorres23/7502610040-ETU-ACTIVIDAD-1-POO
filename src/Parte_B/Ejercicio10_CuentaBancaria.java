package Parte_B;

public class Ejercicio10_CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public Ejercicio10_CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + (int) saldo);
    }

    public static void main(String[] args) {
        Ejercicio10_CuentaBancaria cuenta1 = new Ejercicio10_CuentaBancaria("123456789", "Emanuel", 670000.0);
        Ejercicio10_CuentaBancaria cuenta2 = new Ejercicio10_CuentaBancaria("987654321", "Carlos", 450000.0);

        System.out.println("Estado de la Cuenta 1:");
        cuenta1.mostrarCuenta();

        System.out.println("\nEstado de la Cuenta 2:");
        cuenta2.mostrarCuenta();
    }
}