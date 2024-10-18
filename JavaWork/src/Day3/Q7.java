package Day3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("숫자 입력");
            int num = sc.nextInt();
            System.out.print("숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            if (num == 1) {
                for (int i = 1; i <= num1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (num == 2) {
                for (int i = num1; i >= 1; i--) {
                    for (int j = 1; j <= num1; j++) {
                        if (i > j) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");

                        }


                    }
                    System.out.println();

                }


            } else if (num == 3) { // 역직삼각형
                for (int i = 1; i <= num1; i++) {
                    for (int j = num1; j >= 1; j--) {
                        if (i > j) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                            j -= 2;
                        }

                    }
                    System.out.println();
                }


            } else if (num == 4) { // 피라미드
                for (int i = 0; i < num1; i++) {
                    // 공백 출력 (중앙 정렬을 위한 공백)
                    for (int j = 0; j < num1 - i - 1; j++) {
                        System.out.print(" ");
                    }
                    // 별 출력
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();  // 줄바꿈
                }


            } else if (num == 5) { // 다이아몬드
                for (int i = 0; i <= num1; i++) {
                    // 공백 출력 (중심 기준으로 좌우로 별을 채우기 위해 공백 삽입)
                    for (int j = 0; j < num1 - i; j++) {
                        System.out.print(" ");
                    }
                    // 별 출력
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();  // 줄바꿈
                }

                // 아래쪽 삼각형 (다이아몬드 하단)
                for (int i = num1 - 1; i >= 0; i--) {
                    // 공백 출력
                    for (int j = 0; j < num1 - i; j++) {
                        System.out.print(" ");
                    }
                    // 별 출력
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();  // 줄바꿈
                }

            } else {
                break;
            }
        }
        System.out.println("프로그램을 종료합니다.");


    }
}

