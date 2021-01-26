package main.SAP;
class MultiThreading implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadImpl{

    public static void main(String args[]){
        Thread thread1=new Thread(new MultiThreading());
        thread1.start();
    }
}
