public class Main {
    public static void main(String[] args) {
        int[] numeros=new int[50];
        Producto [] tienda= new Producto[2];
        tienda[0]= new Producto("m0098","Monitor LG 27.5 ''",250,5);
        tienda[1]= new Producto("m115j","Monitor Samsung 4k",350, 10);

        tienda[0].setStock(tienda[0].getStock()-1);
        for (int i = 0; i < tienda.length ; i++) {

           tienda[i].setPrecio(tienda[i].getPrecio()+tienda[i].getPrecio()*(Math.random()*100%100)*0.20);

            System.out.println(tienda[i].toString());
        }
    }
}