package Parte_A;

public class Ejercicio2_Vehiculo {
    String marca;
    String modelo;
    double velocidadActual;

    public Ejercicio2_Vehiculo(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void mostrarEstado() {
        System.out.println("Estado del vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Ejercicio2_Vehiculo vehiculo = new Ejercicio2_Vehiculo("Chevrolet", "Onix Turbo", 67.0);
        vehiculo.mostrarEstado();
    }
}