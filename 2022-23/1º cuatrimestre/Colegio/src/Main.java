import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "";
        System.out.println("introduzca nombre del alumno");
        nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
        String asignatura;
        String ingles;
        String mates;
        do {
            System.out.println("Dime una asignatura. (mates o ingles)");
            asignatura = sc.next();

        } while (!asignatura.equalsIgnoreCase("ingles") && !asignatura.equalsIgnoreCase("mates"));


        double nota = 0;
        do {
            System.out.println("dime tu nota del examen");
            nota = sc.nextDouble();
        } while (nota > 10 || nota < 0);


        System.out.println(nombre + "ha sacado " + nota);


        int edad;
        do {
            System.out.println("dime tu edad");
            edad = sc.nextInt();
        } while (edad < 6 || edad > 15);
        System.out.println(nombre + " tiene " + edad + " años");
    }
}