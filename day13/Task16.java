package PracticeSet.atlaslearnings.day13;

class DoublyNode<T> {
    T data;
    DoublyNode<T> next;
    DoublyNode<T> prev;

    DoublyNode(T value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add to end
    public void addLast(T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Add to beginning
    public void addFirst(T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }


    public void deleteByValue(T value) {
        if (head == null) return;

        DoublyNode<T> current = head;
        while (current != null && !current.data.equals(value)) {
            current = current.next;
        }

        if (current == null) return; // Not found

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null; // list became empty
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        size--;
    }


    public void displayForward() {
        DoublyNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ⇄ ");
            current = current.next;
        }
        System.out.println("null");
    }


    public void displayBackward() {
        DoublyNode<T> current = tail;
        while (current != null) {
            System.out.print(current.data + " ⇄ ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class Task16 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>DN = new DoublyLinkedList<>();
        DN.addFirst(1);
        DN.addFirst(2);
        DN.addLast(3);
        DN.addFirst(4);
        DN.addLast(5);

        DN.displayForward();
    }



}
