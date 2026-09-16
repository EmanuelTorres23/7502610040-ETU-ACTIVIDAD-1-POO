package Parte_J;

public class Ejercicio56_Temperatura {
    double celsius;

    public Ejercicio56_Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double convertirFahrenheit() {
        return (this.celsius * 9.0 / 5.0) + 32.0;
    }

    public void mostrarTemperatura() {
        System.out.println("Celsius: " + celsius + "°C - Fahrenheit: " + convertirFahrenheit() + "°F");
    }

    public static void main(String[] args) {
        Ejercicio56_Temperatura temperatura = new Ejercicio56_Temperatura(25.0);
        temperatura.mostrarTemperatura();
    }
}