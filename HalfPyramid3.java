public class HalfPyramid3 {
    public static void main(String[] args)
    {
        int m=3,n=0;

        for (int i=0 ; i<=m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
