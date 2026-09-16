package Parte_J;

public class Ejercicio51_Rectangulo {
    double base;
    double altura;

    public Ejercicio51_Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    public void mostrarResultados() {
        System.out.println("Base: " + base + " - Altura: " + altura + " - Área: " + calcularArea() + " - Perímetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Ejercicio51_Rectangulo rectangulo = new Ejercicio51_Rectangulo(5.0, 3.0);
        rectangulo.mostrarResultados();
    }
}