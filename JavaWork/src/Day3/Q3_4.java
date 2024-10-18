package Day3;

public class Q3_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    for (int k = 0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    break;
                }

            }
            System.out.println();
        }
    }
}
