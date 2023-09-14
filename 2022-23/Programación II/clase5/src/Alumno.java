import java.util.Arrays;
import java.util.Scanner;

public class Alumno extends Persona{

    private int []notas;


    public Alumno(int nNotas) {
        this.notas=new int[nNotas];

        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <nNotas ; i++) {
            System.out.println("Escriba sus nota "+(i+1));
            this.notas[i]=sc.nextInt();
        }

    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
public void  mostrar(){

        super.toString();
    System.out.println("La nota media es: "+ media());
}

    private float media (){
        int sumaNotas=0;
        for (int i = 0; i <notas.length ; i++) {

            sumaNotas= sumaNotas+notas[i];
        }
        return sumaNotas/notas.length;

    }
}
