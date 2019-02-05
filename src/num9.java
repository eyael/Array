import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int[] arr1 = {1, 7,6, 5,9};
        int[] arr2 = {2,7,6,3,4};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }







        }

    }
}