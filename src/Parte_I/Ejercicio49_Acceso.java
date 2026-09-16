package Parte_I;

/*
   Ejercicio 49: Intentar acceder a atributos de otro objeto sin la referencia adecuada

 - 1. Ejemplo errado:
   public class Ejercicio49_Acceso {
       int puntaje = 100;

       public void comparar(Ejercicio49_Acceso otro) {
           System.out.println("Puntaje otro: " + puntaje); // Intenta acceder al puntaje del objeto pasado por parámetro usando el campo propio
       }
   }

 - 2. Explicación del error del compilador:
   Si se intenta acceder directamente al miembro de otra instancia sin calificarlo con la referencia
   del objeto correspondiente (por ejemplo, escribiendo `puntaje` en lugar de `otro.puntaje`),
   el programa accederá al atributo del objeto actual (`this`) en lugar del otro objeto, alterando
   la lógica esperada del programa o generando errores de contexto estático si se omite la instancia.

 - 3. Código corregido:
 */
public class Ejercicio49_Acceso {
    int puntaje;

    public Ejercicio49_Acceso(int puntaje) {
        this.puntaje = puntaje;
    }

    public void comparar(Ejercicio49_Acceso otro) {
        System.out.println("Mi Puntaje: " + this.puntaje + " - Puntaje Otro: " + otro.puntaje);
    }

    public static void main(String[] args) {
        Ejercicio49_Acceso obj1 = new Ejercicio49_Acceso(85);
        Ejercicio49_Acceso obj2 = new Ejercicio49_Acceso(95);
        obj1.comparar(obj2);
    }
}