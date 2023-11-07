package src.thread;

class ThreadTest1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread - 1");
        System.out.println("Thread - 2");
    }
}

public class ThreadTestExample1 {

    public static void main(String[] args) throws InterruptedException {

        ThreadTest1 threadTest1 = new ThreadTest1();


        threadTest1.start();

        System.out.println("Thread - 3");
        System.out.println("Thread - 4");

        threadTest1.join();

    }

}


