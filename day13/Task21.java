package PracticeSet.atlaslearnings.day13;


class CircularLinkedList<T> {
    private Node<T> tail;
    private int size = 0;

    // Inner class for Node
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T value) {
            data = value;
            next = null;
        }
    }

    // Add to the end
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // point to itself
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add to the front
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        size++;
    }

    // Delete by value (first occurrence)
    public void deleteByValue(T value) {
        if (tail == null) return;

        Node<T> curr = tail.next;
        Node<T> prev = tail;

        do {
            if (curr.data.equals(value)) {
                if (curr == tail && curr.next == tail) {
                    tail = null; // only one element
                } else {
                    prev.next = curr.next;
                    if (curr == tail) {
                        tail = prev;
                    }
                }
                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next); // full circle
    }

    // Display the list
    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<T> curr = tail.next;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != tail.next);
        System.out.println("(back to head)");
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return tail == null;
    }
}
public class Task21 {
    public static void main(String[] args) {
        CircularLinkedList<Integer> clist = new CircularLinkedList<>();
        clist.addFirst(1);
        clist.addFirst(2);
        clist.addFirst(3);
        clist.addFirst(4);
        clist.addFirst(5);
        clist.display();
    }
}
