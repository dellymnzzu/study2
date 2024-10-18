package Day01;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 두번 입력하세요: "); //
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("더한 값은  :" +(a+b));
        System.out.println(" 뺀 값은  :" +(a-b));




    }
}
