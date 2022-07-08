package wildcards;

import java.util.ArrayList;
import java.util.List;

public class IntegerConsumerExample {
    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Number>();
        list = new ArrayList<Integer>();

        doSomethingWithList(new ArrayList<Integer>());
        doSomethingWithList(new ArrayList<Number>());
        doSomethingWithList(new ArrayList<Object>());
    }

    private static void doSomethingWithList(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);

        Object object = list.get(0);

    }
}
