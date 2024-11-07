package Day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int flag = 0;
        while (flag == 0) {
            flag = 1;
            try {
                System.out.print("숫자입력 : ");
                num = sc.nextInt(); // 만약 숫자가 아닌 스트링으로 넣었을 경우
                System.out.println("입력받은 숫자는 = " + num);
            } catch (InputMismatchException e) {
                flag = 0;
                sc.nextLine();  // 라인 미뤄서 깔끔하게 지우고 시작
                System.out.println("정상인 숫자를 입력하세요. ");
            }
        }
    }
}
