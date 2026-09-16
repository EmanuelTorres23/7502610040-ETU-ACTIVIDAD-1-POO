package Parte_H;

public class Ejercicio41_Empleado {
    /*
     - Explicación: Modelar con clases y objetos es mejor que usar variables sueltas
      (programación estructurada) porque agrupa los datos y el comportamiento relacionados
       de un empleado en una sola estructura cohesiva. Esto evita la dispersión de variables
       independientes, mejora la legibilidad, facilita la reutilización del código y
       permite manejar múltiples instancias de manera organizada mediante el paradigma orientado a objetos.
     */
    String nombre;
    String cargo;
    double salario;

    public Ejercicio41_Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre + " - Cargo: " + cargo + " - Salario: $" + (int) salario);
    }

    public static void main(String[] args) {
        Ejercicio41_Empleado empleado = new Ejercicio41_Empleado("Emanuel", "Desarrollador de Software", 3500000.0);
        empleado.mostrarEmpleado();
    }
}