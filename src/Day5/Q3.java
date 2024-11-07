package Day5;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int max = arr[0];

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(11);
            System.out.print(arr[i]);

        }
        System.out.println();
        // 선생님이 한 코드
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        //내가 한 코드
//        for (int i = 0; i < 10; i++) {
//            for (int j = i + 1; j < 10; j++) {
//                if (arr[i] > arr[j]) {
//                    max = arr[i];
//                }
//
//            }
//
//        }

        System.out.println(max);
        for (int i = 0; i < 10; i++) {
            if (arr[i] == max) {
                System.out.print("인덱스 값 " + i);
            }


        }


    }
}
