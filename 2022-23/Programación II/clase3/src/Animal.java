abstract public class Animal {

    private int numeroDePatas;
    private String nombre;


    public Animal(int numeroDePatas, String nombre) {
        this.numeroDePatas = numeroDePatas;
        this.nombre = nombre;
    }

    abstract public void habla();

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numeroDePatas=" + numeroDePatas +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}

