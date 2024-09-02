public class Rhombus {
    public static void main(String[] args)
    {
        int m=3; //side is 4x4


        for (int i=0 ; i<=m; i++) {
            for (int j = 0; j < m-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= m; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
