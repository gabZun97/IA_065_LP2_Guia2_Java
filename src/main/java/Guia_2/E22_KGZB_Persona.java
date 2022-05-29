/*
Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye los
siguientes métodos para la clase:
i. Un constructor, donde los datos pueden estar vacíos.
ii. Los setters y getters para cada uno de los atributos. Hay que validar los de datos.
iii. mostrar(): Muestra los datos de la persona.
iv. esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
 */
package Grupo_Numero_3;

public class E22_KGZB_Persona {
    private String nombre, edad, DNI;
    public E22_KGZB_Persona() {
    }
    public E22_KGZB_Persona(String nombre, String edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setDN(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEdad() {
        return edad;
    }
    public String getDNI() {
        return DNI;
    }

    public void mostrar() {
        System.out.println("Nombre es: " + getNombre());
        System.out.println("Edad es: " + getEdad());
        System.out.println("DNI es: " + getDNI());
    }
    public void ValidarDNI (String ndi) {
        if (ndi == "0123456789") {
            System.out.println("\nDNI Correcto.");
        } else if (ndi != "0123456789") {
            System.out.println("\nDNI Incorrecto.");
        }
    }
    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            edad = edad;
            System.out.println("\nEs mayor de edad.");
        } else {
            System.out.println("\nEs menor de edad.");
        }
        return true;
    }
}
