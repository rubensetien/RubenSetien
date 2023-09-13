public class Main {
    public static void main(String[] args) {
        final int inicio=1;
        final int fin=20;

        for (int i = inicio; i <= fin; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        int i=inicio;

        while(i<=fin ){
            System.out.print(i+" ");
            i++;

        }
        System.out.println();
        i=inicio;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=fin);

        System.out.println();

        i=inicio;


        for (i = inicio; i <= fin;i++) {
            if(i%2==0){
                System.out.print(i+" ");

            }




            }

        System.out.println();
         i=inicio;
        while(i<=fin){

            if(i%2==0){
                System.out.print(i+" ");

            }
            i++;
        }
        System.out.println();
        i=inicio;
        do{
           if(i%2==0){
               System.out.print(i+" ");
           }
            i++;
        }while (i<=fin);
    }

}