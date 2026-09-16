package Parte_K;

/*
 - Ejercicio 61: Docente

 - Atributos:
   - nombre (String)
   - identificacion (String)
   - asignatura (String)

 - Métodos:
   - dictarClase()
   - mostrarInfo()

 - Objetos reales potenciales:
  - docente1: Profesor de Programación Orientada a Objetos
  - docente2: Profesor de Cálculo Integral
 */
public class Ejercicio61_Docente {
    String nombre;
    String identificacion;
    String asignatura;

    public Ejercicio61_Docente(String nombre, String identificacion, String asignatura) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.asignatura = asignatura;
    }

    public void dictarClase() {
        System.out.println("Acción: El docente " + nombre + " está impartiendo la clase de " + asignatura);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " - Identificación: " + identificacion + " - Asignatura: " + asignatura);
    }

    public static void main(String[] args) {
        Ejercicio61_Docente docente = new Ejercicio61_Docente("John Arrieta", "1042567890", "Programación Orientada a Objetos");
        docente.mostrarInfo();
        System.out.println();
        docente.dictarClase();
    }
}