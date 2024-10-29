package Day11;


import java.util.Scanner;

public class Q2Test {

    /**
     * 1. 입력
     * 2. 연산 - > main 1122335*#66을 하게 되면 counting 해야함 문자로 바꿔야함.
     * 2-1 카운팅
     * 2-2 입력한 문자 + 카운팅 - > 문자선택
     * 3. 출력
     */

    //1. 입력
    static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        return sc.next();
    }
//2. 연산
    // 2-1 카운팅

    static String makeResult(String str) {
        char ch = str.charAt(0);  // '1'
        int count = 0;
        String result = ""; // 최종 결과값
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;  // 처음부터 0으로 비교하고 싶어서 0으로 한것
            } else {
                //만약 2가 들어왔으면
                result += makeChar(ch, count);
                ch = str.charAt(i);
                count = 1;  // 2로 바뀌었을 때 else 문으로 들어온다. 0으로 하면 처음 if문으로 들어가기 때문에
            }
        }
        result += makeChar(ch, count);
        return result;


    }

    static char makeChar(char ch, int count) {
        char result;
        char[][] key = {
                {'A', 'B', 'C'},  // 가로는 count가지고 잡기 세로는
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'},
                {'M', 'N', 'I'},

        };
        if (ch == '9') {
            result = key[8][0];
        } else if (ch == '*') {
            result = key[9][0];
        } else if (ch == '0') {
            result = key[10][0];
        } else if (ch == '#') {
            result = key[11][0];
        } else {  //만약 별이랑 샾 등 여러개 나오게 하고 싶으면 여기다가 넣으면 된다.
            // 1이 2개가 들어오면 2%3은 2가 나와버린다.
            count = (count - 1) % 3;
            result = key[(ch - '0') - 1][count]; // '1'-'0' => 1차이가 남
        }
        return result;

    }

    static void output(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = input();
        String result = makeResult(str);
        output(result);
        output(makeResult(input()));

    }
}
