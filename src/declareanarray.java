import java.util.Scanner;

class ArrayExample {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int counter =0;
        int index=0;


      int[] num = new int[10];
      //  int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        num[5]=6;
        num[6]=7;
        num[7]=8;
        num[8]=9;
        num[9]=10;

        for (int x = num.length; x>=1; x--) {
            System.out.println(x);
        }

//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//        System.out.println(num[5]);
//        System.out.println(num[6]);
//        System.out.println(num[7]);
//        System.out.println(num[8]);
//        System.out.println(num[9]);
//        System.out.println(num[10]);


    }
}