package Day02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /*
        1. 입력 - > 국어 영어 수학
        2. 분기를 통한 출력
        2-1 올바른 경우 평균과 학점 출력
        2-2. 올바르지 않은 경우 - > 과목마다 잘 못 입력 됐습니다.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 입력");
        int ki = sc.nextInt();
        System.out.print("수학 점수 입력");
        int math = sc.nextInt();
        System.out.print("영어 점수 입력");
        int eng = sc.nextInt();

        double sum = (ki + math + eng) / 3;
        if (ki > 100 || ki < 0 || math > 100 || math < 0 || eng > 100 || eng < 0) {
            if (ki > 100 || ki < 0) {
                System.out.print("국어 ");
            }
            if (math > 100 || math < 0) {
                System.out.print("수학 ");
            }
            if (eng > 100 || eng < 0) {
                System.out.print("영어 ");
            }
            System.out.print("잘못입력되었습니다.");
        } else {
            if (sum >= 95) {
                System.out.printf("평균 %.1f점이고 학점은 A+입니다. ", sum);
            } else if (sum >= 90) {
                System.out.printf("평균 %.1f점이고 학점은 A입니다. ", sum);
            } else if (sum >= 85) {
                System.out.printf("평균 %.1f점이고 학점은 B+입니다. ", sum);
            } else if (sum >= 80) {
                System.out.printf("평균 %.1f점이고 학점은 C+입니다. ", sum);
            } else if (sum >= 75) {
                System.out.printf("평균 %.1f점이고 학점은 C입니다. ", sum);
            } else if (sum >= 70) {
                System.out.printf("평균 %.1f점이고 학점은 D+입니다. ", sum);
            } else if (sum >= 65) {
                System.out.printf("평균 %.1f점이고 학점은 D입니다. ", sum);
            } else {
                System.out.printf("평균 %.1f점이고 학점은 F입니다. ", sum);

            }
        }
    }
}
