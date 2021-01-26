//package main;
//
//import java.util.concurrent.LinkedBlockingQueue;
//
//public class InterThread {
//    private final int nThreads=0;
//    private final PoolWorker[] threads;
//    private final LinkedBlockingQueue queue=new LinkedBlockingQueue();
//    private class PoolWorker extends Thread{
//        public void run(){
//            Runnable task;
//            while(true){
//                synchronized (queue){
//                    while(queue.isEmpty()){
//                        try{
//                            queue.wait();
//                        }
//                        catch (InterruptedException e){
//                            System.out.print("An error occured while queue is waiting");
//                        }
//                    }
//                    task=queue.poll();
//                }
//            }
//        }
//    }
//        public static void main (String[] args)
//    {
//       MyThread mt = new MyThread();
//       mt.start();
//       synchronized (mt){
//           System.out.println("Hello");
//           try{
//               mt.wait();
//           }catch (InterruptedException e){
//               e.printStackTrace();
//           }
//       }
//    }
//    static class MyThread extends Thread{
//            public void run(){
//                synchronized (this){
//                    System.out.println("Java");
//                    notify();
//                }
//            }
//    }
//
//}
