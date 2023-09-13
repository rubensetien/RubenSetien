import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        String repetir;
        String[] nombres = new String[50];
        do {
            System.out.println("Dime nombre");
            nombres[n] = sc.nextLine();
            n++;
            System.out.println("¿Quieres poner algun nombre mas? (SI O NO)");

            repetir = sc.nextLine();

        } while (repetir.equalsIgnoreCase("SI"));

        double[][] notas = new double[n][3];

        for (int f = 0; f < n; f++) {
            System.out.println("Introduzca las notas para " + nombres[f]);
            for (int c = 0; c < 3; c++) {
                System.out.println("nota trimestre " + (c + 1));
                notas[f][c] = sc.nextDouble();

            }

        }
        double promedio = 0;
        for (int f = 0; f < n; f++) {
            System.out.println("Notas de: " + nombres[f]);
            promedio = 0;
            for (int c = 0; c < 3; c++) {
                System.out.println("nota trimestre " + (c + 1) + ": " + notas[f][c]);
                promedio += notas[f][c];

            }
            promedio/=3;
            System.out.println("nota final: " + promedio );
            if (promedio < 5) {
                System.out.print(" suspenso");
            } else if (promedio >= 5) {
                System.out.println(" aprobado");
            }
        }

        int mejor=0;
        double maximo=0;
        for (int f = 0; f < n; f++) {
             promedio = 0;
            for (int c = 0; c < 3; c++) {
                 promedio += notas[f][c];

            }
            promedio/=3;
          if(maximo<promedio){
              maximo=promedio;
              mejor=f;
          }
        }
        System.out.println("el mejor es: "+nombres[mejor] + " con una nota de "+ maximo);
    }
}