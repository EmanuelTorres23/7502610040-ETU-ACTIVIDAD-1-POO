package Parte_L;

/*

 */
public class Ejercicio71_ComputadorParametrizado {
    String marca;
    int ram;
    double precio;

    public Ejercicio71_ComputadorParametrizado(String marca, int ram, double precio) {
        this.marca = marca;
        this.ram = ram;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " - RAM: " + ram + "GB - Precio: $" + (int) precio);
    }

    public static void main(String[] args) {
        Ejercicio71_ComputadorParametrizado pc = new Ejercicio71_ComputadorParametrizado("Lenovo LOQ", 26, 4500000);
        pc.mostrarInfo();
    }
}