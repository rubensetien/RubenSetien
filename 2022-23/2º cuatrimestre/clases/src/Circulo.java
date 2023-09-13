public class Circulo {
    //atributos
    private double radio;


    //costructores
    public Circulo(){
        this.radio=1;
    }

    public Circulo(double r){
        this.radio=r;

    }

    //Metodos
    public double area(){
        return radio*radio*Math.PI;

    }

    public double perimetro(){
        return 2*radio*Math.PI;
    }
    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio=radio;
    }
}
