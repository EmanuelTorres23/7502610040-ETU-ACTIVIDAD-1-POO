package Parte_L;

/*

 */
public class Ejercicio66_ProyectoSoftware {
    String nombreProyecto;
    String lenguaje;
    String faseDesarrollo;

    public Ejercicio66_ProyectoSoftware(String nombreProyecto, String lenguaje, String faseDesarrollo) {
        this.nombreProyecto = nombreProyecto;
        this.lenguaje = lenguaje;
        this.faseDesarrollo = faseDesarrollo;
    }

    public void avanzarFase(String nuevaFase) {
        this.faseDesarrollo = nuevaFase;
    }

    public void mostrarInfo() {
        System.out.println("Proyecto: " + nombreProyecto + " - Lenguaje: " + lenguaje + " - Fase: " + faseDesarrollo);
    }

    public static void main(String[] args) {
        Ejercicio66_ProyectoSoftware proyecto = new Ejercicio66_ProyectoSoftware("Sistema Gestión", "Java", "Análisis");
        proyecto.mostrarInfo();
    }
}