package Parte_E;

public class Ejercicio28_TresCuentas {
    String numero;
    String titular;
    double saldoInicial;

    public Ejercicio28_TresCuentas(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    public void mostrarCuenta() {
        System.out.println("Número: " + numero + " - Titular: " + titular + " - Saldo Inicial: $" + (int) saldoInicial);
    }

    public static void main(String[] args) {
        Ejercicio28_TresCuentas cuenta1 = new Ejercicio28_TresCuentas("4829104", "Emanuel", 1500000.0);
        Ejercicio28_TresCuentas cuenta2 = new Ejercicio28_TresCuentas("9384201", "Andrea", 850000.0);
        Ejercicio28_TresCuentas cuenta3 = new Ejercicio28_TresCuentas("1049283", "Carlos", 2300000.0);

        cuenta1.mostrarCuenta();
        System.out.println();
        cuenta2.mostrarCuenta();
        System.out.println();
        cuenta3.mostrarCuenta();
    }
}