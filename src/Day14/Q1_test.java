package Day14;

class Dino {
    int height;
    int weight;

    void print() {
        System.out.println("나는 공룡이다!");
    }
}

class TN extends Dino {
    TN() {
        height = 2;
        weight = 1;
    }

    void print() {
        System.out.println("나는 키" + height + " 몸무게 " + weight + "톤인 티라노사우르스다!");
    }
}

class TR extends Dino {
    TR() {
        height = 2;
        weight = 1;
    }

    void print() {
        System.out.println("나는 키" + height + " 몸무게 " + weight + "톤인 티리케라톱스이다!");
    }
}

class BG extends Dino {
    BG() {
        height = 2;
        weight = 1;
    }

    void print() {
        System.out.println("나는 키" + height + " 몸무게 " + weight + "톤인 부경사우르스다!");
    }
}

public class Q1_test {
    static void dinoSoul(Dino d) {
        d.print();

    }

    public static void main(String[] args) {


//
        Dino d1 = new TN();
        Dino d2 = new TR();
        Dino d3 = new BG();
//
//        d1.print();
//        d2.print();
//        d3.print();

//        TN tn = new TN();
//        TR tr = new TR();
//        TN tn = new TN();

        dinoSoul(d1);
        dinoSoul(d2);
        dinoSoul(d3);
    }
}
