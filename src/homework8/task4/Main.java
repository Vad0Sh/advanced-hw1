package homework8.task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Factory factory = new Factory(car, 12);
        Buyer buyer = new Buyer(car, 12);

        factory.start();
        buyer.start();
    }
}

class Car {
    int id;
    boolean isProduced;

    synchronized void buy() {
        if (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(" 2 Class ");
        isProduced = false;
        notify();
    }

    synchronized void fact(int id) {
        if (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.id = id;
        System.out.println( " 1 Class");
        isProduced = true;
        notify();
    }
}

class Factory extends Thread {
    Car p;
    int count;

    Factory(Car p, int count) {
        this.p = p;
        this.count = count;
    }

    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.fact(i);
        }
    }
}

class Buyer extends Thread {
    Car p;
    int count;

    Buyer(Car p, int count) {
        this.p = p;
        this.count = count;
    }
    
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.buy();
        }
    }
}