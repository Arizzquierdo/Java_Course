package MATHS;

import java.math.*;

public class Maths {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor (3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);
        
        //trigonometria
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);
        
        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));

        System.out.println("\n=============================================");

        // metodo random para generar numeros aleatorios

        String [] colores = {"azul", "amarillo", "rojo", "verde", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length ;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);
        

        
    }
}
