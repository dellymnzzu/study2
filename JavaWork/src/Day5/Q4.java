package Day5;

public class Q4 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int cnt = 1;
        int sum = 1;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = cnt++;

                }
            } else {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    a[i][j] = cnt++;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");


            }
            System.out.println();
        }
    }
}
