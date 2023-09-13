import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int agujero = 0;
        int turno = 0;

        int recorrido=0;
        int posicionFinal = 64, posicionInicial = 0;
        final String Caracol = ";--;'";
        int dado=0;
        Scanner sc = new Scanner(System.in);

        double probabilidad;

        do {
            do {
                System.out.println("Elija un agujero:");
                agujero = sc.nextInt();
            } while (agujero < 1 || agujero > 4);

            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.print("[J]|");

            probabilidad = Math.random() * 100;

            if (agujero == 1) {
                if (probabilidad < 60) {
                    dado = 1;
                } else {
                    dado = 0;
                }
            }
                if (agujero == 2) {
                    if (probabilidad < 40) {
                        dado = 2;
                    } else {
                        dado = 0;
                    }
                }
                    if (agujero == 3) {
                        if (probabilidad < 30) {
                            dado = 4;
                        } else {
                            dado = 0;
                        }
                    }
                        if (agujero == 4) {
                            if (probabilidad < 10) {
                                dado = 6;
                            } else {
                                dado = 0;
                            }
                        }
                        recorrido=recorrido+dado;
                            turno++;
                            for (int i=0;i<recorrido;i++){
                                System.out.print(" ");
                            }
            System.out.println(Caracol);
                            System.out.println();


                            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

                        }
        while (turno <= 50 && recorrido<=60) ;
                    }
                }

