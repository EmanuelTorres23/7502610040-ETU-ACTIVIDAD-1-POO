package Parte_L;

/*

 */
public class Ejercicio68_TiendaOnline {
    String plataforma;
    String estadoSuscripcion;
    int productosActivos;

    public Ejercicio68_TiendaOnline(String plataforma, String estadoSuscripcion, int productosActivos) {
        this.plataforma = plataforma;
        this.estadoSuscripcion = estadoSuscripcion;
        this.productosActivos = productosActivos;
    }

    public void cancelarSuscripcion() {
        this.estadoSuscripcion = "Cancelada";
    }

    public void mostrarInfo() {
        System.out.println("Plataforma: " + plataforma + " - Suscripción: " + estadoSuscripcion + " - Productos: " + productosActivos);
    }

    public static void main(String[] args) {
        Ejercicio68_TiendaOnline tienda = new Ejercicio68_TiendaOnline("Shopify", "Activa", 15);
        tienda.mostrarInfo();
    }
}