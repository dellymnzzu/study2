package Day14;


class Dinosaur {
    int cm; // 키
    int kg; // 무게
    String name; // 이름

    void print() {
        System.out.println("나는 공룡이다!");
    }

}


class TS extends Dinosaur {
    TS() {
        cm = 2;
        kg = 1;
        name = "티라노사우르스";
    }

    void print() {
        System.out.println("나는 키" + cm + " 몸무게 " + kg + "톤인 " + name + "다!");
    }
}

class TT extends Dinosaur {
    TT() {
        cm = 3;
        kg = 2;
        name = "티리케라톱스";
    }

    void print() {
        System.out.println("나는 키" + cm + " 몸무게 " + kg + "톤인 " + name + "다!");
    }

}

class BS extends Dinosaur {
    BS() {
        cm = 5;
        kg = 3;
        name = "부경사우르스";
    }

    void print() {
        System.out.println("나는 키" + cm + " 몸무게 " + kg + "톤인 " + name + "다!");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        TS ts = new TS();
        TT tt = new TT();
        BS bs = new BS();
        Dinosaur dinosaur1 = new TS();
        Dinosaur dinosaur2 = new TT();
        Dinosaur dinosaur3 = new BS();

        dinosaur.print();
        dinosaur1.print();
        dinosaur2.print();
        dinosaur3.print();

    }
}
