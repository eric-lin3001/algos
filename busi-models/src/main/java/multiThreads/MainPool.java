package multiThreads;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainPool {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable("thread1"));
        Thread t2 = new Thread(new MyRunnable("thread2"));
        Thread t3 = new Thread(new MyRunnable("thread3"));
        Thread t4 = new Thread(new MyRunnable("thread4"));
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
//        t3.join();
//        t4.join();
        long end = System.currentTimeMillis();
        System.out.println("主线程执行完毕,耗时:" + String.valueOf(end - start));
    }
}
