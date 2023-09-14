import java.util.Scanner;

public class Main {
    static int dimension = 3;
    static String mina= "*";
    static String agua="-";
    static int nMinas=0;
    public static void main(String[] args) {


        int tablero[][] = new int[dimension][dimension];
        String visible[][] = new String[dimension][dimension];
        int solucion[][] = new int[dimension][dimension];
        inicializarTablero(tablero,visible,solucion);

        minas(tablero, 3);

        ponerNumeros(tablero);

        mostrarTablero(tablero);
        mostrarVisible(visible);
        int valor=0;
        boolean iguales=true;
        do{
            valor=jugar(tablero,visible);
            iguales=comprobarFinal(tablero,solucion);
        }while(valor!=1 && !iguales);

    }

    public static void inicializarTablero(int tablero[][],String visible[][],int solucion[][]) {
        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                tablero[j][i] = 0;

            }
        }

        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                visible[j][i] = String.valueOf((char) 128);

            }
        }
        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                if (tablero[i][j] == 9) {
                    solucion[i][j] = 9;

                }
            }
        }
    }

    public static void mostrarTablero(int tablero[][]) {
        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                System.out.print(tablero[j][i]);

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void mostrarVisible(String visible[][]) {
        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                System.out.print(visible[j][i]);

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void minas(int tablero[][], int nMinas) {
        int n = 0;
        do {
            int minax = ((int) (Math.random() * 100) % dimension);
            int minay = ((int) (Math.random() * 100) % dimension);
            if (tablero[minax][minay] != 9) {
                tablero[minax][minay] = 9;
                n++;
            }
        } while (n < nMinas);

    }

    public static void ponerNumeros(int tablero[][]) {
        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                if (tablero[i][j] != 9) {
                    tablero[i][j] = calcularNumero(tablero, i, j);
                }

            }
            System.out.println();
        }
    }

    public static int calcularNumero(int tablero[][], int x, int y) {
        int contador = 0;

        for (int f = x - 1; f <= x + 1; f++) {
            for (int c = y - 1; c <= y + 1; c++) {
                if (c < 0 || f < 0 || c >= dimension || f >= dimension) {

                } else {
                    if (tablero[f][c] == 9) {
                        contador++;
                    }
                }
            }
        }


        return contador;


    }
    public static boolean comprobarFinal(int solucion[][], int tablero[][]) {
        boolean iguales=true;
        for (int j = 0; j < dimension; j = j + 1) {
            for (int i = 0; i < dimension; i = i + 1) {
                if (solucion[i][j]!=tablero[i][j]){
                    iguales = false;
                }
            }
        }
        return iguales;
    }
    public static int jugar(int tablero[][],String visible[][]) {

int valor=0;
        System.out.println("Introduce coordenada");
        Scanner sc = new Scanner(System.in);
        int fila = 0, columna = 0;
       //int  lugaresLibres= (dimension^2)-nMinas;
        do {
            System.out.println("fila?");
            fila = sc.nextInt();
        } while (fila < 0 || fila >= visible.length);
        do {
            System.out.println("columna?");
            columna = sc.nextInt();
        } while (columna < 0 || columna >= visible.length);

        switch (tablero[fila][columna]) {
            case 9:
                visible[fila][columna] = mina;
                valor =1;
                System.out.println("fin de juego");
                break;
            case 0:
                visible[fila][columna] = agua;

                break;
            default:
                visible[fila][columna] = String.valueOf(tablero[fila][columna]);

                break;
        }
        mostrarVisible(visible);
        return valor;

    }
    }
