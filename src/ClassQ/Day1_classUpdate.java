package ClassQ;

// has 관계 이용하기

import java.util.Scanner;

class Input{
    int[] num = new int[2];



    Input (){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<num.length;i++){
            System.out.print((i+1)+"번째 입력 : ");
            num[i] = sc.nextInt();
        }
    }
    int[] getNum() {
        return num;
    }
}

class Sum{
    Sum(int[] num){
        System.out.println("더하기 연산 : "+(num[0]+num[1]));
    }


}

class Minus{
    Minus(int[] num){
        System.out.println("빼기 연산 : "+ (num[0]-num[1]));

    }


}


public class Day1_classUpdate {
    public static void main(String[] args) {

        Input input = new Input();
        new Sum(input.getNum());  // input.getNum()으로 받고 있어서 배열 받을 수 있다. 
        new Minus(input.getNum());


    }
}
