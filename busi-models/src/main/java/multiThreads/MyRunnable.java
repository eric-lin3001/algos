package multiThreads;

import java.util.Random;

class MyRunnable implements Runnable{

    String name;
    int time;
    Random r = new Random();


    public MyRunnable(String name) {
        this.name = name;
        time = r.nextInt(9);
    }

    public void run() {

        try {
            System.out.println(String.format("%s is UP and ready to sleep,sleeping period is %s",name,time));
            Thread.sleep(time);
            System.out.println(String.format("%s is waked up",name));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
