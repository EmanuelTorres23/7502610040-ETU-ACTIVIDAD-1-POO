package Parte_K;

/*
 - Ejercicio 65: EquipoDeFutbol

 - Atributos:
   - nombre (String)
   - ciudad (String)
   - puntos (int)

 - Métodos:
   - ganarPartido()
   - mostrarEstado()

 - Objetos reales potenciales:
   - equipo1: Real Cartagena
   - equipo2: Junior de Barranquilla
 */
public class Ejercicio65_EquipoDeFutbol {
    String nombre;
    String ciudad;
    int puntos;

    public Ejercicio65_EquipoDeFutbol(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public void ganarPartido() {
        this.puntos += 3;
    }

    public void mostrarEstado() {
        System.out.println("Equipo: " + nombre + " - Ciudad: " + ciudad + " - Puntos: " + puntos);
    }

    public static void main(String[] args) {
        Ejercicio65_EquipoDeFutbol equipo = new Ejercicio65_EquipoDeFutbol("Real Cartagena", "Cartagena", 15);
        equipo.mostrarEstado();
        System.out.println();
        equipo.ganarPartido();
        equipo.mostrarEstado();
    }
}