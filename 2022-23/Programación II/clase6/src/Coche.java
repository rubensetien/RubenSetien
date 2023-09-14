import java.util.Scanner;

public class Coche {
    private int nPuertas;
    private String color;
    public Coche(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de puertas del coche:");
        nPuertas=sc.nextInt();
        System.out.println("Color del coche:");
        color=sc.nextLine();
    }

    public Coche(int nPuertas, String color) {
        this.nPuertas = nPuertas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nPuertas=" + nPuertas +
                ", color='" + color + '\'' +
                '}';
    }
}
