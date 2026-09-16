package Parte_L;

/*

 */
public class Ejercicio73_ComputadorCopia {
    String marca;
    int ram;

    public Ejercicio73_ComputadorCopia(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
    }

    public Ejercicio73_ComputadorCopia(Ejercicio73_ComputadorCopia otro) {
        this.marca = otro.marca;
        this.ram = otro.ram;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " - RAM: " + ram + "GB");
    }

    public static void main(String[] args) {
        Ejercicio73_ComputadorCopia pcOriginal = new Ejercicio73_ComputadorCopia("Lenovo LOQ", 26);
        Ejercicio73_ComputadorCopia pcClon = new Ejercicio73_ComputadorCopia(pcOriginal);

        System.out.println("PC Original");
        pcOriginal.mostrarInfo();
        System.out.println("PC Clon");
        pcClon.mostrarInfo();
    }
}