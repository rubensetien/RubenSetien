import java.awt.geom.NoninvertibleTransformException;
import java.util.Scanner;

public class RetoAlfredo2 {
    public static void main(String[] args) {
        String oracion, temporal = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una oración");

        oracion = sc.nextLine();


        // System.out.println(WordUtils.capitalizeFully(oracion));
        System.out.println(oracion.toUpperCase());
        System.out.println(oracion.toLowerCase());


        for (int i = 0; i < oracion.length(); i++) {
            char letra = oracion.charAt(i);
            int ascii = (int) letra;
            if (ascii >= 65 && ascii <= 90) {

                ascii += 32;
            } else if (ascii >= 97 && ascii <= 122) {

                ascii -= 32;
            }
            temporal += (char) ascii;

        }
        System.out.println(temporal);
        temporal = "";
        for (int i = 0; i < oracion.length(); i++) {
            char letra = oracion.charAt(i);
            if (i % 2 == 0) {
                letra = Character.toUpperCase(letra);
            } else {
                letra = Character.toLowerCase(letra);
            }
            temporal += letra;
        }
        System.out.println(temporal);
        temporal = "";
        for (int i = oracion.length()-1; i>=0; i--) {
            System.out.print(oracion.charAt(i));

        }
        System.out.println();

    }



}