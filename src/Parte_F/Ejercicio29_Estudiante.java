package Parte_F;

public class Ejercicio29_Estudiante {
    String nombre;
    String codigo;
    int semestre;

    public Ejercicio29_Estudiante() {
        this.nombre = "Sin nombre";
        this.codigo = "00000000";
        this.semestre = 1;
    }

    public Ejercicio29_Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1;
    }

    public Ejercicio29_Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + " - Código: " + codigo + " - Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Ejercicio29_Estudiante est = new Ejercicio29_Estudiante("Emanuel", "7502610040", 2);
        est.mostrarEstudiante();
    }
}