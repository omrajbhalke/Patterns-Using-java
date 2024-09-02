public class Palindrome_number_Pyramid {
    public static void main(String[] args)
        {
            int m=4; //side is 4x4

            for (int i=1 ; i<=m; i++) {

                for (int j = 0; j < m-i; j++) {
                    System.out.print(" ");
                }

                for (int k=i; k>=1; k--)
                    System.out.print(k);
                for (int k=2; k<=i; k++)
                    System.out.print(k);

//                createPalindrome(i);

                System.out.println();
            }
        }

//        public static int createPalindrome(int a)
//            {
//                int i=a;
//
//                while(i==1){
//                    System.out.print(1);
//                    return 0;
//                }
//
//                while(i>1)
//                {
//                    System.out.print(i);
//                    i--;
//                }
//
//                while(i<=a )
//                {
//                    System.out.print(i);
//                    i++;
//                }
//
//                return 0;
//
//            }
}
