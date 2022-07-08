package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLinkedList_1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        List<Integer> integers = Arrays.asList(1, 7, 8, -4, 6, 9);

        linkedList.appendAll(integers);

        System.out.println(linkedList);

        List<Integer> container = new ArrayList<>();

        linkedList.copyAll(container);

        System.out.println(container);

    }
}
