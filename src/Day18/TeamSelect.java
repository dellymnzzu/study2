package Day18;

import java.util.Random;

public class TeamSelect {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        String[] msa ={"권윤경","김민주","김준환","김지헌","송유진",
        "심현철","안재원","오민혁","이종민","임종진","장승훈","최동훈",
        "최선재","최재영","최지웅","허찬용","현영민"};

        String[][] jo = new String[6][];
        for(int i = 0;i< jo.length;i++){
            if(i<5){
                jo[i] = new String[3];
            }
            else{
                jo[i] = new String[2];
            }
        }

        for(int i = 0;i< jo.length;i++){
            System.out.println("*"+(i+1)+"조 추첨 시작*");
            for(int j = 0;j<jo[i].length;j++){
                int num = r.nextInt(msa.length);
                if(msa[num] != ""){
                    System.out.println("축하합니다! "+msa[num]);
                    jo[i][j] = msa[num];
                    msa[num] = "";
                    Thread.sleep(5000);
                }
                else{
                    j--;
                }
            }
        }
        for(int i = 0;i< jo.length;i++) {
            System.out.println(i+1+"조");
            for (int j = 0; j < jo[i].length; j++) {
                System.out.println(jo[i][j]);
            }
            System.out.println("========================");
        }
    }
}
