package Parte_D;

public class Ejercicio27_CuentaBancaria {
    String numero;
    String titular;
    double saldoInicial;

    public Ejercicio27_CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    public void mostrarCuenta() {
        System.out.println("Número: " + numero + " - Titular: " + titular + " - Saldo Inicial: $" + (int) saldoInicial);
    }

    public static void main(String[] args) {
        Ejercicio27_CuentaBancaria cuenta = new Ejercicio27_CuentaBancaria("7502610041", "Emanuel", 1500000.0);
        cuenta.mostrarCuenta();
    }
}