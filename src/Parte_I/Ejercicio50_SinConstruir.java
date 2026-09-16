package Parte_I;

/*
 - Ejercicio 50: Crear la clase pero nunca construir el objeto en el método main

 - 1. Ejemplo errado:
   public class Ejercicio50_SinConstruir {
       String mensaje = "Hola Mundo";

       public void saludar() {
           System.out.println(mensaje);
       }

       public static void main(String[] args) {
           Ejercicio50_SinConstruir obj; // Declarado pero nunca instanciado con 'new'
           obj.saludar();
       }
   }

 - 2. Explicación del error del compilador:
   El compilador emite el error "variable obj might not have been initialized" porque
   en Java una variable local de tipo objeto debe ser inicializada explícitamente mediante
   el operador `new` antes de invocar cualquier método o acceder a sus propiedades.

 - 3. Código corregido:
 */
public class Ejercicio50_SinConstruir {
    String mensaje;

    public Ejercicio50_SinConstruir(String mensaje) {
        this.mensaje = mensaje;
    }

    public void saludar() {
        System.out.println("Mensaje: " + mensaje + " - Estado: Objeto Construido");
    }

    public static void main(String[] args) {
        Ejercicio50_SinConstruir obj = new Ejercicio50_SinConstruir("Hola Mundo"); // Construcción correcta del objeto
        obj.saludar();
    }
}