package Day4;

import java.util.Random;

public class Q2_2 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] num = new int[3];
        boolean f = false;


        for (int i = 0; i < 3; i++) {
            num[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;  //i--를 하는 이유는 같으면 다시 바꿔줘야하기 때문에!
                    break;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);
        }
    }
}

