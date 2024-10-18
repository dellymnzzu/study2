package Day02;

public class BreakExample {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        while (true) {
            sum += num;
            if (sum >= 100) {
                break;

            }
            num++;

        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
        //브레이크 문은 가장 인접한 반복문 빠져나감
    }
}
