package CONTROL_STRUCTURES;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class control_structures {
    public static void main(String[] args) {
        //decidir = if / else
        float promedio = 6.5f;

        if (promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio!");
        }else if (promedio>= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5){
            System.out.println("Buen promedio");
        } else {
            System.out.println("Estás suspendido");
        }

        System.out.println("===========================================");

        //ejemplo de if-else anio bisiesto

        int mes = 9;

        int numeroDias = 0;
        int anio = 2020;

        if (mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if (mes == 4 ||mes == 6|| mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDias = 29;
            }
            else {
                numeroDias = 28;
            }

            System.out.println("número de días  = " + numeroDias);
            System.out.println(" ========================================== ");
        }

        // SWICH-CASE CHAR

        char num = '2';

        switch (num){
            case '0':
                System.out.println("El numero es cero");
                break;
            case '1':
                System.out.println("El numero es uno");
                break;
            case '2':
                System.out.println("El numero es dos");
            case '3':
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("numero o caracter desconocido");

        }

        // SWITCH-CASE STRING

        String nombre = "Andres";

        switch(nombre){
            case "admin":
                System.out.println("hola admin");
            break;

            case "pepe":
                System.out.println("hola pepe");
                break;

            default:
                System.out.println("usuario desconocido");

        }

        System.out.println("=================================");

        // ejemplo con meses switch
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero del mes entre 1 y 12 ");
        int mess = sc.nextInt();
        String nombreMes= null;

        switch(mess){
            case 1 :
                nombreMes = "Enero";
                break;
            case 2 :
                nombreMes = "Enero";
                break;
            case 3 :
                nombreMes = "Enero";
                break;
            case 4 :
                nombreMes = "Enero";
                break;
            case 5 :
                nombreMes = "Enero";
                break;
            case 6 :
                nombreMes = "Enero";
                break;
            case 7 :
                nombreMes = "Enero";
                break;
            case 8 :
                nombreMes = "Enero";
                break;
            case 9 :
                nombreMes = "Enero";
                break;
            case 10 :
                nombreMes = "Enero";
                break;
            case 11 :
                nombreMes = "Enero";
                break;
            case 12 :
                nombreMes = "Enero";
                break;
            default:
                System.out.println("no es un mes registrado lmao");
                break;
        }
        System.out.println("=======================================");

        // switch case numero dias

        int  numeroDias1 = 0 ;
        System.out.println("Ingrese el año");
        int anio1 = sc.nextInt();

        switch (mes){
            case 1_1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
           numeroDias1 = 31;
           break;
            case 4:
            case 6:
            case 9:
            case 11_1:
             numeroDias1 = 30;
             break;
            case 2 :
                if (anio1 % 400 == 0 || (anio % 4 == 0 ) && !(anio1 % 100 == 0)){
                    numeroDias1 = 29 ;
                } else {
                    numeroDias1 = 28 ;
                }
                break;
            default:

        }

        System.out.println("=====================");

        // for ; Introducción a bucles
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 0 ; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 1, j = 10; i< j; i++, j--) {
            System.out.println(i + " - " + j);
        }
        
        for (int i = 0; i <=10 ; i++ ){
            if (i % 2 == 0){
              continue;
            }

            System.out.println("===================================");



            
        }
    //iterando arreglos con sentencia for y palabras reservadas break y continue

    String [] nombres = {"Andres", "Pepe" , "Maria" , "Paco", "Lalo", "Bea", "Pato", "Pepa"};
    int count = nombres.length;
        for (int i = 0; i < count ; i++) {
           if (nombres[i].equals ("Pepa")){
               continue;
            }
            System.out.println(i + " = " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre por favor");
        System.out.println("buscar = " + buscar);

        boolean encontrado = true;

        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }

            if(encontrado){
                JOptionPane.showMessageDialog(null, buscar + "fue encontrado");
            } else {
                JOptionPane.showMessageDialog(null, buscar + "no se encontró");
            }

        }
        System.out.println("======================");

        // sentencias while y do while

        int i1 = 0;
        boolean prueba = true;

        while (prueba){

            if (i1 == 7){
                prueba = false ;
            }
            System.out.println("i1 = " + i1);
            i1 ++;
        }

        prueba = false;
       do{
           System.out.println("se ejecuta por lo menos una vez");
       } while (prueba);

       prueba = true ;
       i1 = 0;

       do {
           if (i1 == 10 ){
             prueba = false;
           }
           System.out.println("i1 = " + i1);
           i1 ++ ;
       } while (prueba);

        System.out.println( " ========================================= ");

        // for each

        int [] numeros = {1, 3, 5 , 7, 9 , 11, 13, 15};

        for (int num1 : numeros){
            System.out.println("num = " + num);
        }

        String [] nombres1 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea","Pato", "Pepa"};

        for(String nombree : nombres1) {
            System.out.println("nombre = " + nombree);
        }

        System.out.println("==================================================");

        // etiquetas en las sentencias for y while

        bucle:
        for (int  i = 1; i <=7; i ++) {
            int j = 1;
            while ( j <= 8){
                if (i == 6 || i == 7){
                    System.out.println("Dia " + i + ": descanso fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs.");
            }
        }
        System.out.println("\n===========================================================");

        bucle1:
        for (int i = 0; i < 5 ; i++) {

            for (int j = 0; j < 0 ; j++){
                if( i == 2){
                    continue bucle1;
                }
                System.out.println("i = " + i);
                 j++;
            }
        }

        System.out.println("\n===========================================================");

        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
               if (i == 2){
                   break etiqueta;
               }
                System.out.println("[i = " + i + ", j = " + j + "], ");
               j++;
            }

        }

        System.out.println("\n===========================================================");

        // ejemplo de buscar con sentencias anidadas

        String frase = "trigo tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(i) != letra){
                    continue buscar;
                }
            }
            cantidad ++ ;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + "veces la palabra " + palabra + "en la frase");

        System.out.println("\n=================================================");

        // modo depuracion

}
}
