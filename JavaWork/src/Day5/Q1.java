package Day5;


import java.util.Random;

//1. 랜덤객체 생성
//2. 배열 생성
//3. 배열에 중복되지 않는 랜덤값 대입 1~9
//4. 배열에 들어있는 값 출력
//5. 오름차순 정렬
//6. 정렬된 배열 값 출력
public class Q1 {
    public static void main(String[] args) {
        // 랜덤 객체 생성
        Random r = new Random();
        // 배열 생성
        int[] arr = new int[5];
        // 배열에 중복되지 않는 랜덤 값 대입
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        //배열에 들어있는 값 출력
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 4; i++) { // 0 1 2 3
            for (int j = i + 1; j < 5; j++) {  // 1 2 3 4
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }  // 선택정렬

            }


        }
        System.out.println("정렬후");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
