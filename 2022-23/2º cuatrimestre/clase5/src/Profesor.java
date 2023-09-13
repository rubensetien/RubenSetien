import java.util.Arrays;
import java.util.Scanner;

public class Profesor extends Persona{
    private String[] asignaturas;

    public Profesor(int nAsignaturas) {

        this.asignaturas=new String[nAsignaturas];

        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <nAsignaturas ; i++) {
            System.out.println("Escriba sus nota "+(i+1));
            sc= new Scanner(System.in);
            this.asignaturas[i]=sc.nextLine();

        }

    }


    public String[] getAsignaturas() {
        return asignaturas;
    }

public void mostrar(){

       super.toString();
    System.out.println(asignaturas);
}

}
