package Parte_G;

public class Ejercicio37_Celular {
    String marca;
    int bateria;
    boolean prendido;

    public Ejercicio37_Celular(String marca, int bateria, boolean prendido) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = prendido;
    }

    public void encender() {
        this.prendido = true;
    }

    public void apagar() {
        this.prendido = false;
    }

    public void cargarBateria(int cantidad) {
        this.bateria += cantidad;
        if (this.bateria > 100) {
            this.bateria = 100;
        }
    }

    public void mostrarEstado() {
        String estadoStr = prendido ? "Prendido" : "Apagado";
        System.out.println("Marca: " + marca + " - Batería: " + bateria + "% - Estado: " + estadoStr);
    }

    public static void main(String[] args) {
        Ejercicio37_Celular celular = new Ejercicio37_Celular("Xiaomi", 50, true);
        celular.mostrarEstado();
        System.out.println();
        celular.cargarBateria(30);
        celular.mostrarEstado();
    }
}