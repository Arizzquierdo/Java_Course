package STRING_METHODS;

public class Strings {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() =" + nombre.length());
        System.out.println("nombre.toUpperCase() = "+ nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() ="+ nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") ="+ nombre.equals("Andres"));
        System.out.println("nombre.equals(\"Aaron\")"+ nombre.equals("Aaron"));
        System.out.println("nombre.equalsIgnoreCase(\"Andres\")"+ nombre.equalsIgnoreCase("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\")"+nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = "+ nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1)"+nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1, 4) =" + nombre.substring(1, 4));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(´a´) = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('t') = " + trabalenguas.lastIndexOf("t"));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith() = " + trabalenguas.endsWith("tr"));
        System.out.println("trabalenguas.endsWith() = " + trabalenguas);
        System.out.println("trabalenguas" .trim());

        char [] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas" + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a") ;
        int l =arreglo2.length;
        for(int j=0;j<l;j++){

            System.out.println(arreglo2[j]);

        }



        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;

        for (int j = 0; j<l; j++){
            System.out.println(arreglo2[j]);
            System.out.println("==========================");
            System.out.println(archivoArr[j]);
        }

    }
}
