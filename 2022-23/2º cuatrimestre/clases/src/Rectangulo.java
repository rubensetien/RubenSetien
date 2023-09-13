public class Rectangulo {
    private double base;
    private double altura;
    //constructores


    public Rectangulo() {
        this.altura=1;
        this.base=2;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double altura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
