package Parte_F;

public class Ejercicio30_TresEstudiantes {
    String nombre;
    String codigo;
    int semestre;

    public Ejercicio30_TresEstudiantes() {
        this.nombre = "Sin nombre";
        this.codigo = "00000000";
        this.semestre = 1;
    }

    public Ejercicio30_TresEstudiantes(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1;
    }

    public Ejercicio30_TresEstudiantes(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + " - Código: " + codigo + " - Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Ejercicio30_TresEstudiantes est1 = new Ejercicio30_TresEstudiantes();
        Ejercicio30_TresEstudiantes est2 = new Ejercicio30_TresEstudiantes("Emanuel", "7502610040");
        Ejercicio30_TresEstudiantes est3 = new Ejercicio30_TresEstudiantes("Andrea", "7502610041", 2);

        est1.mostrarEstudiante();
        System.out.println();
        est2.mostrarEstudiante();
        System.out.println();
        est3.mostrarEstudiante();
    }
}