package Day15;

import java.util.Random;
import java.util.Scanner;

// 부모 클래스 제품 - 제품 : 브랜드, 제품명, 출력하는(추상화 메소드)
abstract class Product {
    // 전체랜덤같은 경우에는 메인에서 해야함 제품명은 굳이 랜덤 값을 바깥에서 할 필요 없이 안에서 해도 됨
    Random r = new Random();
    String type; // 제품명
    String br; //브랜드

    abstract void print();  // 추상화
    // 공통성과 본질을 모아 추출하는 것이다.
    //

}

class Computer extends Product {
    Computer() {  // Computer라는 생성자
        type = "컴퓨터";  // 타입을 컴퓨터로 지정
        String[] brands = {"삼성", "LG"}; // 브랜드을 삼성과 LG 넣는다.
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + "," + br);
    }
}

class AirCorn extends Product {
    AirCorn() {
        type = "에어컨";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + "," + br);
    }

}

class Ref extends Product {
    Ref() {
        type = "냉장고";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + "," + br);
    }

}

class AirCleaner extends Product {
    AirCleaner() {
        type = "공기청정기";
        String[] brands = {"LG", "다이슨"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + "," + br);
    }

}

public class Q1_test {
    public static void main(String[] args) {
        //1.입력 객체, 랜덤 객체
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //2. 제품 40개 배열 객체 생성

        Product[] pList = new Product[40];

        //3. 40대 배열에 실제 객체 추가

        for (int i = 0; i < pList.length; i++) {
            int num = r.nextInt(4);
            if (num == 0) {
                pList[i] = new Computer();

            } else if (num == 1) {
                pList[i] = new AirCorn();


            } else if (num == 2) {
                pList[i] = new Ref();


            } else {
                pList[i] = new AirCleaner();
            }
            pList[i].print();


        }
        System.out.print("제품 입력 : ");
        String type = sc.next();
        System.out.print("제조사 입력: ");
        String br = sc.next();

        boolean check = true;
        for (int i = 0; i < pList.length; i++) {
            if (pList[i].type.equals(type) && pList[i].equals(br)) {  // 입력과 출력이 같으면
                System.out.println(i + "번재 제품입니다. ");
                check = false;
                break;

            }
            if (check) {
                System.out.println("제품이 없습니다. ");
            }
        }


    }
}

