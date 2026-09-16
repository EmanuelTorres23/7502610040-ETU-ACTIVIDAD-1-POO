package Parte_I;

/*
 - Ejercicio 48: Confundir atributos con variables locales (Sombreamiento / Shadowing)

 - 1. Ejemplo errado:
   public class Ejercicio48_Confusion {
       String nombre = "Atributo";

       public Ejercicio48_Confusion(String nombre) {
           nombre = nombre; // Asigna el parámetro a sí mismo, dejando el atributo en null o valor por defecto
       }
   }

 - 2. Explicación del error del compilador / lógicos:
   Aunque sintácticamente compila si no hay ambigüedad estricta, se produce un error de lógica
   (sombreamiento o shadowing) donde la variable local/parámetro `nombre` oculta al atributo de la clase.
   Al escribir `nombre = nombre;`, Java actualiza el parámetro local y el atributo de la clase nunca recibe el valor.
   Para solucionarlo, se debe usar la palabra reservada `this` para diferenciar el atributo del parámetro.

 - 3. Código corregido:
 */
public class Ejercicio48_Confusion {
    String nombre;

    public Ejercicio48_Confusion(String nombre) {
        this.nombre = nombre; // Se usa 'this' para referirse al atributo de la clase
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " - Estado: Corregido");
    }

    public static void main(String[] args) {
        Ejercicio48_Confusion obj = new Ejercicio48_Confusion("Emanuel");
        obj.mostrar();
    }
}