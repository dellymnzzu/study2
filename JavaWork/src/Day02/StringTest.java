package Day02;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요.: ");
        String str = sc.next();

        if(str.equals("hi")){ // 문자열은 ==를 쓰는 것 보다 equals를 써야지안전함(써도 괜찮지만 문제가 생길 가능성이 높음)
            System.out.println("hi");
        }
        else {
            System.out.println("no hi");
        }
    }
}
