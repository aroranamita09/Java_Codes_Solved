package main;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQUeue {
    final Lock lock= new ReentrantLock();
    //conditions
    final Condition prodCond=lock.newCondition();
    final Condition consCond=lock.newCondition();
    //Array to store element for customBlockingQueue
    final Object[] array=new Object[6];
    int putIndex,takeIndex;
    int count;
    public void put(Object x) throws InterruptedException{
        lock.lock();
        try{
            while(count==array.length){
                //Queue is full,producers need to wait
                prodCond.await();
            }
            array[putIndex]=x;
            System.out.print("Produing-" + x);
            putIndex++;
            if(putIndex==array.length) {
                putIndex = 0;
            }
            ++count;
            consCond.signal();
            //https://docs.oracle.com/javase/tutorial/essential/concurrency/collections.html
            //https://stackoverflow.com/questions/20110013/implement-your-own-blocking-queue-in-java
            //https://java2blog.com/custom-blockingqueue-implementation-java/
            //http://tutorials.jenkov.com/java-concurrency/semaphores.html#bounded
        }
        finally {
            lock.unlock();
        }
    }
//    public Object take() throws InterruptedException{
//            lock.lock();
//            try{
//                while (count==0){
//                    //Query is empty,consumers need to wait
//                    consCond.await();
//                }
//                Object x=array[takeIndex];
//                takeIndex++;
//                if(takeIndex==array.length)
//                    takeIndex=0;
//            }
   // }
}
