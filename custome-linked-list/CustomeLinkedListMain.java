// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
public class CustomeLinkedListMain {
    Node head;

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value
    public void deleteNode(int key) {
        Node current = head, prev = null;

        // If head needs to be deleted
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the node to be deleted
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not found
        if (current == null) {
            System.out.println("Key not found");
            return;
        }

        // Unlink the node
        prev.next = current.next;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        CustomeLinkedListMain ll = new CustomeLinkedListMain();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtBeginning(5);
        ll.display();  // Output: 5 -> 10 -> 20 -> null
        ll.deleteNode(10);
        ll.display();  // Output: 5 -> 20 -> null
    }
}
