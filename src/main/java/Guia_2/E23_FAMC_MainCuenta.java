/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y
cantidad (puede tener decimales). El titular será obligatorio y la cantidad es opcional. Construye
los siguientes métodos para la clase y una clase adicional principal donde se evidencie su
funcionamiento correcto:
i. Un constructor, donde los datos pueden estar vacíos.
ii. Los setters y getters para cada uno de los atributos. El atributo no se puede modificar
directamente, sólo ingresando o retirando dinero.
iii. mostrar(): Muestra los datos de la cuenta.
iv. ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es
negativa, no se hará nada.
v. retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
 */
package Grupo_Numero_3;

public class E23_FAMC_MainCuenta {
    public static void main(String[] args) {
        E23_FAMC_Cuenta cuenta1 = new E23_FAMC_Cuenta("Francisco");
        E23_FAMC_Cuenta cuenta2 = new E23_FAMC_Cuenta("Alexander", 300);
        cuenta1.ingresar(300);
        cuenta2.ingresar(400);

        cuenta1.retirar(500);
        cuenta2.retirar(100);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
