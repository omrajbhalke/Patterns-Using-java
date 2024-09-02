public class Floyds_triangle8 {
    public static void main(String[] args)
    {
        int m=5,n=1;


        for (int i=1 ; i<=m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n++ +" ");
            }
            System.out.println();
        }
    }
}
