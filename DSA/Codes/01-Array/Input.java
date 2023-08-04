import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        array of primitives
//        int[] arr = new int[5];
////        arr[0] = 23;
////        arr[1] = 45;
////        arr[2] = 233;
////        arr[3] = 545;
////        arr[4] = 3;
//        for (int i=0; i<5; i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        array of objects

//        String[] str = new String[4];
//        for (int j = 0; j < str.length; j++) {
//            str[j] = in.next();
//        }
//
//        System.out.println(Arrays.toString(str));

        System.out.print("Enter the number of strings: ");
                int x = in.nextInt();
                System.out.print("Enter " + x + " strings");
                System.out.println(" ");
                String[] str = new String[x];
                for (int j = 0; j < str.length; j++) {
                System.out.print("Enter the string number " + (j+1) + ": ");
                str[j] = in.next();
                }

                System.out.println(Arrays.toString(str));

                str[1] = "raza";
        System.out.println(Arrays.toString(str));
        }
    }
