package Day3;

public class Q3_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    j -= 2;
                }

            }
            System.out.println();
        }
    }
}
