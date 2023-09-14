public class Gato extends Animal{
    private String raza;
    private char sexo;
    private int numeroColores;
    private boolean castrado;


    public Gato(int numeroDePatas, String nombre, String raza, char sexo, int numeroColores, boolean castrado) {
        super(numeroDePatas, nombre);
        this.raza = raza;
        this.sexo = sexo;
        this.numeroColores = numeroColores;
        this.castrado = castrado;

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

    public int getNumeroColores() {
        return numeroColores;
    }

    public void setNumeroColores(int numeroColores) {
        this.numeroColores = numeroColores;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }





    @Override
    public String toString() {
        return super.toString()+ " Gatos{" +
                "raza='" + raza + '\'' +
                ", sexo=" + sexo +
                ", numeroColores=" + numeroColores +
                ", castrado=" + castrado +
                '}';
    }

    @Override
    public void habla() {
        System.out.println("MIAUUU");
    }
}
