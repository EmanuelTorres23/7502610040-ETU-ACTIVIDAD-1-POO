package Parte_B;

public class Ejercicio9_Mascota {
    String nombre;
    String especie;
    int edad;

    public Ejercicio9_Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarMascota() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        Ejercicio9_Mascota mascota = new Ejercicio9_Mascota("Bruno", "Perro", 2);

        System.out.println("Estado inicial:");
        mascota.mostrarMascota();

        System.out.println("\nPrimera actualización de edad:");
        mascota.edad = 3;
        mascota.mostrarMascota();

        System.out.println("\nSegunda actualización de edad:");
        mascota.edad = 5;
        mascota.mostrarMascota();
    }
}