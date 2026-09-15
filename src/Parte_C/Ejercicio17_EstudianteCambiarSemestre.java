package Parte_C;

public class Ejercicio17_EstudianteCambiarSemestre {
    String nombre;
    String codigo;
    int semestre;

    public Ejercicio17_EstudianteCambiarSemestre(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    // Método para cambiar el semestre
    public void cambiarSemestre(int nuevoSemestre) {
        if (nuevoSemestre > 0) {
            this.semestre = nuevoSemestre;
            System.out.println("Semestre actualizado con éxito.");
        } else {
            System.out.println("El nuevo semestre debe ser mayor a 0.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " - Código: " + codigo + " - Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Ejercicio17_EstudianteCambiarSemestre estudiante = new Ejercicio17_EstudianteCambiarSemestre("Emanuel", "7502610040", 1);

        System.out.println("Estado inicial:");
        estudiante.mostrarInfo();

        System.out.println("\nCambiando al semestre 2...");
        estudiante.cambiarSemestre(2);
        estudiante.mostrarInfo();
    }
}