package Parte_I;

/*
   Ejercicio 47: Intentar usar un objeto sin haberlo creado (inicializado)

  - 1. Ejemplo errado:
   public class Ejercicio47_SinCrear {
       String nombre = "Emanuel";
       public static void main(String[] args) {
           Ejercicio47_SinCrear obj;
           System.out.println("Nombre: " + obj.nombre);
       }
  }

 - 2. Explicación del error del compilador:
   El compilador muestra el error "variable obj might not have been initialized"
   porque en Java las variables locales deben ser inicializadas antes de ser
   utilizadas en cualquier operación o acceso a sus miembros.

 - 3. Código corregido:
 */
public class Ejercicio47_SinCrear {
    String nombre;

    public Ejercicio47_SinCrear(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Ejercicio47_SinCrear obj = new Ejercicio47_SinCrear("Emanuel");
        System.out.println("Nombre: " + obj.nombre);
    }
}