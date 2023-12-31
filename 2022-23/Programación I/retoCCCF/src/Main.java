import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int caja1 = 0, nItems1 = 0;
        boolean libre1 = true, libre2 = true, libre3 = true, libre4 = true;
        int caja2 = 0, nItems2 = 0;
        int caja3 = 0, nItems3 = 0;
        int caja4 = 0, nItems4 = 0;
        int cola = 0;
        final int minutosEnUnDia = 12 * 60;
        int numeroDeClientes = 0;
        boolean llegaNuevo = false;
        int minutosSinCola = 0;
        int totalItems = 0;
        int caja5 = 0, nItems5 = 0;
        boolean libre5 = true, activa = false;

        for (int tiempo = 1; tiempo < minutosEnUnDia; tiempo++) {

            if (Math.random() * 100 < 40) { //Probabilidad de la entrada de clientes
                //int probabilidadpersona = ((int) (Math.random() * 100)) % 4;  //0,1,2,3
                //System.out.println(probabilidadpersona);
                llegaNuevo = true;
                cola++; //todo el que entra va a la cola
                if (libre1) {
                    caja1++;
                    libre1 = false; //caja ocupada
                    nItems1 = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems1;

                    cola--;

                } else if (libre2) {
                    caja2++;
                    libre2 = false; //caja ocupada
                    nItems2 = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems2;
                    cola--;

                } else if (libre3) {
                    caja3++;
                    libre3 = false; //caja ocupada
                    nItems3 = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems3;
                    cola--;

                } else if (libre4) {
                    caja4++;
                    libre4 = false; //caja ocupada
                    nItems4 = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems4;
                    cola--;
                } else if (libre5 && activa) {
                    caja5++;
                    libre5 = false; //caja ocupada
                    nItems5 = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems5;
                    cola--;

                }

            }

            if (nItems1 > 0) {
                nItems1--;
                if (nItems1 == 0) {
                    libre1 = true;
                }
            }
            if (nItems2 > 0) {
                nItems2--;
            }
            if (nItems2 == 0) {

                libre2 = true;
            }
            if (nItems3 > 0) {
                nItems3--;
            }
            if (nItems3 == 0) {

                libre3 = true;
            }
            if (nItems4 > 0) {
                nItems4--;
            }
            if (nItems4 == 0) {
                libre4 = true;
            }
            if (nItems5 > 0) {
                nItems5--;
                if (nItems5 == 0) {
                    libre5 = true;
                }
            }
            if (cola == 0) {
                minutosSinCola++;
            }
         /*   MINUTO 1 - Llega 1 persona - En Cola: 0
            Caja1:[13] | Caja2:[0] | Caja3:[0] | Caja4:[0]*/
            System.out.println("--------------------------------------------------------------");
            System.out.print("MINUTO " + tiempo);
            if (llegaNuevo) {
                System.out.println(" - LLega 1 persona - En cola: " + cola);
                llegaNuevo = false;
            } else {
                System.out.println(" - LLega 0 persona - En cola: " + cola);
            }
            System.out.print(" Caja1:[" + nItems1 + "] | Caja2:[" + nItems2 + "] | Caja3:[" + nItems3 + "] | Caja4:[" + nItems4 + "]");
            if (nItems5 > 0 || activa) {
                System.out.println(" Caja5:[" + nItems5 + "] ");
            } else {
                System.out.println();
            }

            if (cola >= 15) {
                activa = true;
            } else {
                activa = false;
            }
        }


        System.out.println("clintes totales que pasan por la caja 1" + caja1);
        System.out.println("clintes totales que pasan por la caja 2" + caja2);
        System.out.println("clintes totales que pasan por la caja 3" + caja3);
        System.out.println("clintes totales que pasan por la caja 4" + caja4);
        System.out.println("Personas que han pasado por la tienda " + (caja1 + caja2 + caja3 + caja4));
        System.out.println("Hoy se han vendido " + totalItems + " de productos");
        System.out.println("La cola ha estado vacia durante " + minutosSinCola + " minutos");
    }
}