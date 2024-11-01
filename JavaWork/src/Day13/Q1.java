//package Day13;
//
//
//import java.util.Scanner;
//
//class Controller {
//
//
//    int cal(int numInput, int num1, int num2) { // 정수연산
//        int result = 0;
//
//        switch (numInput) {
//            case 1 :
//                result = num1+num2;
//                return result;
//            case 2:
//                result = num1-num2;
//
//                return result;
//            case 3:
//                result = num1*num2;
//                return result;
//            case 4:
//                result = num1/num2;
//                return result;
//
//        }
//
//
//    }
//
//
//
//
//    double cal(int numInput, double num1, double num2) {  // 실수연산
//        double result = 0;
//        switch (numInput) {
//            case 1 :
//                return num1+num2;
//            case 2:
//                return num1-num2;
//            case 3:
//                return num1*num2;
//            case 4:
//                return num1/num2;
//
//        }
//        return
//
//    }
//
//
//    void input() {
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        while (num < 3) {
//            System.out.print("1. 정수연산 2. 실수연산 3. 종료 : ");
//            int numID = sc.nextInt();
//            num = numID;
//            if (numID == 1) {
//                System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 : ");
//                int numInput = sc.nextInt();
//                System.out.print("숫자 1 입력 : ");
//                int num1 = sc.nextInt();
//                System.out.print("숫자 2 입력 : ");
//                int num2 = sc.nextInt();
//                //더하기 일 때
//                // 빼기 일 때
//                // 곱하기 일 때
//                // 나누기 일 때
//            } else if (numID == 2) {
//                System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 : ");
//                int numInput = sc.nextInt();
//                System.out.print("숫자 1 입력 : ");
//                double num1 = sc.nextInt();
//                System.out.print("숫자 2 입력 : ");
//                double num2 = sc.nextInt();
//                // double 더하기 일 때
//
//
//            } else {
//                System.out.println("다시 입력해주세요. ");
//            }
//
//
//        }
//
//
//    }
//
//
//}
//
//public class Q1 {
//    public void main(String[] args) {
//        Controller controller = new Controller();
//        controller.input();
//
//    }
//
//}
