package Day02;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "Korea";
        String password = "1234";


        System.out.print("id 입력 : ");
        String idInput = sc.next();

        System.out.print("pw 입력 : ");
        String pwInput = sc.next();

        if(idInput.equals(id)&&pwInput.equals(password)) {
            System.out.println("환영합니다. Korea님");
        }
            else if(!(id.equals(idInput))){
                System.out.println("id가 올바르지 않습니다. ");
            }
        else if(!(pwInput.equals(password))){
            System.out.println("pw가 올바르지 않습니다. ");
        }

        else {
            System.out.println("둘 다 올바르지 않습니다. ");
        }

    }
}
