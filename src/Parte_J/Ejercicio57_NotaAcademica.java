package Parte_J;

public class Ejercicio57_NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public Ejercicio57_NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularDefinitiva() {
        return (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public void mostrarDefinitiva() {
        System.out.println("Asignatura: " + asignatura + " - Nota 1: " + nota1 + " - Nota 2: " + nota2 + " - Nota 3: " + nota3 + " - Definitiva: " + calcularDefinitiva());
    }

    public static void main(String[] args) {
        Ejercicio57_NotaAcademica nota = new Ejercicio57_NotaAcademica("Programación Orientada a Objetos", 4.5, 4.0, 4.8);
        nota.mostrarDefinitiva();
    }
}