package Day10;

import java.util.Random;

class Dice {
    int blue;
    int red;

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    Dice(int blue, int red) {
        this.blue = blue;
        this.red = red;

    }


}


public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();

        int blueSum = 0;
        int redSum = 0;
        while (blueSum < 50 || redSum < 50) {
            int red = r.nextInt(7) + 1;
            int blue = r.nextInt(7) + 1;

            Dice dice = new Dice(red, blue);
            blueSum += blue;
            redSum += red;

            System.out.println(blueSum + " blue, " + redSum + " red.");


        }
        if (blueSum > 50) {
            System.out.println("블루 주사위가 이겼습니다.");
        } else if (redSum > 50) {
            System.out.println("레드 주사위가 이겼습니다. ");
        }
    }


}
