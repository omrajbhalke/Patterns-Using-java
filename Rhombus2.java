public class Rhombus2 {
    public static void main(String[] args)
    {
        int m=3; //side is 4x4

//upper part
        for (int i=0 ; i<=m; i++) {
            for (int j = 0; j < m-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//lower part
        for (int i=m ; i>=0; i--) {
            for (int j = 0; j < m-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
