package Parte_H;

public class Ejercicio43_Computador {
    /*
     - Explicación: El plano conceptual (la clase) define el diseño general, atributos y
       comportamientos posibles que tendrá cualquier computador, sin poseer un estado propio
       ni ocupar memoria de ejecución. En contraste, la máquina concreta (el objeto) es la
       instancia real creada a partir de ese plano, la cual posee valores particulares y
       existe físicamente en la memoria del sistema.
     */
    String marca;
    int ram;
    String procesador;

    public Ejercicio43_Computador(String marca, int ram, String procesador) {
        this.marca = marca;
        this.ram = ram;
        this.procesador = procesador;
    }

    public void mostrarComputador() {
        System.out.println("Marca: " + marca + " - RAM: " + ram + " GB - Procesador: " + procesador);
    }

    public static void main(String[] args) {
        Ejercicio43_Computador computador = new Ejercicio43_Computador("Lenovo", 26, "AMD Ryzen 7");
        computador.mostrarComputador();
    }
}