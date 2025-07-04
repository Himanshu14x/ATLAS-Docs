package PracticeSet.atlaslearnings.day14;

class MyQueue {
    private Node front, rear;
    private int size;
    private int capacity;

    public MyQueue() {
        this.front = this.rear = null;
    }
    public MyQueue(int capacity) {
        this.front = this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }


    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }


    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }


    public boolean isEmpty() {
        return front == null;
    }
    public int size() {
        return size;
    }


    public int capacity() {
        return capacity;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Task10 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.peek());
        q.printQueue();
        System.out.println("Is empty? " + q.isEmpty());




        MyQueue q1 = new MyQueue(3);



        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        System.out.println("Capacity: " + q1.capacity());
        System.out.println("Size: " + q1.size());
        System.out.println("Is Full? "+q1.isFull());
    }
}

