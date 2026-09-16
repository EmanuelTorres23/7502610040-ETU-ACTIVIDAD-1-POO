package Parte_K;

/*
 - Ejercicio 63: Hospital

 - Atributos:
   - nombre (String)
   - ciudad (String)
   - camasDisponibles (int)

 - Métodos:
  - ingresarPaciente()
  - mostrarEstado()

 - Objetos reales potenciales:
   - hospital1: Hospital Universitario del Caribe
   - hospital2: Clínica San José de Torices
 */
public class Ejercicio63_Hospital {
    String nombre;
    String ciudad;
    int camasDisponibles;

    public Ejercicio63_Hospital(String nombre, String ciudad, int camasDisponibles) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.camasDisponibles = camasDisponibles;
    }

    public void ingresarPaciente() {
        if (this.camasDisponibles > 0) {
            this.camasDisponibles--;
        }
    }

    public void mostrarEstado() {
        System.out.println("Hospital: " + nombre + " - Ciudad: " + ciudad + " - Camas Disponibles: " + camasDisponibles);
    }

    public static void main(String[] args) {
        Ejercicio63_Hospital hospital = new Ejercicio63_Hospital("Hospital Universitario del Caribe", "Cartagena", 42);
        hospital.mostrarEstado();
        System.out.println();
        hospital.ingresarPaciente();
        hospital.mostrarEstado();
    }
}