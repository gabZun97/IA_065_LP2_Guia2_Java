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

public class E24_EDMR_cuentaJoven {
    private String nombre;
    private double cantidad;
    private double bonificacion;

    public E24_EDMR_cuentaJoven(String nombre, double cantidad, double bonificacion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.bonificacion = bonificacion;
    }

    public E24_EDMR_cuentaJoven() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    // Método miembro
    public void Mostrar(){
        System.out.println("----------------------------- CUENTA JOVEN ----------------------------------");
        System.out.println("Nombre del titular: "+this.getNombre());
        System.out.println("Bonificación: "+this.getBonificacion()+" %");
        System.out.println("-----------------------------------------------------------------------------");
    }
}
