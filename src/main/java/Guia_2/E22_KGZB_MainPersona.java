/*
Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye los
siguientes métodos para la clase:
i. Un constructor, donde los datos pueden estar vacíos.
ii. Los setters y getters para cada uno de los atributos. Hay que validar los de datos.
iii. mostrar(): Muestra los datos de la persona.
iv. esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
 */
package Grupo_Numero_3;

public class E22_KGZB_MainPersona {
    public static void main(String[] args) {
        E22_KGZB_Persona persona = new E22_KGZB_Persona("Kevin", "24","0123456789");
        persona.mostrar();
        persona.esMayorDeEdad(18);
        persona.ValidarDNI("0123456789");
    }
}
