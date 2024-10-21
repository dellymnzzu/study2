package Day5;

public class Q5 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 1;
        int sw = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (sw == 1) {
                    a[i][j] = count++;
                } else {
                    a[i][a[i].length - 1 - j] = count++;
                }
            }
            sw = sw * 1;
        }
    }

}
