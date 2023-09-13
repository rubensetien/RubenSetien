import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contadorN = 0;
        int contadorE = 0;
        int[] numeros = {0, 0, 0, 0, 0};
        int[] estrellas = {0, 0};

        do {


            int numero = aleatorioNumero();
            if (!existe(numero, numeros)) {
                numeros[contadorN] = numero;
                contadorN++;
            }
            //System.out.print(numero+" ");


        } while (contadorN < 5);

        do {


            int estrella = aleatorioEstrella();
            if (!existe(estrella, estrellas)) {
                estrellas[contadorE] = estrella;
                contadorE++;
            }

            // System.out.println(estrella);

        } while (contadorE < 2);
ordenarTabla(numeros);
ordenarTabla(estrellas);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("**");
        for (int i = 0; i < estrellas.length; i++) {
            System.out.println(estrellas[i]);
        }
    }

    public static int aleatorioNumero() {

        return ((int) (Math.random() * 50)) + 1;
    }

    public static int aleatorioEstrella() {

        return ((int) (Math.random() * 12)) + 1;
    }


    public static boolean existe(int n, int[] tabla) {
        boolean resultado = false;
        for (int i = 0; i < tabla.length; i++) {
            if (n == tabla[i]) {
                resultado = true;
            }
        }
        return resultado;
    }

    public static  void ordenarTabla(int[] tabla) {
        for (int j = 0; j < tabla.length - 1; j++) {


            for (int i = 0; i < tabla.length - 1; i++) {
                if (tabla[i] > tabla[i + 1]) {
                    int aux = tabla[i];
                    tabla[i] = tabla[i + 1];
                    tabla[i + 1] = aux;
                }
            }
        }
    }
}