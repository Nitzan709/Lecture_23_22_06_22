package linkedlist;

public class TestIntNode {
    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node0 = new Node(5,node1);

        System.out.println(node0);
        System.out.println(node1);

    }
}
