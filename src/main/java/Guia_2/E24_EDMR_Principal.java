/*
Vamos a definir ahora una “Cuenta Joven”, para ello vamos a crear una nueva clase Cu entaJoven
que deriva de la anterior. Cuando se crea esta nueva clase, además del titular y la cantid ad se debe
guardar una bonificación que estará expresada en tanto por ciento. Construye los siguientes
métodos para la clase:
i. Un constructor.
ii. Los setters y getters para el nuevo atributo.
iii. En esta ocasión los titulares de este tipo de cuenta tienen que ser m ayor de edad., por lo
tanto hay que crear un método esTitularValido() que devuelve verdadero si el titular es
mayor de edad pero menor de 25 años y falso en caso contrario.
iv. Además la retirada de dinero sólo se podrá hacer si el titular es válido.
v. El método mostrar() debe devolver el mensaje de “Cuenta Joven” y la bonificación de la
cuenta.
Piensa los métodos heredados de la clase padre que hay que reescribir.
 */
package Grupo_Numero_3;

public class E24_EDMR_Principal {
    public static void main(String[] args) {
        E24_EDMR_cuentaJoven cuenta = new E24_EDMR_cuentaJoven("Maria Martinez", 2000, 5);
        E24_EDMR_Titular titular = new E24_EDMR_Titular(16);
        E24_EDMR_Bonificacion bonif = new E24_EDMR_Bonificacion();
        cuenta.Mostrar();
        titular.TitularValido();
        bonif.bonificacion(2000,5);
    }
}
