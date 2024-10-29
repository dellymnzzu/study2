//package Day11;
//
//import java.util.Random;
//import java.util.Scanner;
//
//class Citizen {
//    String lang = "억울합니다. 저는 마피아가 아닙니다.";
//}
//
//class Mafia {
//    String lang = "네 제가 마피아입니다.";
//}
//
//class Police {
//    Scanner sc = new Scanner(System.in);
//    int choice = 0;
//
//    void inputNum() {
//        System.out.print("1부터 5까지 숫자를 입력하세요. ");
//        choice = sc.nextInt();
//    }
//
//    void check(int mafiaNum) {
//        if (choice == mafiaNum) {
//            Mafia mafia = new Mafia();
//            System.out.println(Printmafia.printmafia);
//
//        } else {
//
//
//        }
//    }
//
//
//}
//
//class Printmafia {
//
//    void printmafia(Citizen citizen) {
//        System.out.println(citizen.lang);
//    }
//
//    void printmafia(Mafia mafia) {
//        System.out.println(mafia.lang);
//    }
//}
//
//public class Q3 {
//    public static void main(String[] args) {
//        Random r = new Random();
//        int mafiaNum = r.nextInt(6) + 1;
//        System.out.println(mafiaNum);
//
//        Citizen citizen = new Citizen();
//        Police police = new Police();
//
//        Printmafia pm = new Printmafia();
//
//        police.inputNum();
//        police.check(mafiaNum);
//
//
//    }
//}
