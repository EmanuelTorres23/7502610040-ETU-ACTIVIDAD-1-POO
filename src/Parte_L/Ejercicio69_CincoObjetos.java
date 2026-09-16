package Parte_L;

/*

 */
public class Ejercicio69_CincoObjetos {
    public static void main(String[] args) {
        System.out.println("5 Objetos de Ejercicio 66 (ProyectoSoftware)");
        Ejercicio66_ProyectoSoftware p1 = new Ejercicio66_ProyectoSoftware("Sistema Gestión", "Java", "Análisis");
        Ejercicio66_ProyectoSoftware p2 = new Ejercicio66_ProyectoSoftware("App Tareas", "Java", "Desarrollo");
        Ejercicio66_ProyectoSoftware p3 = new Ejercicio66_ProyectoSoftware("Calculadora Sumas Riemann", "Java", "Pruebas");
        Ejercicio66_ProyectoSoftware p4 = new Ejercicio66_ProyectoSoftware("Script Git", "Bash", "Implementación");
        Ejercicio66_ProyectoSoftware p5 = new Ejercicio66_ProyectoSoftware("API Inventario", "Java", "Diseño");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
        p4.mostrarInfo();
        p5.mostrarInfo();

        System.out.println("\n5 Objetos de Ejercicio 67 (Videojuego)");
        Ejercicio67_Videojuego j1 = new Ejercicio67_Videojuego("Minecraft Java Edition", "PC", true);
        Ejercicio67_Videojuego j2 = new Ejercicio67_Videojuego("GTA Hub", "RAGEMP", false);
        Ejercicio67_Videojuego j3 = new Ejercicio67_Videojuego("Supermarket Together", "PC", false);
        Ejercicio67_Videojuego j4 = new Ejercicio67_Videojuego("EA Sports FC", "Consola", false);
        Ejercicio67_Videojuego j5 = new Ejercicio67_Videojuego("Valorant", "PC", false);
        j1.mostrarInfo();
        j2.mostrarInfo();
        j3.mostrarInfo();
        j4.mostrarInfo();
        j5.mostrarInfo();

        System.out.println("\n 5 Objetos de Ejercicio 68 (TiendaOnline)");
        Ejercicio68_TiendaOnline t1 = new Ejercicio68_TiendaOnline("Shopify", "Activa", 15);
        Ejercicio68_TiendaOnline t2 = new Ejercicio68_TiendaOnline("Ebay", "Activa", 50);
        Ejercicio68_TiendaOnline t3 = new Ejercicio68_TiendaOnline("MercadoLibre", "Sin Suscripción", 5);
        Ejercicio68_TiendaOnline t4 = new Ejercicio68_TiendaOnline("Amazon", "Activa", 120);
        Ejercicio68_TiendaOnline t5 = new Ejercicio68_TiendaOnline("Shein", "Inactiva", 0);
        t1.mostrarInfo();
        t2.mostrarInfo();
        t3.mostrarInfo();
        t4.mostrarInfo();
        t5.mostrarInfo();
    }
}