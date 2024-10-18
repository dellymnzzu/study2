//package Day4;
//
//public class QQQ {
//    public static void main(String[] args) {
//        while (true) {
//
//            if (user1 > 0 && user1 < 10 && user2 > 0 && user2 < 10 && user3 > 0 && user3 < 10 &&
//                    user1 != user2 && user2 != user3 && user1 != user3) {
//                int strike = 0;
//                int ball = 0;
//
//                if (user1 == num1) {
//                    strike++;
//
//                }
//                if (user2 == num2) {
//                    strike++;
//                }
//                if (user3 == num3) {
//                    strike++;
//                }
//                if (user1 == num2 || user1 == num3) {
//                    ball++;
//                }
//                if (user2 == num1 || user2 == num3) {
//                    ball++;
//                }
//                if (user3 == num2 || user3 == num1) {
//                    ball++;
//                }
//
//                if (strike == 0 && ball == 0) {
//                    System.out.println("아웃");
//                } else if (strike == 3) {
//                    System.out.println("홈런입니다.");
//                    break;
//                } else {
//                    System.out.println("Strike : " + strike + ", Ball : " + ball);
//                }
//            } else {
//                System.out.println("잘못된입력입니다.");
//            }
//        }
//    }
//}
