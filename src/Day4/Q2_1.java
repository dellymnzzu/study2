package Day4;

import java.util.Random;

public class Q2_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num[] = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;

                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }


}
