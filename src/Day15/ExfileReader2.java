package Day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExfileReader2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("읽어들일 파일명을 입력하세요 : ");
        String s = sc.next();
        BufferedReader br = new BufferedReader(new FileReader(s));
        String str;

        // br.readLine() 한줄 씩 읽어온다.
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
