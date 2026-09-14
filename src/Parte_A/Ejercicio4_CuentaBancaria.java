package Parte_A;

public class Ejercicio4_CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public Ejercicio4_CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarCuenta() {
        System.out.println("Información de la cuenta bancaria:");
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        Ejercicio4_CuentaBancaria cuenta = new Ejercicio4_CuentaBancaria("123456789", "Emmanuel", 1500000.0);
        cuenta.mostrarCuenta();
    }
}
