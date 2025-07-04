package PracticeSet.atlaslearnings.day14;

 class CircularLinkedList1 {
    Node head = null;
    Node tail = null;


    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }


    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        Node prev = tail;

        do {
            if (current.data == value) {

                if (current == head && current == tail) {
                    head = tail = null;
                }

                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }

                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }

                else {
                    prev.next = current.next;
                }
                System.out.println("Deleted: " + value);
                return;
            }

            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Value not found: " + value);
    }


    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}

public class Task04 {
    public static void main(String[] args) {
        CircularLinkedList1 cll = new CircularLinkedList1();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        cll.printList();

        cll.delete(10);
        cll.printList();

        cll.delete(40);
        cll.printList();

        cll.delete(25);
        cll.printList();

        cll.delete(30);
        cll.printList();

        cll.delete(20);
        cll.printList();
    }
}

