/*
Construya un programa que integre la interfaz grafica de usuario requerida para realizar cambios
de lempiras a dólares y viceversa.
 */
package Grupo_Numero_3;

public class E21_RAGG {
    private double Lempiras;
    private double Dolares;

    //Constructor por defecto
    public E21_RAGG(){
    }

    //Constructor por parametro
    public E21_RAGG(double Lempiras, double Dolares) {
        this.Lempiras = Lempiras;
        this.Dolares = Dolares;
    }

    //Set y Get

    public double getLempiras() {
        return Lempiras;
    }

    public void setLempiras(double Lempiras) {
        this.Lempiras = Lempiras;
    }

    public double getDolares() {
        return Dolares;
    }

    public void setDolares(double Dolares) {
        this.Dolares = Dolares;
    }

    //Metodos propios
    public double CambioD(){
        this.setDolares(this.getLempiras()*0.041);
        return this.getDolares();
    }

    public double CambioL(){
        this.setLempiras(this.getDolares()*24.14);
        return this.getLempiras();
    }
}
