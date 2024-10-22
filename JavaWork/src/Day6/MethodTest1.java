package Day6;

import java.util.Random;
import java.util.Scanner;

//public 클래스
// class // 클래스
public class MethodTest1 {
    // static 바로 저장 가능
    //main은 프로그램이 실행을 하면 무조건 main 먼저 실행
    public static void main(String[] args) {
        // 안주고 받는 형태
        // 이름 main
        //리턴이 없고 매개 변수는 String 1차원 배열을 받습니다.

        System.out.println("헬로우"); // print도 함수이다. 안 주고 받는 형태 (출력이 return이 아님 )
        Scanner sc = new Scanner(System.in); // 클래스

        int num = sc.nextInt();// 주고 안 받고

        Random r = new Random(); // 클래스
        int ran = r.nextInt(10); // 주고 받고

    }
}
