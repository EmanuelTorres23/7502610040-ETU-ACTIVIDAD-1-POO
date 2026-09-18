package Parte_G;

public class Ejercicio35_Lampara {
    String marca;
    boolean encendida;

    public Ejercicio35_Lampara(String marca, boolean encendida) {
        this.marca = marca;
        this.encendida = encendida;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void mostrarEstado() {
        String estadoStr = encendida ? "Encendida" : "Apagada";
        System.out.println("Marca: " + marca + " - Estado: " + estadoStr);
    }

    public static void main(String[] args) {
        Ejercicio35_Lampara lampara = new Ejercicio35_Lampara("Philips", false);
        lampara.mostrarEstado();
        System.out.println();
        lampara.encender();
        lampara.mostrarEstado();
    }
}