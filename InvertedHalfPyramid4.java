public class InvertedHalfPyramid4 {
    public static void main(String[] args)
    {
        int m=3,n=0;

        for (int i=m ; i>=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
