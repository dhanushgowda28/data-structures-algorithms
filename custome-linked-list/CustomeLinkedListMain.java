public class CustomeLinkedListMain {
    public static void main(String[] args) {

        CustomeLinkedList list = new CustomeLinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.print();
    }

}

class CustomeLinkedList {

    private Node head;

    public void add(int num) {
        if (head == null) {
            head = new Node(num);
            return ;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(num);

    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.num);
            current = current.next;

        }
    }

}

class Node {
    int num;
    Node next;

    Node(int num) {
        this.num = num;
        this.next = null;
    }
}
