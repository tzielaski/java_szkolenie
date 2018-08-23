package pl.com.sages.hello;


public class ThreadTester {
    public static int creditLimit=10000;
    public static int chargesNumber=0;

    public static void main(String[] args){
        /*for(int i=0; i<5;i++){
            CountingThread ct = new CountingThread();
            ct.start();
        }*/
        /*for(int i=0; i<10; i++){
            CreditThread cr = new CreditThread();
            cr.start();
        }*/

        for(int i=0; i<10; i++){
            SynchronizedCreditThread scr = new SynchronizedCreditThread();
            scr.start();
        }
    }


}
