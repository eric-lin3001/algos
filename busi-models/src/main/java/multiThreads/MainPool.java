package multiThreads;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainPool {

    private ExecutorService executorService;

    @Scheduled(cron = "0 */5 * * * ?")
    public void taskPool() {
        Thread myThread = new Thread(new MyRunnable());
        executorService.execute(myThread);
//        myThread.start();

    }


    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(myThread);
        executorService.shutdown();

    }
}
