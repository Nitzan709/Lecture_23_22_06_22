package wildcards;

import java.util.ArrayList;
import java.util.List;

public class NumberProducerExample {
    public static void main(String[] args) {
        doSomethingWithList(new ArrayList<Integer>());
        doSomethingWithList(new ArrayList<Double>());
        doSomethingWithList(new ArrayList<Float>());
        doSomethingWithList(new ArrayList<>());
    }

    private static void doSomethingWithList(List<? extends Number> list) {
        /*This list produces Numbers.*/
        for (Number number : list) {
            System.out.println(number);
        }

    }
}
