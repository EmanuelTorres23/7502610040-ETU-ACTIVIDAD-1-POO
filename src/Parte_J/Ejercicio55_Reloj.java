package Parte_J;

public class Ejercicio55_Reloj {
    int hora;
    int minuto;
    int segundo;

    public Ejercicio55_Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.println("Hora: " + hora + " - Minuto: " + minuto + " - Segundo: " + segundo);
    }

    public static void main(String[] args) {
        Ejercicio55_Reloj reloj = new Ejercicio55_Reloj(14, 30, 45);
        reloj.mostrarHora();
    }
}