import java.util.Scanner;

public class Persona {



    private int dni;
    private String nombre;
    private String direccion;

    public Persona() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Deme su Dni: ");
        dni= sc.nextInt();
        sc= new Scanner(System.in);
        System.out.println("Escriba su numbre: ");
        nombre=sc.nextLine();
        System.out.println("Escriba su dirección: ");
        direccion=sc.nextLine();

    }

    public Persona(int dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

}
