public class CustomLinkedListFastMain {

    public static void main(String[] args) {
        CustomeLinkedList list = new CustomeLinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(3);
        System.out.println(list);
    }

}

class CustomeLinkedList {

    private Node head;
    private Node tail;

    public void add(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void remove(int num) {

        if (head == null)
            return;
        if (head.num == num) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.num == num) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.num).append(" -> ");
            curr = curr.next;
        }
        sb.append("null");
        return sb.toString();
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