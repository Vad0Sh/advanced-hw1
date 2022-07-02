package homework9.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,12,13,5,4,8,11,6,9,7);
        int sum = list.stream().map(x -> x*x).reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
