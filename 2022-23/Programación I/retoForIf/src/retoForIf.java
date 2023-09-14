public class retoForIf {
    public static void main(String[] args) {
        int Horizontal;
        Horizontal = 5;
        int Vertical;
        Vertical = 3;
        int dimension=5;
        int contador=5;
        for(int i=0;i<3;i++){

                for(int j=contador;j>=1;j=j-2){
                    System.out.print("*");
                }
                contador=contador-2;
                System.out.println();
            }
        contador=1;
        for(int i=1;i<3;i++){

            for(int j=0;j<=contador;j++){
                System.out.print("*");
            }
            contador=contador+2;
            System.out.println();
        }









        for (int j = 1; j <= Horizontal; j = j + 1) {
            for (int i = 1; i <= Vertical; i = i +1) {

                if (i==-3 && j==1)
                {
                    System.out.print("(x)");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (i==j) {
                    System.out.print("(x)");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}