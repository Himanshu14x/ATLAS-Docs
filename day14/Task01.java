package PracticeSet.atlaslearnings.day14;

class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class CustomLinkedList {
    Node head;

    // Insert at the end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class Task01 {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.printList();
    }
}

