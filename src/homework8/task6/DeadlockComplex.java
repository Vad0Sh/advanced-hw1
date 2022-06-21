package homework8.task6;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadlockComplex {
    public static void main(String[] args) {
        ArrayList<DeadlockComplex.Resource> resources = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            resources.add(new DeadlockComplex.Resource(i));
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> handle(resources.get(0), resources.get(1)));
        executorService.execute(() -> handle(resources.get(1), resources.get(0)));
    }

    public static void handle(DeadlockComplex.Resource res1, DeadlockComplex.Resource res2) {


        System.out.println(Thread.currentThread().getName() + " start");
        synchronized (res1) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (res2) {
                res1.setValue(res2.getValue());
            }
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

    static class Resource {
        int value;

        public Resource(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
