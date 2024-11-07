package Day6;

import java.util.Scanner;

public class Q4 {
    static int inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나를 입력하세요 : ");
        int num = sc.nextInt();
        return num;
    }

    static int[] y(int input) {
        int[] arr = new int[input];

        System.out.print(input + "의 약수는 ");
        for (int i = 1; i <= input; i++) {
            if ((input % i) == 0) {
                yPrint(i);

            }
        }
        return arr;

    }

    static void yPrint(int arrPrint) {


        System.out.print(arrPrint + " ");


    }


    public static void main(String[] args) {
        y(inPut());


    }
}
