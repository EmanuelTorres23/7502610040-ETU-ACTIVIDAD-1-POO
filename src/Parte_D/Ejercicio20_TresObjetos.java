package Parte_D;

public class Ejercicio20_TresObjetos {
    /*
     - Explicación por escrito:
      Qué comparten: Todos comparten la misma estructura, atributos (marca, modelo, velocidadActual)
      y métodos, ya que se han creado a partir de la misma clase.
     - En qué se diferencian: Se diferencian en los valores específicos que tienen asignados en sus
     -   atributos (su estado individual) y en que ocupan espacios de memoria diferentes.
     */
    String marca;
    String modelo;
    double velocidadActual;

    public Ejercicio20_TresObjetos(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca + " - Modelo: " + modelo + " - Velocidad: " + (int) velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Ejercicio20_TresObjetos v1 = new Ejercicio20_TresObjetos("Chevrolet", "Onix Turbo", 40.0);
        Ejercicio20_TresObjetos v2 = new Ejercicio20_TresObjetos("Renault", "Sandero", 60.0);
        Ejercicio20_TresObjetos v3 = new Ejercicio20_TresObjetos("Mazda", "CX-30", 80.0);

        v1.mostrarEstado();
        System.out.println();
        v2.mostrarEstado();
        System.out.println();
        v3.mostrarEstado();
    }
}