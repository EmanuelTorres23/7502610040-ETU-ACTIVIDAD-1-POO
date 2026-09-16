package Parte_J;

public class Ejercicio54_Semaforo {
    String color;

    public Ejercicio54_Semaforo(String color) {
        this.color = color;
    }

    public void cambiarColor() {
        if (this.color.equalsIgnoreCase("Rojo")) {
            this.color = "Verde";
        } else if (this.color.equalsIgnoreCase("Verde")) {
            this.color = "Amarillo";
        } else {
            this.color = "Rojo";
        }
    }

    public void mostrarEstado() {
        System.out.println("Color Actual: " + color);
    }

    public static void main(String[] args) {
        Ejercicio54_Semaforo semaforo = new Ejercicio54_Semaforo("Rojo");

        semaforo.mostrarEstado();
        semaforo.cambiarColor();
        semaforo.mostrarEstado();
        semaforo.cambiarColor();
        semaforo.mostrarEstado();
        semaforo.cambiarColor();
        semaforo.mostrarEstado();
    }
}