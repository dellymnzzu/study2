package Day4;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usermax = 0;
        int usermin = 0;
        boolean f = true;


        while (true) {
            System.out.print("둘 중에 큰 수를 입력해주세요. ");
            usermax = sc.nextInt();
            System.out.print("둘 중에 작은 수를 입력해주세요. ");
            usermin = sc.nextInt();

            int max = usermax;
            int min = usermin;

            if (usermax < usermin) {
                System.out.println("max가 min보다 커야합니다! 다시 입력해주세요. ");
            } else {
                if (usermax % usermin != 0) {
                    int temp = max % min;
                    max = min;
                    min = temp;
                }
            }
            System.out.println("최소 공배수 : " + (usermax * usermin / min));
            System.out.println("최대 공약수 : " + min);
            break;
        }
    }
}
