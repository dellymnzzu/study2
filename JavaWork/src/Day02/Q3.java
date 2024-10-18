package Day02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 입력 : ");
        String a = sc.next();
        if(!(a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/"))) {
            System.out.println("잘못된 연산자 입니다.");
        }else{
            if(a.equals("+")){
                System.out.printf("결과값 :%d",num1+num2);
            }else if (a.equals("-")){
                System.out.printf("결과값 :%d",num1-num2);
            }else if (a.equals("*")){
                System.out.printf("결과값 :%d",num1*num2);
            }else{
                System.out.printf("결과값 : %.1f ",(double)num1/num2);
            }
        }




    }
}
