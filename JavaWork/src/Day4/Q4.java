package Day4;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);

        }
    }


}

