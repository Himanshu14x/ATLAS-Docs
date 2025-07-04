package PracticeSet.atlaslearnings.day14;

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

 class CircularLinkedList {
    Node1 head = null;
    Node1 tail = null;


    public void insert(int value) {
        Node1 newNode = new Node1(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }


    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node1 temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}

public class Task03 {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);

        cll.printList();
    }
}

