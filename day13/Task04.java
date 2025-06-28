package PracticeSet.atlaslearnings.day13;

class Node<T> {
    T data;
    Node next;

    Node(T value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList <T>{
    private Node head;

    LinkedList() {
        head = null;
    }


    void insertAtEnd(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    void deleteByValue(T value) {
        if (head == null) return;

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public Object get(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.data;
            }
            temp = temp.next;
            currentIndex++;
        }


        throw new IndexOutOfBoundsException("Unexpected error at index: " + index);
    }

}

public class Task04 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd("Himanshu");
        list.insertAtEnd(20);
        list.insertAtEnd('T');

        System.out.print("Linked List: ");
        list.display();

        list.deleteByValue(20);

        System.out.print("After Deleting 20: ");
        list.display();
        System.out.println("Size of the array is "+ list.getSize());
    }
}
