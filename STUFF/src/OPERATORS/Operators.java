package OPERATORS;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;

public class Operators {
    public static void main(String[] args) {

        int i = 5, j=4, suma = i+j;
        System.out.println("suma " + suma);;
        System.out.println("i + j = " + (i+j));

        //y asi con el resto de operaciones basicas

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        System.out.println("=============================================");

        // ejemplo de un login con operadores logicos

        String username = "andres";
        String pswd = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = sc.next();


        System.out.println("Ingrese el username");
        String p = sc.next();

        boolean esAutenticado = false;

        if (username.equals(u) && pswd.equals(p)){
            esAutenticado = true;
        }else {
            System.out.println("USUARIO O CONTRASEÑAS INCORRECTOS");
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario".concat(u).concat("!"));
        }else {
            System.out.println("lo siento pero requiere de autenticación");
        }

        System.out.println("==========================");

       //ejemplo de login con un array

        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        usernames[1] = "12345";

        Scanner sc2 = new Scanner(System.in);

        System.out.println("ingrese el username");
        String u1= sc2.next();

        System.out.println("ingrese la contraseña");
        String pswd2 = sc2.next();

        boolean seAutentica = false;

        for (int k = 0; k < usernames.length; k++) {
            if (usernames[i].equals(u1) && passwords[i].equals(pswd2)){
                System.out.println("bienvenido usuario".concat(u1).concat(pswd2));
        } else {
                System.out.println("Lo sentimos, requiere autenticación");
            }
        }

        System.out.println("===============================================");

        //ejemplo login operador ternario
        String mensaje = esAutenticado ? "Sí":"No";

        System.out.println( "=========================================");

        //OPERADORES TERNARIOS

        String variable = 7 == 5? "sí es verdadero":"no, es falso";
        System.out.println("variable = " + variable);


        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc3 = new Scanner(System.in);

        System.out.println("ingrese la nota de matematicas entre 2.0 - 7.0");
        matematicas = sc3.nextDouble();

        System.out.println("ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = sc3.nextDouble();

        System.out.println("ingrese la nota de historia entre 2.0 - 7.0");
        historia = sc3.nextDouble();


        promedio = (matematicas + ciencias + historia) / 3;


        //la siguiente linea sustituiría una estructura de if-else en algo mas corto
        estado = promedio >= 5.49 ? "true":"Rechazado";
        System.out.println(" estado = " + estado);

        System.out.println("================================");

        //INSTANCEOF (consultar un poco en profundidad)
        String texto = "Creando un objeto de la clase String ... que tal!";
        Integer num = 7;
        boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object =" + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        System.out.println("=========================");
    }
}
