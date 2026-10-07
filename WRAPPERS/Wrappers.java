package WRAPPERS;



public class Wrappers {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto =  Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

        System.out.println("\n================================================");

        // Autoboxing y unboxing

        Integer [] enteros = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7};
        
        int suma = 0;
        
        for(Integer i : enteros){
            if (i.intValue() % 2 == 0 ){
                suma += i.intValue();
            }
            System.out.println("suma = " + suma);
        }

        System.out.println("\n================================================");
        //clases wrapper boolean

        Integer num1 = Integer.valueOf(1000);
        Integer num_2 = num1;

        boolean primoBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primoBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");

        System.out.println("primoBoolean = " + primoBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Comparando dos objetos Boolean: " + (objBoolean == objBoolean2));
        
        num_2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num_2 = " + num_2);

        System.out.println("Son el mismo objeto?" + (num1 == num_2 ));

        System.out.println("tienen el mismo valor?" + (num1.equals(num_2)));
        System.out.println("tienen el mismo valor?" + (num1.intValue() == num_2.intValue()));
        
        num_2 = 500;
        boolean condicion = num1 > num_2;
        System.out.println("condicion = " + condicion);

        System.out.println("\n================================================");



    }
}
