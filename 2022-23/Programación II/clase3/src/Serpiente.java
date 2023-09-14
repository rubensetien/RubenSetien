public class Serpiente extends Animal{
    private String raza;
    private char sexo;
    private double longitud;
    private boolean veneno;
    private int numeroDeColores;

    public Serpiente(int numeroDePatas, String nombre, String raza, char sexo, double longitud, boolean veneno, int numeroDeColores) {
        super(numeroDePatas, nombre);
        this.raza = raza;
        this.sexo = sexo;
        this.longitud = longitud;
        this.veneno = veneno;
        this.numeroDeColores = numeroDeColores;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    public int getNumeroDeColores() {
        return numeroDeColores;
    }

    public void setNumeroDeColores(int numeroDeColores) {
        this.numeroDeColores = numeroDeColores;
    }

    @Override
    public String toString() {
        return super.toString()+"Serpiente{" +
                "raza='" + raza + '\'' +
                ", sexo=" + sexo +
                ", longitud=" + longitud +
                ", veneno=" + veneno +
                ", numeroDeColores=" + numeroDeColores +
                '}';
    }

    @Override
    public void habla() {
        System.out.println("SHHHHH");
    }
}
