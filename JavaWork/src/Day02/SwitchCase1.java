package Day02;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int rangking = sc.nextInt();
        char medalColor;

        switch (rangking){
            case 1:
                medalColor='G';
                break;
            case 2:
                medalColor='S';
                break;

            case 3:
                medalColor='B';
                break;

            default:
                medalColor = 'A';
                        break;
        }
        System.out.println(rangking + "등 메달의 색깔은 "+medalColor);
    }
}
