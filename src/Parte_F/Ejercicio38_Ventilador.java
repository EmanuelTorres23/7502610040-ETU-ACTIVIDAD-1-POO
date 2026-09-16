package Parte_F;

public class Ejercicio38_Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public Ejercicio38_Ventilador(String marca, int velocidad, boolean encendido) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.encendido = encendido;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void subirVelocidad() {
        if (this.encendido && this.velocidad < 3) {
            this.velocidad++;
        }
    }

    public void mostrarEstado() {
        String estadoStr = encendido ? "Encendido" : "Apagado";
        System.out.println("Marca: " + marca + " - Velocidad: " + velocidad + " - Estado: " + estadoStr);
    }

    public static void main(String[] args) {
        Ejercicio38_Ventilador ventilador = new Ejercicio38_Ventilador("Samurai", 1, true);
        ventilador.mostrarEstado();
        System.out.println();
        ventilador.subirVelocidad();
        ventilador.mostrarEstado();
    }
}