package Parte_A;

public class Ejercicio5_Mascota {
    String nombre;
    String especie;
    int edad;

    public Ejercicio5_Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarMascota() {
        System.out.println("Información de la mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        Ejercicio5_Mascota mascota = new Ejercicio5_Mascota("Bruno", "Perro", 2);
        mascota.mostrarMascota();
    }
}