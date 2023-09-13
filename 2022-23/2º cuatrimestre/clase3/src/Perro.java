public class Perro extends Animal{
   private String raza;
   private char sexo;
   private boolean chip;

    public Perro(int numeroDePatas, String nombre, String raza, char sexo, boolean chip) {
        super(numeroDePatas, nombre);
        this.raza = raza;
        this.sexo = sexo;
        this.chip = chip;
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

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    @Override
    public String toString() {
        return super.toString()+" Perro{" +
                "raza='" + raza + '\'' +
                ", sexo=" + sexo +
                ", chip=" + chip +
                '}';
    }

    @Override
    public void habla() {
        System.out.println("GUAU");
    }
}
