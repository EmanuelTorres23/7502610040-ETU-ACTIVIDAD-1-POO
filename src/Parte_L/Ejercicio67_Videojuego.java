package Parte_L;

/*

 */
public class Ejercicio67_Videojuego {
    String nombre;
    String plataforma;
    boolean usaMods;

    public Ejercicio67_Videojuego(String nombre, String plataforma, boolean usaMods) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.usaMods = usaMods;
    }

    public void activarMods() {
        this.usaMods = true;
    }

    public void mostrarInfo() {
        String modsStr = usaMods ? "Sí" : "No";
        System.out.println("Juego: " + nombre + " - Plataforma: " + plataforma + " - Mods: " + modsStr);
    }

    public static void main(String[] args) {
        Ejercicio67_Videojuego juego = new Ejercicio67_Videojuego("Minecraft Java Edition", "PC", true);
        juego.mostrarInfo();
    }
}