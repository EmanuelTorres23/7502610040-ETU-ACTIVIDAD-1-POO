package Parte_D;

public class Ejercicio19_ClaseVsObjeto {
    // Estudiante es una clase porque funciona como la plantilla o molde que define los atributos y la estructura general.
    static class Estudiante {
        String nombre;
        String codigo;
        int semestre;
    }

    public static void main(String[] args) {
        // est1 es un objeto porque es una instancia concreta creada en memoria a partir de esa plantilla.
        Estudiante est1 = new Estudiante();
        est1.nombre = "Emanuel";
        est1.codigo = "7502610040";
        est1.semestre = 2;

        System.out.println("Nombre: " + est1.nombre + " - Código: " + est1.codigo + " - Semestre: " + est1.semestre);
    }
}