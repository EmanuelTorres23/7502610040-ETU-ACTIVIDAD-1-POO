package Parte_C;

public class Ejercicio12_VehiculoFrenar {
    String marca;
    String modelo;
    double velocidadActual;

    public Ejercicio12_VehiculoFrenar(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void acelerar() {
        velocidadActual += 10;
    }

    public void frenar() {
        if (velocidadActual >= 10) {
            velocidadActual -= 10;
        } else {
            velocidadActual = 0;
        }
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca + " - Modelo: " + modelo + " - Velocidad: " + (int) velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Ejercicio12_VehiculoFrenar vehiculo = new Ejercicio12_VehiculoFrenar("Chevrolet", "Onix Turbo", 5.0);

        System.out.println("Estado inicial:");
        vehiculo.mostrarEstado();

        System.out.println("\nFrenando...");
        vehiculo.frenar();
        vehiculo.mostrarEstado();
    }
}