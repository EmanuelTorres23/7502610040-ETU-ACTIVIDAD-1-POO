package Parte_J;

public class Ejercicio53_Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Ejercicio53_Reserva(String nombreCliente, String fecha, boolean activa) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = activa;
    }

    public void confirmar() {
        this.activa = true;
    }

    public void cancelar() {
        this.activa = false;
    }

    public void mostrarEstado() {
        String estadoStr = activa ? "Activa" : "Cancelada";
        System.out.println("Cliente: " + nombreCliente + " - Fecha: " + fecha + " - Estado: " + estadoStr);
    }

    public static void main(String[] args) {
        Ejercicio53_Reserva reserva = new Ejercicio53_Reserva("Emanuel", "2026-09-20", false);
        reserva.mostrarEstado();
        System.out.println();
        reserva.confirmar();
        reserva.mostrarEstado();
    }
}