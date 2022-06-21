package homework8.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread first = new MyThread();
        MyThread second = new MyThread();
        MyThread main = new MyThread();
        first.start();
        first.join();
        second.start();
        second.join();
        main.start();
        main.join();

    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток " + Thread.currentThread().getName() + " завершил работу ");
    }
}

