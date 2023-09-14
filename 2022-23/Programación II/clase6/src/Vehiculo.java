import java.util.Scanner;

public class Vehiculo {
private  int matricula;
private int añoMatricula;
private int cilindrda;

    public Vehiculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matricula del Vehículo:");
        matricula=sc.nextInt();
        System.out.println("Año de matriculación:");
        añoMatricula=sc.nextInt();
        System.out.println("Cilindrada del vehículo;");
        cilindrda=sc.nextInt();
    }

    public Vehiculo(int matricula, int añoMatricula, int cilindrda) {
        this.matricula = matricula;
        this.añoMatricula = añoMatricula;
        this.cilindrda = cilindrda;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula=" + matricula +
                ", añoMatricula=" + añoMatricula +
                ", cilindrda=" + cilindrda +
                '}';
    }
}
