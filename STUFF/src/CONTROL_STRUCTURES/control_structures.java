package CONTROL_STRUCTURES;

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

        //ejemplo de if-else

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

    }
}
