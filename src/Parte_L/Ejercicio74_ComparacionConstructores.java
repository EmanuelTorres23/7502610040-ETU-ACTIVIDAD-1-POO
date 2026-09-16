package Parte_L;

/*

 - 1. Constructor Vacío (por defecto / sin parámetros):
      - Inicializa el objeto con valores predeterminados (null, 0, false).
      - Requiere asignar individualmente el valor de cada atributo mediante setters o acceso directo.
      - Inconveniente: Puede generar objetos incompletos o en estados inconsistentes si se olvida asignar un atributo.

  - 2. Constructor con Parámetros:
      - Recibe explícitamente los datos al momento de instanciar el objeto.
      - Garantiza que el objeto nazca completamente inicializado y en un estado válido desde su creación en una sola línea de código.
      - Es la forma más recomendada, limpia y clara para principiantes, ya que relaciona directamente los datos de entrada con el estado del objeto.

  - 3. Constructor Copia:
      - Recibe como argumento otro objeto de la misma clase para duplicar sus atributos en un nuevo espacio de memoria.
      - Es muy útil cuando se requiere clonar un objeto sin afectar el original, aunque resulta más abstracto y avanzado para quienes están empezando.

 - ARGUMENTACIÓN PARA PRINCIPIANTES:
 - El constructor con parámetros es la forma más clara para principiantes porque exige pasar todos los datos obligatorios al instanciar (`new Clase(val1, val2)`), evitando olvidos en la asignación de atributos y manteniendo el código legible, ordenado y compacto desde el primer día.
 */
public class Ejercicio74_ComparacionConstructores {

}