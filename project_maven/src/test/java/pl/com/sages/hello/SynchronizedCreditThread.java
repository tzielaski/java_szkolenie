package pl.com.sages.hello;

public class SynchronizedCreditThread extends CreditThread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            synchronized(ThreadTester.class) {
                super.charge(1000);
            }
        }
    }

}
