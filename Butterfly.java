public class Butterfly {
    public static void main(String[] args) {

        int m=3;

//upper part
        for (int i=0; i<=m; i++){

            for(int j=0; j<=i;j++)
                System.out.print("*");

            int space=2*m-2*i ;
            for (int j=0; j<=space; j++)
                System.out.print(" ");

            for(int j=0; j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

//lower part

        for (int i=m; i>=0; i--){

            for(int j=0; j<=i;j++)
                System.out.print("*");
            
            int space=2*m-2*i ;
            for (int j=0; j<=space; j++)
                System.out.print(" ");

            for(int j=0; j<=i;j++)
                System.out.print("*");
            System.out.println();

        }

    }
}

