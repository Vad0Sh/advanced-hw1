package homework8.task3;

public class Main {
    public static void main(String[] args) {
        MyThread first = new MyThread();
        MyThread second = new MyThread();
        MyThread main = new MyThread();
        first.setPriority(1);
        second.setPriority(6);
        main.setPriority(10);
        first.start();
        second.start();
        main.start();

    }
}
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Поток " + Thread.currentThread().getName() + " i= " + i);
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " завершил работу ");
    }
}
