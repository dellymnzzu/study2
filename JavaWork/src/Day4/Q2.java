package Day4;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(9) + 1;
        int num1 = r.nextInt(9) + 1;
        int num2 = r.nextInt(9) + 1;


        if (num == num1 || num1 == num2 || num == num2) {
            while (true) {
                if (num == num1) {
                    num = r.nextInt(9) + 1;
                } else if (num == num2) {
                    num = r.nextInt(9) + 1;

                } else if (num1 == num2) {
                    num2 = r.nextInt(9) + 1;
                } else {
                    break;
                }
            }

        }
        System.out.println(num1);
        System.out.println(num);
        System.out.println(num2);
    }


}

