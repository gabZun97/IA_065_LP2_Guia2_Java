/*
Construya un programa que pida un año cualquiera e indique que día es su cumpleaños.
 */
package Grupo_Numero_3;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class E20_MNRC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calendar act= Calendar.getInstance();
        Calendar fut= Calendar.getInstance();
        Date date = new Date ();
        GregorianCalendar Calendario = new GregorianCalendar();

        int a,m,d;

        System.out.print("Ingrese el año: ");
        a= leer.nextInt();
        System.out.print("Ingresa el mes de nacimiento: ");
        m = leer.nextInt();
        System.out.print("Ingresa el dia de nacimiento: ");
        d = leer.nextInt();

        int año = date.getYear()+2030;
        int mes = date.getMonth()+1;
        int dia = date.getDay()+1;

        if (m >= mes && d >= dia) {
            fut.set(año, m, d);
        } else {
            fut.set(año+1, m, d);
        }
        act.set(año, mes, dia);

        long actual = act.getTimeInMillis();
        long futura = fut.getTimeInMillis();
        long diferencia = futura - actual;
        long diferenciadias = diferencia/(24*60*60*1000);

        if (Calendario.isLeapYear(año)) {
            System.out.println("Tu Cumpleaños es en: "+(diferenciadias+1)+" dias");
        } else {
            System.out.println("Tu Cumpleaños es en: "+(diferenciadias)+" dias");
        }
    }
}
