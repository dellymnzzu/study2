package Day02;

import java.util.Scanner;

public class Q2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int m = sc.nextInt();

        System.out.print("온도 입력 : ");
        int f = sc.nextInt();
        if ((m >= 3 && m <= 5) && (f >= 3 && f <= 15)) {
            System.out.println("계절은 봄입니다. 온도는 " + f + " 입니다.");
        } else if ((m >= 6 && m <= 8) && (f >= 18 && f <= 37)) {
            System.out.println("계절은 여름입니다. 온도는 " + f + " 입니다.");
        } else if ((m >= 9 && m <= 11) && (f >= 3 && f <= 15)) {
            System.out.println("계절은 가을입니다. 온도는 " + f + " 입니다.");
        } else if ((m >= 12 && m <= 2) && (f >= -15 && f <= 2)) {
            System.out.println("계절은 겨울입니다. 온도는 " + f + " 입니다.");
        } else if ((m>=2|| m==12) && (f >= -15 && f <= 37)) {
            System.out.println("계절과 온도가 맞지 않습니다. ");
        } else {
            System.out.println("여기 온도 값이 없거나 계절의 월 범위가 벗어나면 잘못된 입력입니다. ");
        }
    }
}
