package Parte_J;

public class Ejercicio60_Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Ejercicio60_Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    public void abordar(int cantidad) {
        this.pasajeros += cantidad;
    }

    public void mostrarEstado() {
        System.out.println("Aerolínea: " + aerolinea + " - Destino: " + destino + " - Pasajeros: " + pasajeros);
    }

    public static void main(String[] args) {
        Ejercicio60_Avion avion = new Ejercicio60_Avion("Avianca", "Bogotá", 120);
        avion.mostrarEstado();
        System.out.println();
        avion.abordar(35);
        avion.mostrarEstado();
    }
}