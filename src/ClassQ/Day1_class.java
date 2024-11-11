package ClassQ;

// input이 sum을 낳지 않았으니 has관계로 하는것이 맞는 거같다.
// has관계로 해보기

import java.util.Scanner;

class Input1{
    int num1;
    int num2;
    Input1(int m1, int m2){
        this.num1 = m1;
        this.num2 = m2;
    }
    void print(){
        System.out.println("숫자 num1 입력은 : "+num1+"숫자 num2 입력은 : "+num2+"입니다. ");  // 오버라이딩을 하게 되면 부모의 print()을 사용 x , 추상화 클래스를 이용하여 print()에 굳이 쓰지 않게 하기

    }
}

class Sum1 extends Input1{
    Sum1(int m1, int m2) {
        super(m1, m2);
    }
    void print(){

        System.out.println("더하기 연산 : "+(num1+num2));
    }
}

class Minus1 extends Input1{

    Minus1(int m1, int m2) {
        super(m1, m2);
    }
    void print(){
        System.out.println("빼기 연산 : "+(num1-num2));
    }
}



public class Day1_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        Input1 input = new Input1(num1, num2);
        Sum1 sum = new Sum1(num1,num2);
        Minus1 minus = new Minus1(num1,num2);
        sum.print();
        minus.print();






    }
}
