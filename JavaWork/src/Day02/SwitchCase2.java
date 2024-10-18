package Day02;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("메달 색상을 입력해주세요: ");
        String medal = sc.next();

        switch (medal){
            case "Gold":
                System.out.println("금메달입니다. ");
                break;
            case "silver":
                System.out.println("은메달입니다. ");
                break;

            case "Bronze":
                System.out.println("동메달입니다. ");
                break;

            default:
                System.out.println("메달이 없습니다");
                break;

        }
    }
}
