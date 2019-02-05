import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

       String [] array = {"w", "t","y", "h","k"};

        for (int x = 0; x < array.length; x++) {

             array[x]= array[x].replace("t","hello");

            System.out.println(array[x]);

        }

    }
}

