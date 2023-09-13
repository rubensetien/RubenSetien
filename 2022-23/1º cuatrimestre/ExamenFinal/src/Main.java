import java.util.Scanner;

public class Main {

    static final int FILA = 0;
    static final int COLUMNA = 1;

    static final int ARRIBA = 1;
    static final int ABAJO = 2;
    static final int IZQUIERDA = 3;
    static final int DERECHA = 4;
    static final int SKIN = 0;


    static final int[][] MOVIMIENTOS = {
            {0, 0},
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };


    static int puntos = 0;
    static int contadorV = 0;

    static int invulnerabilidad = 0;

    public static void main(String[] args) {


        int[][] elMapa = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 3, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        int[] elPersonaje = {7, 10};
        int[][] fantasma = {{5, 10}};

        do {
            imprimeMundo(elMapa, elPersonaje, fantasma);

            definePosicion(elPersonaje, elMapa);
        } while ((comprobar(elPersonaje, fantasma) != 1) && contador(elMapa) != 0);
    }


    private static void definePosicion(int[] elPersonaje, int[][] elMapa) {


        switch (capturaMovimiento()) {
            case ARRIBA:
                mueve(elPersonaje, ARRIBA, elMapa);
                break;
            case ABAJO:
                mueve(elPersonaje, ABAJO, elMapa);
                break;
            case IZQUIERDA:
                mueve(elPersonaje, IZQUIERDA, elMapa);
                break;
            case DERECHA:
                mueve(elPersonaje, DERECHA, elMapa);
                break;
            case SKIN:
                contadorV++;
                break;


        }
    }

    static int contadorSkin() {
        int contador = 0;
        do {
            contador++;

        } while (contador > 3);
        return 0;
    }

    private static int capturaMovimiento() {

        switch (preguntaChar()) {
            case 's', 'S', '8':
                return ABAJO;
            case 'w', 'W', '2':
                return ARRIBA;
            case 'a', 'A', '4':
                return IZQUIERDA;
            case 'd', 'D', '6':
                return DERECHA;
            case 'v', 'V':
                return SKIN;
        }
        return 0;
    }

    static void imprimeMundo(int[][] unMapa, int[] unPersonaje, int[][] fantasma) {

        for (int fila = 0; fila < unMapa.length; fila++) {
            for (int columna = 0; columna < unMapa[fila].length; columna++) {
                if (fila == unPersonaje[FILA] && columna == unPersonaje[COLUMNA]) {
                    imprimePersonaje();


                } else if (existeFantasma(fila, columna, fantasma)) {
                    imprimeFantasma();
                } else {
                    imprimeTerreno(contadorV, unMapa[fila][columna]);
                }


            }
            System.out.println();

        }
        System.out.println("Puntuacion: " + puntos + " //Skin: "+ contadorV+" //invulnerabilidad: "+invulnerabilidad);
    }

    static void imprimeTerreno(int contadorV, int unTile) {
        if (contadorV % 3 == 0) {
            String[] terreno = {".", "#", " ", "X"};
            System.out.print(terreno[unTile]);

        } else if (contadorV % 3 == 1) {
            String[] terreno = {"()", "##", "  ", "><"};
            System.out.print(terreno[unTile]);

        } else if (contadorV % 3 == 2) {
            String[] terreno = {"( )", "###", "   ", " X "};
            System.out.print(terreno[unTile]);
        }
    }

    static void imprimePersonaje() {

        System.out.print("P");
    }

    static void imprimeFantasma() {
        System.out.print("F");
    }

    static void mueve(int[] elPersonaje, int movimiento, int[][] elMapa) {

        int nuevaFila = elPersonaje[FILA] + MOVIMIENTOS[movimiento][FILA];
        int nuevaColumna = elPersonaje[COLUMNA] + MOVIMIENTOS[movimiento][COLUMNA];

        if (elMapa[elPersonaje[FILA]][elPersonaje[COLUMNA]] == 0) {
            puntos += 3;
            elMapa[elPersonaje[FILA]][elPersonaje[COLUMNA]] = 2;
        }
        if (elMapa[elPersonaje[FILA]][elPersonaje[COLUMNA]] == 3) {

            invulnerabilidad += 16;

        }else {
            if (invulnerabilidad > 0) {
                invulnerabilidad--;
            }
        }


        elPersonaje[FILA] = nuevaFila;
        elPersonaje[COLUMNA] = nuevaColumna;
        if (elPersonaje[FILA] == 12) {
            elPersonaje[FILA] = 0;
        }
        if (elPersonaje[COLUMNA] == 21) {
            elPersonaje[COLUMNA] = 0;
        }
        if (elPersonaje[FILA] == 0) {
            elPersonaje[FILA] = 12;
        }
        if (elPersonaje[COLUMNA] == 0) {
            elPersonaje[COLUMNA] = 21;
        }

    }


    static char preguntaChar() {

        Scanner entrada = new Scanner(System.in);
        return entrada.next().charAt(0);
    }


    static int comprobar(int elPersonaje[], int fantasma[][]) {
        if (existeFantasma(elPersonaje[FILA], elPersonaje[COLUMNA], fantasma)) {
            if (invulnerabilidad == 0) {
                System.out.print("GAME OVER");
                return 1;
            } else return 0;
        }
        return 0;
    }

    static int contador(int elMapa[][]) {
        int puntitos = 0;
        for (int i = 0; i < elMapa.length; i++) {
            for (int j = 0; j < elMapa.length; j++) {
                if (elMapa[i][j] == 1) {
                    puntitos++;
                }

            }

        }
        return puntitos;
    }


    static boolean existeFantasma(int f, int c, int[][] fantasma) {
        for (int i = 0; i < fantasma.length; i++) {


            if (f == fantasma[i][FILA] && c == fantasma[i][COLUMNA]) {

                return true;

            }

        }
        return false;

    }
}