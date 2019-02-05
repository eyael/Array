import java.util.Scanner;


public class loopArray {


    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int index=0;

        int[] array = {2, 5, 9, 0, 2, 1, 8, 5, 4};

        for (int x = 0; x < array.length; x++) {

//            System.out.println(x);
            if (array[x] == 5){
                System.out.println(x);

            }

        }

    }
}