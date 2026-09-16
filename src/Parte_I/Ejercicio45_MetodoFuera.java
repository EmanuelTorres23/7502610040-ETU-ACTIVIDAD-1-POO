package Parte_I;

/*
 * Ejercicio 45: Método fuera de la clase
 *
 - 1. Ejemplo errado:
   public class Ejercicio45_MetodoFuera {
       int x = 10;
   }
   public void mostrar() {
       System.out.println("Valor: " + x);
   }

  - 2. Explicación del error del compilador:
   El compilador arroja el error "class, interface, or enum expected" porque
   en Java todas las variables y métodos deben estar contenidos estrictamente
   dentro de los bloques de llaves {} de una clase o interfaz. Un método no puede
   declararse fuera de la clase.

 - 3. Código corregido:
 */
public class Ejercicio45_MetodoFuera {
    int x = 10;

    public void mostrar() {
        System.out.println("Valor: " + x);
    }

    public static void main(String[] args) {
        Ejercicio45_MetodoFuera obj = new Ejercicio45_MetodoFuera();
        obj.mostrar();
    }
}