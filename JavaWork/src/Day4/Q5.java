package Day4;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] com = new int[5];

        for (int i = 0; i < 5; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
        // 배열 출력
        for (int i = 0; i < com.length; i++) {
            System.out.print(com[i] + " ");
        }
        System.out.println();

        // 배열 정렬
        for (int i = 0; i < com.length; i++) {
            for (int j = 0; j < com.length - 1 - i; j++) {
                if (com[j] > com[j + 1]) {
                    int temp = com[j];
                    com[j] = com[j + 1];
                    com[j + 1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        for (int i = 0; i < com.length; i++) {
            System.out.print(com[i] + " ");
        }
    }
}