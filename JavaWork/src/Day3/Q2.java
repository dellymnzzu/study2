package Day3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;  // 초기값 설정

        while (num != 3) {  // num이 3이 아니면 반복
            System.out.println("1, 2, 3 중에 입력하세요.");
            num = sc.nextInt();  // 입력값 받기

            if (num < 1 || num > 3) {  // 1, 2, 3 이외의 숫자를 입력한 경우
                System.out.println("1~3 이외의 숫자를 입력했습니다. 잘못된 입력입니다.");
            } else if (num == 1) {  // 특정 단만 출력
                System.out.println("원하는 숫자를 입력하세요. (2~9)");
                int subNum = sc.nextInt();
                if (subNum < 2 || subNum > 9) {  // 2~9 범위가 아닌 경우
                    System.out.println("2~9 이외의 숫자를 입력했습니다. 잘못된 입력입니다.");
                } else {
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(subNum + " * " + i + " = " + (subNum * i));
                    }
                }
            } else if (num == 2) {  // 전체 구구단 출력
                for (int i = 2; i <= 9; i++) {
                    System.out.println(i + "단:");
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j));
                    }
                    System.out.println();  // 각 단 사이에 줄바꿈 추가
                }
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}