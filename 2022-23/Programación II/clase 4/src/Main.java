import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Maquina expendedora = new Maquina();
       expendedora.estado();
       expendedora.venderProducto(1);
        System.out.println();
       expendedora.estado();
        expendedora.venderProducto(1);
        System.out.println();
        expendedora.estado();
        expendedora.venderProducto(1);
        System.out.println();
        expendedora.estado();
        expendedora.venderProducto(1);
        System.out.println();
    }
    public int menu(Maquina m){
        Scanner sc= new Scanner(System.in);
        m.estado();
        System.out.println("Escoja opción: ");
        int opcion=0;
        opcion=sc.nextInt();
    }
}