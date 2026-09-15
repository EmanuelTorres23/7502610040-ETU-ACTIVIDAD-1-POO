package Parte_B;

public class Ejercicio7_Vehiculo {
    String marca;
    String modelo;
    double velocidadActual;

    public Ejercicio7_Vehiculo(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void mostrarEstado() {
        System.out.println("Estado del vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + (int) velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Ejercicio7_Vehiculo vehiculo1 = new Ejercicio7_Vehiculo("Chevrolet", "Onix", 67.0);
        Ejercicio7_Vehiculo vehiculo2 = new Ejercicio7_Vehiculo("Mazda", "CX-30", 85.0);

        vehiculo1.mostrarEstado();
        System.out.println();
        vehiculo2.mostrarEstado();
    }
}