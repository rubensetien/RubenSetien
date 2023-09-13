import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caballos = 0;
        int meta = 100;
        String figura = "#";
        int contador = 0;

        System.out.println("Cuantos caballos va haber: ");
        caballos = sc.nextInt();

        // System.out.println(espacioRecorrido(zancada()));

        int[] recorrido = new int[caballos]; // defino la tabla dependiendo del numero de elementos que me hace la pregunta, si no iria un{0,0} (como ejemplo)
        boolean [] llegada = new  boolean[caballos];
        int[] podium = new int[caballos];
        for (int i = 0; i < caballos; i++) {
            recorrido[i] = 0;
llegada[i]=false;

        }
        do {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for (int i = 0; i < caballos; i++) {
                if (llegada[i]==false) {
                    recorrido[i] = recorrido[i] + zancada();
                }

                System.out.println(espacioRecorrido(recorrido[i]));
                if (llegada[i] == false && recorrido[i]>=meta) {
                    podium[contador]=i+1;
                    llegada[i]=true;
                    contador++;
                }

            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } while (contador < caballos );
        for (int i = 0; i < podium.length; i++) {
            System.out.print(podium[i]+" ");
        }

    }

    public static int zancada() {

        return ((int) (Math.random() * 100 % 6)) + 1;
    }

    public static String espacioRecorrido(int espacios) {
        String texto = "";
        for (int i = 0; i < espacios; i++) {
            texto += " ";
        }
        return texto + "#";
    }
}