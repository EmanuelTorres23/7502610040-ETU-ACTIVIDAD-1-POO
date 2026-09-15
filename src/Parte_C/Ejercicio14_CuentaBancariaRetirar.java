package Parte_C;

public class Ejercicio14_CuentaBancariaRetirar {
    String numero;
    String titular;
    double saldo;

    public Ejercicio14_CuentaBancariaRetirar(String numero, String titular, double saldo) {
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

    // Método para retirar solo si hay saldo suficiente
    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Retiro exitoso de: $" + (int) valor);
        } else {
            System.out.println("Fondos insuficientes o valor inválido para retirar.");
        }
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + " - Titular: " + titular + " - Saldo: $" + (int) saldo);
    }

    public static void main(String[] args) {
        Ejercicio14_CuentaBancariaRetirar cuenta = new Ejercicio14_CuentaBancariaRetirar("836447246", "Emanuel", 1500000.0);

        System.out.println("Estado inicial:");
        cuenta.mostrarCuenta();

        System.out.println("\nIntentando retirar $400,000...");
        cuenta.retirar(400000.0);
        cuenta.mostrarCuenta();
    }
}