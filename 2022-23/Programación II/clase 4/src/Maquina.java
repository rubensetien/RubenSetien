import java.util.Arrays;

public class Maquina {
private Producto[] lista;

private double total=0;


    public Maquina() {
        this.lista = new Producto[5];
        this.lista [0]=new Producto("COCA-COLA",5,1.50,0);
        this.lista [1]=new Producto("DONUT",3,1,1);
        this.lista [2]=new Producto("KIT KAT",4,0.90,2);
        this.lista [3]=new Producto("CHOCO BONS",4,1.25,3);
        this.lista [4]=new Producto("NESTEA",7,1.50,4);
    }

    public Producto[] getLista() {
        return lista;
    }

    public void setLista(Producto[] lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
    public void estado(){
        for (int i = 0; i < lista.length; i++) {
            Producto aux=this.lista[i];

            if (aux.getStock()>0){
                System.out.println(aux.getId()+" = " +aux.getDescripcion() +" vale "+ aux.getPrecio()+ "€ //Quedan: "+ aux.getStock());
            }
        }

    }
    public void venderProducto(int id){
        for (int i = 0; i < lista.length ; i++) {
            if (this.lista[i].getId()==id){
                int antiguo=this.lista[i].getStock();
                this.lista[i].setStock(antiguo-1);
                total+=this.lista[i].getPrecio();
            }
        }
    }


}
