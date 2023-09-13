public class Main {
    public static void main(String[] args) {
Gato g1=new Gato(4,"Michi","Persa",'H',2,true);
        System.out.println(g1.toString());
        Perro p1=new Perro(4,"Fermín","Pastor Aleman",'H',false);
        System.out.println(p1.toString());
        Serpiente s1=new Serpiente(0,"Mike","Cascabel",'F',2.15,true,2);
        System.out.println(s1.toString());
    }
}