package Day7;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1번 2번 3번 중 입력하세요. ");
        int num = sc.nextInt();

        while (num < 3) {
            if (num == 1) {
                System.out.print(" 원하는 구구단을 입력하세요: ");
                int gogo = sc.nextInt();
                for (int i = 1; i <= 9; i++) {
                    System.out.println(gogo + " * " + i + " = " + (gogo * i));
                }
            } else {
                System.out.println("1. 네모 2. 직삼각형 정방향 3. 직삼각형 역방향 4. 피라미드 5. 다이아몬드 입력하세요. ");
                int num1 = sc.nextInt();
                if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4 || num == 5) {
                    if (num == 1) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 5; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else if (num == 2) {
                        for (int i = 1; i <= 3; i++) {
                            for (int j = 5; j >= 1; j--) {
                                if (i > j) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("*");
                                    j -= 2;
                                }

                            }
                            System.out.println();
                        }
                    } else if (num == 3) {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 4; j > 0; j--) {
                                if (i < j) {
                                    System.out.print(" ");
                                } else {
                                    for (int k = 0; k <= i * 2; k++) {
                                        System.out.print("*");
                                    }
                                    break;
                                }

                            }
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("잘못된 입력입니다. ");
                    break;
                }

            }

        }
    }


}

