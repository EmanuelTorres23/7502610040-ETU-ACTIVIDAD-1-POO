package Parte_H;

public class Ejercicio42_Curso {
    /*
     - Explicación: Ambos objetos pertenecen a la misma clase porque comparten
       exactamente la misma estructura conceptual (atributos y métodos definidos en el molde),
       aunque sus datos sean distintos al representar instancias totalmente independientes en la memoria.
     */
    String nombre;
    int creditos;

    public Ejercicio42_Curso(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void mostrarCurso() {
        System.out.println("Nombre: " + nombre + " - Créditos: " + creditos);
    }

    public static void main(String[] args) {
        Ejercicio42_Curso curso1 = new Ejercicio42_Curso("Programación Orientada a Objetos", 4);
        Ejercicio42_Curso curso2 = new Ejercicio42_Curso("Cálculo Integral", 3);

        curso1.mostrarCurso();
        System.out.println();
        curso2.mostrarCurso();
    }
}