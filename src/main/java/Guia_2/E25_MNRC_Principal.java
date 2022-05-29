/*
Se plantea desarrollar un programa Java que permita la gestión de una empresa agroalimentaria
que trabaja con tres tipos de productos: productos frescos, productos refrigerados y productos
congelados. Todos los productos llevan esta información común: fecha de caducidad y número de
lote. A su vez, cada tipo de producto lleva alguna información específica. Los productos frescos
deben llevar la fecha de envasado y el país de origen. Los productos refrigerados deben llevar el
código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de
mantenimiento recomendada y el país de origen. Los productos congelados deben llevar la fecha
de envasado, el país de origen y la temperatura de mantenimiento recomendada.
Hay tres tipos de productos congelados: congelados por aire, congelados por agua y congelados
por nitrógeno. Los productos congelados por aire deben llevar la información de la composición
del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido de carbono y % de
vapor de agua). Los productos congelados por agua deben llevar la información de la salinidad del
agua con que se realizó la congelación en gramos de sal por litro de agua. Los productos
congelados por nitrógeno deben llevar la información del método de congelación empleado y del
tiempo de exposición al nitrógeno expresada en segundos.
Crear el código de las clases Java implementando una relación de herencia y el polimorfismo
necesario siguiendo estas indicaciones:
i. En primer lugar realizar un esquema con papel y lápiz donde se represente cómo se van a
organizar las clases cuando escribamos el código. Estudiar los atributos de las clases y
trasladar a la superclasetodo atributo que pueda ser trasladado.
ii. Crear superclases intermedias (aunque no se correspondan con la descripción dada de la
empresa) para agrupar atributos y métodos cuando sea posible. Esto corresponde a “realizar
abstracciones” en el ámbito de la programación, que pueden o no corresponderse con el
mundo real.
iii. Cada clase debe disponer de constructor y permitir establecer (set) y recuperar (get) el valor
de sus atributos y tener un método que permita mostrar la información del objeto cuando
sea procedente.
iv. Crear una clase Principal con el método main donde se creen: dos productos frescos, tres
productos refrigerados y cinco productos congelados (2 de ellos congelados por agua, otros
2 por aire y 1 por nitrógeno). Mostrar la información de cada producto por pantalla.
 */
package Grupo_Numero_3;

public class E25_MNRC_Principal {
    public static void main(String[] args) {
        E25_MNRC_ProductoFresco lechuga = new E25_MNRC_ProductoFresco("16-10-2016","L1603004","15-06-2008", "Venezuela");
        E25_MNRC_ProductoFresco fresa = new E25_MNRC_ProductoFresco("16-05-2016","L1603005","15-05-2008", "Guatemala");
        E25_MNRC_ProductoRefrigerado jugo = new E25_MNRC_ProductoRefrigerado("16-05-2016","L1603006","15-05-2008", "Brazil");
        jugo.setCodigoSupervisionAlimentaria("abcedef");
        E25_MNRC_ProductoRefrigerado malta = new E25_MNRC_ProductoRefrigerado("16-05-2016","L1603007","15-05-2008", "Honduras");
        malta.setCodigoSupervisionAlimentaria("abcedef");
        E25_MNRC_ProductoRefrigerado refresco = new E25_MNRC_ProductoRefrigerado("16-05-2016","L1603008","15-05-2008", "Costa Rica");
        refresco.setCodigoSupervisionAlimentaria("abcedef");
        E25_MNRC_ProductoCongeladoPorAgua pescado = new E25_MNRC_ProductoCongeladoPorAgua("16-05-2016","L1603009","15-05-2008", "Argentina");
        pescado.setSalinidadDelAgua("35,5 ppt");
        E25_MNRC_ProductoCongeladoPorAgua carne = new E25_MNRC_ProductoCongeladoPorAgua("16-05-2016","L1603010","15-05-2008", "Panama");
        carne.setSalinidadDelAgua("35,7 ppt");
        E25_MNRC_ProductoCongeladoPorAire jamon = new E25_MNRC_ProductoCongeladoPorAire("16-05-2016","L1603011","15-05-2008", "Ecuador");
        jamon.setComposicionDelAire("10% de nitrogeno, 70% de oxigeno, 15% de Dioxido de Carbono y 5% de vapor de agua");
        E25_MNRC_ProductoCongeladoPorAire queso = new E25_MNRC_ProductoCongeladoPorAire("16-05-2016","L1603012","15-05-2008", "Colombia");
        queso.setComposicionDelAire("10% de nitrogeno, 70% de oxigeno, 15% de Dioxido de Carbono y 5% de vapor de agua");
        E25_MNRC_ProductoCongeladoPorNitrogeno productox = new E25_MNRC_ProductoCongeladoPorNitrogeno("16-10-2016","L1603013","15-06-2008", "Peru");
        productox.setMetodoDeCongelacion("ultracongelación");
        productox.setTiempoDeExposicionAlNitrogeno("5000 segundos");

        System.out.println("-----------Mostrando la información de los productos de la Empresa Agroalimentaria-------------");
        System.out.println();
        lechuga.imprimirDatos();
        System.out.println();
        fresa.imprimirDatos();
        System.out.println();
        jugo.imprimirDatos();
        System.out.println();
        malta.imprimirDatos();
        System.out.println();
        refresco.imprimirDatos();
        System.out.println();
        pescado.imprimirDatosCA();
        System.out.println();
        carne.imprimirDatosCA();
        System.out.println();
        jamon.imprimirDatosCAi();
        System.out.println();
        queso.imprimirDatosCAi();
        System.out.println();
        productox.imprimirDatosCN();
    }
}
