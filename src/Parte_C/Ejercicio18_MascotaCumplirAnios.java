package Parte_C;

public class Ejercicio18_MascotaCumplirAnios {
    String nombre;
    String especie;
    int edad;

    public Ejercicio18_MascotaCumplirAnios(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void cumplirAnios() {
        this.edad += 1;
        System.out.println(nombre + " ha cumplido años.");
    }

    public void mostrarMascota() {
        System.out.println("Mascota: " + nombre + " - Especie: " + especie + " - Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        Ejercicio18_MascotaCumplirAnios mascota = new Ejercicio18_MascotaCumplirAnios("Bruno", "Perro", 2);

        System.out.println("Estado inicial:");
        mascota.mostrarMascota();

        System.out.println("\nCumpliendo años...");
        mascota.cumplirAnios();
        mascota.mostrarMascota();
    }
}