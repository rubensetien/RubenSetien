public class retoForIf1 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
       // int [][] casilla= new int[2][2];
        //casilla= new int[][]{{0, 0,0, 0,0, 0},
               // {0, 1}};
        for (int j = 1; j <= dimension; j = j+ 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                        i-10 ==j || i==j || j-10==i



                ){
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }

            }
            System.out.println();
        }
    }
}