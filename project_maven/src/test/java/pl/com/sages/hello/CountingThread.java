package pl.com.sages.hello;

public class CountingThread extends Thread{
    public void run(){
        synchronized(CountingThread.class){
        for(int i =0; i<10;i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }}
    }
}
