public class Inverted_Half_Pyramid_With_Numbers7 {
    public static void main(String[] args)
    {
        int m=5,n=0;

        for (int i=m ; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
