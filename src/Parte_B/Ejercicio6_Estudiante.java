package Parte_B;

public class Ejercicio6_Estudiante {
    String nombre;
    String codigo;
    int semestre;

    // Se usa el constructor por defecto (invisible) al instanciar

    public void mostrarInfo() {
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Ejercicio6_Estudiante estudiante = new Ejercicio6_Estudiante();

        // Asignación manual de atributos (Esto es lo que evalúa el ejercicio)
        estudiante.nombre = "Emanuel";
        estudiante.codigo = "7502610040";
        estudiante.semestre = 2;

        estudiante.mostrarInfo();
    }
}