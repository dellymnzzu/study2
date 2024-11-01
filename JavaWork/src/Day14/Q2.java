//package Day14;
//
//// 100개의 먹이가 배열로 존재 (객체 배열로 )
//// 상어의 객체는 5마리이고 랜덤으로 8~14까지 먹이를 먹을 수 있는 양을 정한다.
//// Main 문에서 상어 5마리가 먹을 수 있는 만큼 먹이 객체를 먹습니다.
//// 상어가 먹이를 얼마나 잡아 먹었는지 출력한다
//// 상속이 없다.
////
//
//import java.util.Random;
//
//class Food {
//    int quantity;
//
//    Food(int quantity) {
//        this.quantity = quantity;
//    }
//}
//
//class Shark {
//    Food[] foods;
//
//    Shark() {
//        foods = new Food[5];  // 상어가 먹을 수 있는 배열 크기 정의
//        for (int i = 0; i < 5; i++) {
//            Random r = new Random();
//            int randomFood = r.nextInt(7) + 8;
//            foods[i] = new Food(randomFood);
//            System.out.println(foods[i]);
//        }
//    }
//
//
//}
//
//public class Q2 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            Shark shark = new Shark();
//            System.out.println("상어 " + (i + 1) + ": ");
//        }
//
//    }
//}
