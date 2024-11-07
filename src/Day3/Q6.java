package Day3;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(26) + 65;

            System.out.print((char) num);


        }

    }
}
