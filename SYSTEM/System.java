package SYSTEM;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;



public class System {
    public static void main(String[] args) {
        // ver propiedades
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 =  System.lineSeparator();
        System.out.println("lineSeparator = " + lineSeparator2);

        Properties p = System.getProperties();
        p.list(System.out);

        System.out.println("\n==================================");

        // agregar y configurar propiedades del sistema y configuraciones de la aplicacion

        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("No existe el archivo = " + e);
            System.exit(1);
        }

        System.out.println("\n==================================");

        // obtener variables del sistema operativo 
        
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables del ambiente del sistema" + varEnv);

        System.out.println("---------- Listando variables de entorno ------------");
        for(Srting key : varEnv.keySet()){
            System.out.println(key + " => " + var.Env.get(key));
        }
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("Path");
        System.out.println("path = " + path);
        
        String path2 = System.getenv("PATH");
        System.out.println("path2 = " + path2);

        //otras funciones utiles de la clase System

        /**
         * e.printStackTrace();
         * System.err.println("La fecha tiene un formato incorrecto " + e.getMessage);
         *
         * System.err.println(El formato debe ser 'yyyy-MM-dd');
         *
         * System.exit(1);
         *
         * main(args);
         *


         */

        //clase runtime para ejecutar aplicaciones del SO

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try{
            if (System.getProperty("os.name").startsWith("Windows")){
                proceso = rt.exec("notepad");
            }else if (System.getProperty("os.name").startsWith("Mac")){
                proceso = rt.exec("texedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux")||
            (System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            }else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch(IOException e){
            System.err.println("El comando es desconocido");
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);


    }
}
