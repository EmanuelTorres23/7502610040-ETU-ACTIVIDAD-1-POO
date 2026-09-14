package Parte_A;

public class Ejercicio1_Estudiante {
    String nombre;
    String codigo;
    int semestre;

    public Ejercicio1_Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Ejercicio1_Estudiante estudiante = new Ejercicio1_Estudiante("Emanuel", "7502610040", 2);
        estudiante.mostrarInfo();
    }
}