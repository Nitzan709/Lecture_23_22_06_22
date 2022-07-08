package linkedlist;

public class TestLinkedList_0 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(8);
        linkedList.append(10);
        linkedList.append(502);
        linkedList.append(33);
        linkedList.append(-2);
        linkedList.append(88);
        linkedList.append(502);

        System.out.printf("The size of the list is: %d\n", linkedList.size());
        System.out.println("â™¥");

        // [8]->[10]->[502]->[33]->[-2]->null
        System.out.println(linkedList);

        linkedList.remove(502);

        System.out.println(linkedList);

        linkedList.remove(8);

        System.out.println(linkedList);

        linkedList.remove(88);

        System.out.println(linkedList);

    }
}
