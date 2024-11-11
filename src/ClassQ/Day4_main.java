//package ClassQ;
//
//
//// if문으로 같으면 자리바꾸기
//// 같은 자리는 아니지만, 숫자가 같을 때 스트라이크
//// 같은 자리가 있으면 ball
//// 다 같으면 홈런
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Day4_main {
//    public static void main(String[] args) {
//        int ball = 0;
//        int strike = 0;
//        boolean g = false;
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        Scanner sc =new Scanner(System.in);
//        while(true){
//            Random r =new Random();
//            num1 = r.nextInt(9)+1;
//            num2 = r.nextInt(9)+1;
//            num3 = r.nextInt(9)+1;
//
//            if(num1!=num2||num1!=num3||num2!=num3){
//                System.out.println("num1: "+num1+",  num2: "+num2+", num3 : "+num3);
//
//                break;
//            }
//        }
//        while (g == false) {
//            System.out.print("첫째자리 : ");
//            int user1 = sc.nextInt();
//            System.out.print("둘째자리 : ");
//            int user2 = sc.nextInt();
//            System.out.print("셋째자리 : ");
//            int user3 = sc.nextInt();
//            // 첫재자리,둘째자리,셋째자리 입력받기
//
//            // if문으로 다 같은 자리 하기
//
//            if(num1==user2||num1==user3||num2==user1||num3==user2){
//                System.out.println();
//            }
//
//        }
//        }
//
//
//
//
//
//
//
//
//
//
////        for(int i = 0; i<arr.length;i++){ // for문으로 돌리면 한정적이기 때문에 while문이 맞다
////            Random r = new Random();
////            arr[i]=r.nextInt(10)+1;
////            if(arr[i]==arr[i+1]||arr[i]==arr[i+2]){
////                i--;
////            }
//
//        }
//
//
//
//
