public class Inverted_and_Rotated_Half_Pyramid5 {
    public static void main(String[] args){

        int m=4,n=0;

        for (int i=0 ; i<=m; i++) {
            for (int j = 0; j <=m; j++) {

                if(j<m-i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
