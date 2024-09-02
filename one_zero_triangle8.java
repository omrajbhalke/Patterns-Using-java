public class one_zero_triangle8 {
    public static void main(String[] args)
    {
        int m=5,n=1;
        int count=1;


        for (int i=1 ; i<=m; i++) {
            for (int j = 1; j <= i; j++) {

                if(count%2==0)
                    System.out.print(0);
                else
                    System.out.print(1);
                count++;
            }
            System.out.println();
        }
    }
}
