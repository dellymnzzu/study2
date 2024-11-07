package Day01;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1= 1.2;
        float fNum2 = 0.9F; // float은 F를 넣어줘야지 에러 안남

        int iNum3 = (int)dNum1+(int)fNum2;
        int iNum4 = (int)(dNum1+fNum2);

        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
