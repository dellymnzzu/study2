//package Day7;
//
//import java.util.Scanner;
//
//public class Q1 {
//    // 입력 함수 2번 주고 받고 리턴 값 주고 매개 변수 안 받고
//    static int inPut() {
//        Scanner sc = new Scanner(System.in);
//        int inputNum = sc.nextInt();
//        while (inputNum != 3) {
//            if (inputNum < 3) {
//                System.out.println("잘못된 입력입니다.");
//            } else {
//                if (inputNum == 1) {
//                    System.out.println("1. 가로: ");
//                    int garo = sc.nextInt();
//                    System.out.println("2. 세로 : ");
//                    int sero = sc.nextInt();
//
//                    return square(int num1,int num2`);
//                } else {
//                    return triangle();
//                }
//            }
//        }
//        return inputNum;
//    }
//
//
//    static int square(int a) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. 가로 : ");
//
//        return garo * sero;
//
//
//    }
//
//    static void triangle() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. 가로 : ");
//        int garo = sc.nextInt();
//        System.out.println("2. 세로 : ");
//        int sero = sc.nextInt();
//        System.out.println("삼각형의 넓이 : " + (garo * sero) / 2);
//
//
//    }
//
//
//    // 삼각형 넓이 구하는 함수 리턴 값 안주고 매개변수 받고
//
//    //1. 입력값을 받는다 (1번,2,3번 중 하나를 고르시오. )
//
//    // 이때 입력 값을 1~3번 이외의 값을 입력하면 잘못된 입력입니다 출력한다.
//    // 2. 1번이나 2번 입력 시 가로와 세로 입력 받기
//    //3. 사각형의 넓이 구하는 방법은 가로 * 세로
//    //4. 삼각형의 넓이 구하는 방법은 가로 * 세로 /2
//    // 출력은 따로 하지 않아도 된다. (아싸)
//    public static void main(String[] args) {
//        int result = inPut();
//
//
//    }
//
//}
