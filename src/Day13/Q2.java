//package Day13;
//
//import java.util.Scanner;
//
//class Controller {
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    double add(double a, double b) {
//        return a + b;
//    }
//
//    int minus(int a, int b) {
//        return a - b;
//    }
//
//    double minus(double a, double b) {
//        return a - b;
//    }
//
//    int mul(int a, int b) {
//        return a * b;
//    }
//
//    double mul(double a, double b) {
//        return a * b;
//    }
//
//    int div(int a, int b) {
//        return a / b;
//    }
//
//    double div(double a, double b) {
//        return a / b;
//    }
//
//    int inputSelect1() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("1. 정수연산 2. 실수연산 3. 종료 : ");
//        return sc.nextInt();
//    }
//
//    int inputSelect2() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 : ");
//        return sc.nextInt();
//    }
//
//    int[] input() {
//        int[] input = new int[2];
//        Scanner sc = new Scanner(System.in);
//        input[0] = sc.nextInt();
//        System.out.println("숫자 1 : ");
//        input[1] = sc.nextInt();
//        System.out.println("숫자 2 : ");
//        return input;
//    }
//
//    double[] inputDouble(){
//        double[]  input= new double[2];
//        Scanner sc = new Scanner(System.in);
//        double[0] = sc.nextDouble();
//        System.out.println("숫자 1 : ");
//        double[1] = sc.nextDouble();
//        System.out.println("숫자 2 : ");
//        return input;
//
//    }
//}
//
//public class Q2 {
//    public static void main(String[] args) {
//
//        Controller c = new Controller();
//
//        while(true){
//            int s1 = c.inputSelect1();
//            if(s1 == 1){
//                int s2 = c.inputSelect2();
//
//            }else if(s1 ==2){
//
//            }
//        }
//
//    }
//}
