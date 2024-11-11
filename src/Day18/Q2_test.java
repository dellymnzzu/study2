package Day18;


class Account{
    private int total = 0;

    public int getTotal() {
        return total;
    }

    synchronized void deposit(){
        total +=1000;
    }
}

class Customer extends Thread{
    Account a;
    Customer(Account a, String s){  // String s는 문자열로 받기 위해서
        this.a = a;
        setName(s);  //이걸로 말고 이름을 넣어주면 된다.
    }

    @Override
    public void run() {
        int i = 0;
        while(a.getTotal()<50000){
            System.out.println(getName()+ " : "+(++i));
            a.deposit();
        }
    }
}
public class Q2_test {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account();
        Customer[] c = new Customer[5];
        for(int i = 0; i<c.length;i++){
            c[i] = new Customer(a,(i+1)+"번째 성금자");
        }
        for(int i = 0; i<c.length;i++){
            c[i].start();
        }
        for(int i = 0; i<c.length;i++){
            c[i].join();
        }
        System.out.println("성금 총액은 : "+a.getTotal());

    }
}
