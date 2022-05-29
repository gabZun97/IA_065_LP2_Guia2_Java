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

public class E24_EDMR_Bonificacion extends E24_EDMR_cuentaJoven {
    private double bnf;
    public E24_EDMR_Bonificacion() {
    }

    public E24_EDMR_Bonificacion(double bnf) {
        this.bnf = bnf;
    }

    public double getBnf() {
        return bnf;
    }

    public void setBnf(double bnf) {
        this.bnf = bnf;
    }

    public void bonificacion(double cantidad, double bonificacion){
        bnf=cantidad*(bonificacion/100);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("La cantidad en su cuenta es de: "+cantidad+"lps. con una bonificación de: "+this.getBnf());
        System.out.println("-----------------------------------------------------------------------------");
    }
}
