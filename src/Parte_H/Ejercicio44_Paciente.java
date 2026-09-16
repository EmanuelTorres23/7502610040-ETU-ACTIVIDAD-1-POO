package Parte_H;

public class Ejercicio44_Paciente {
    /*
     - Explicación: "Crear un paciente" es un concepto del dominio del problema
       (enfocado en la lógica del negocio o del mundo real), mientras que "instanciar
       la clase Paciente" es el mecanismo técnico y sintáctico de la programación
       orientada a objetos (empleando la palabra reservada 'new') para llevar ese
       concepto abstracto a una entidad concreta con memoria asignada en el software.
     */
    String nombre;
    int edad;
    String diagnostico;

    public Ejercicio44_Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public void mostrarPaciente() {
        System.out.println("Nombre: " + nombre + " - Edad: " + edad + " - Diagnóstico: " + diagnostico);
    }

    public static void main(String[] args) {
        Ejercicio44_Paciente paciente = new Ejercicio44_Paciente("Carlos Pérez", 45, "Hipertensión");
        paciente.mostrarPaciente();
    }
}