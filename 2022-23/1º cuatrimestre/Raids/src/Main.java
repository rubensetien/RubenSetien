import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPares = 0, nImpares = 0;

        int[] n = new int[5];

            for (int i = 0; i < n.length; i++) {
                System.out.println("Introduzca un número:");
                n[i] = sc.nextInt();

            }


            for (int i = 0; i < n.length; i++) {
                if (n[i] % 2 == 0) {
                    nPares++;

                } else {
                    nImpares++;
                }


            }
int suma=0;
        for (int i = 0; i < n.length; i++) {

            suma += n[i];

        }
        for (int i = n.length-1; i >=0; i--) {
            System.out.print(n[i]);
            }




        System.out.println("Números pares: " + nPares);
        System.out.println("Números impares: " + nImpares);
        System.out.println("promedio: "+suma/n.length);
    }


}