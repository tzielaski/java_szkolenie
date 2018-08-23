package pl.com.sages.hello;

public class CreditThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            charge(1000);
        }
    }

    public void charge(int amount) {
        if(ThreadTester.creditLimit>=amount){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ThreadTester.creditLimit-=amount;
            synchronized (ThreadTester.class) {
                System.out.println("" + ++ThreadTester.chargesNumber + ": Charged 1000 " + Thread.currentThread().getName());
            }
        }
    }
}
