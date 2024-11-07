package Day5;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        int R = 0;  //행
        int C = -1; // 열
        int K = num; //반복횟수
        int sw = 1; // 증가 감소를 위한 스위치
        int N = 1; // 1부터 증가해서 배열에 채워지는 값
        while (true) {
            //열
            for (int i = 0; i < K; i++) {
                C = C + sw; // 0 1 2 3 4
                arr[R][C] = N++;
            }
            K--;
            if (K == 0) {
                break;
            }
            // 행

            for (int i = 0; i < K; i++) {
                R = R + sw;
                arr[R][C] = N++;
            }
            sw *= -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
    }
}

