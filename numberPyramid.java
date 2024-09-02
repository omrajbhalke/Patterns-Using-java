public class numberPyramid {
    public static void main(String[] args)
    {
        int m=4; //side is 4x4
        int count=1;


        for (int i=0 ; i<=m; i++) {
            for (int j = 0; j < m-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(count+" ");
            }
            count++;

            System.out.println();
        }
    }
}
