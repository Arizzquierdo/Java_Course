package ARRAYS;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int [] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 4;


        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        System.out.println("\n===============================");


        String [] productos = new String[7];
        int total = productos.length;

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

        productos [0] ="Kingston";
        productos [1] ="Sandisk";
        productos [2] ="Nokia";
        productos [3] ="Motorola";
        productos [4] ="Samsung";
        productos [5] ="Apple";
        productos [6] ="Asus";

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        // y asi sucesivamente
        //tambien se puede usar un for

        System.out.println("Usando for each");
        for (String prod : productos ) {
            System.out.println("prod = " + prod);
        }
        // REPETIDO
        System.out.println("Usando for");
        for(int i = 0; i < total ; i ++) {
            System.out.println("para indice" + i + " : " + productos[i]);
        }

        System.out.println("usando while");
        int o = 0;
        do {
            System.out.println("para indice" + i + " : " + productos[i]);
            j++;
        } while (o < total);

        for (int z = 0; z < total; k ++){
            System.out.println("numeros = " + numeros[z]);
        }

        // iterando a la inversa un arreglo
        System.out.println("iterando un for a la inversa");
        for (int i= 0; i < total; i ++) {
            System.out.println("Para i = " + (total-1-i + "valor" + productos[total-1-i]));
        }
        System.out.println("iterando un for a la inversa 2º metodo");
        for (int i = total -1 ; i >= 0; i--) {
            System.out.println("para i " + i + "valor " + productos[total - 1 - i]);
        }
        

        System.out.println("\n============================");

        //modificando el arreglo a la inversa
        public static void arregloInverso (String [] arreglo){
            int total2 = arreglo.length;
            for (int i = 0; i < total2; i++) {
                String actual = arreglo[i];
                String inverso = arreglo[total - 1 - i];
                productos[i] = inverso;
                productos[total - 1 - i] = actual;
                total2--;
            }

        }


    }
}
