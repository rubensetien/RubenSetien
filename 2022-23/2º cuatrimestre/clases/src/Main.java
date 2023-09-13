import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Circulo c1= new Circulo();
       Circulo c2= new Circulo(8);
        System.out.println("el perimetro de c1 DE RADIO "+c1.getRadio()+" es: "+c1.perimetro());
        System.out.println("el Area de c1 es: "+c1.area());
        System.out.println("el perimetro de c2 es: "+c2.perimetro());
        System.out.println("el Area de c2 es: "+c2.area());
        c2=new Circulo(7);
        System.out.println("el perimetro de c2 es: "+c2.perimetro());
        System.out.println("el Area de c2 es: "+c2.area());
        Rectangulo r1= new Rectangulo();
        Rectangulo r2= new Rectangulo(3,4);
        System.out.println("el perimetro de r1 es: "+r1.perimetro());
        System.out.println("el Area de r1 es: "+r1.area());
        System.out.println("el perimetro de r2 es: "+r2.perimetro());
        System.out.println("el Area de r2 es: "+r2.area());
    }
}