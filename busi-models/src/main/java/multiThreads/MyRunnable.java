package multiThreads;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("My runnable is invoked.");
    }
}
