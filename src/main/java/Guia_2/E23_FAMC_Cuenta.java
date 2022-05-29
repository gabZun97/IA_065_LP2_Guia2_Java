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

public class E23_FAMC_Cuenta {
    private String titular;
    private double cantidad;

    public E23_FAMC_Cuenta (String titular) {
        this(titular, 0);
    }
    public E23_FAMC_Cuenta(String titular, double cantidad){
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
    public String getTitular() {
        return titular;
    }

    public void setTitulat(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    //Ingresar
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }
    //Retirar
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return " El titular: " + titular + " tiene la cantidad de: " + cantidad + " en lempiras de su cuenta.";
    }
}
