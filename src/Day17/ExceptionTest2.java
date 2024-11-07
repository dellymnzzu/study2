package Day17;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest2 {
    // 입출력 관련 예외처리
    public static void main(String[] args) throws IOException {

        FileReader fr;
        fr = new FileReader("a.txt");  // 만약 c로 변경되면 예외처리가 된다. 하지만 이걸 넣지 않아도 예외처리는 가능하다.ㅡ
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();

    }
}
