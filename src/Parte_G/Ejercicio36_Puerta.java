package Parte_G;

public class Ejercicio36_Puerta {
    String material;
    boolean abierta;

    public Ejercicio36_Puerta(String material, boolean abierta) {
        this.material = material;
        this.abierta = abierta;
    }

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public void mostrarEstado() {
        String estadoStr = abierta ? "Abierta" : "Cerrada";
        System.out.println("Material: " + material + " - Estado: " + estadoStr);
    }

    public static void main(String[] args) {
        Ejercicio36_Puerta puerta = new Ejercicio36_Puerta("Madera", true);
        puerta.mostrarEstado();
        System.out.println();
        puerta.cerrar();
        puerta.mostrarEstado();
    }
}