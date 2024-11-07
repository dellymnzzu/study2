package Day15;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExFileReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("읽어 들일 파일명을 입력하세요 : ");
        String s = sc.next();
        //FileReader 객체 생성과 동시에 입력한 문자열 생성자 매개변수에 대입
        FileReader fr = new FileReader(s);  // 파일 s를 읽는다
        int i;

        //fr.read() - > 정수값
        // 정수값을 i에 대입하고
        // i가 -1이 아닌 경우에는 계속 반복을 합니다.

        while ((i = fr.read()) != -1) {  // fr을 읽으면
            System.out.print((char) i);  // 문자열로 바뀐다.
        }
        fr.close();

    }
}
