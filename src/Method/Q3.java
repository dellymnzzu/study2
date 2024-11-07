package Method;


// 1~n까지 합 구해주는 메소드
//입력은 메인에서 출력 혹은 연산은 메소드에서 진행한다.

// 출력메소드
// 연산메소드


import java.util.Scanner;

public class Q3 {
    static void print(int sum) {
        System.out.println("입력 값:" + sum);


    }

    static int sum(int num) {
        int[] arr = new int[num];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        return sum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나를 입력하세요: ");
        int num = sc.nextInt();
        print(sum(num));

    }
}
