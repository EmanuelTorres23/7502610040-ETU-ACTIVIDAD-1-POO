package Parte_J;

public class Ejercicio59_UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public Ejercicio59_UsuarioSistema(String nombreUsuario, String clave, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    public void mostrarEstado() {
        String estadoStr = activo ? "Activo" : "Inactivo";
        System.out.println("Usuario: " + nombreUsuario + " - Estado: " + estadoStr);
    }

    public static void main(String[] args) {
        Ejercicio59_UsuarioSistema usuario = new Ejercicio59_UsuarioSistema("emanuel_dev", "secreto123", false);
        usuario.mostrarEstado();
        System.out.println();
        usuario.activar();
        usuario.mostrarEstado();
    }
}