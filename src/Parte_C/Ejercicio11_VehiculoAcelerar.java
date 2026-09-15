package Parte_C;

public class Ejercicio11_VehiculoAcelerar {
    String marca;
    String modelo;
    double velocidadActual;

    public Ejercicio11_VehiculoAcelerar(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void acelerar() {
        velocidadActual += 10;
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca + " - Modelo: " + modelo + " - Velocidad: " + (int) velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Ejercicio11_VehiculoAcelerar vehiculo = new Ejercicio11_VehiculoAcelerar("Chevrolet", "Onix Turbo", 60.0);

        System.out.println("Estado inicial:");
        vehiculo.mostrarEstado();

        System.out.println("\nAcelerando...");
        vehiculo.acelerar();
        vehiculo.mostrarEstado();
    }
}