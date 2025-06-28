package PracticeSet.atlaslearnings.day13;


class Node1{
    int data;
    Node1 next;

    Node1(int value){
        this.data = value;
        this.next = null;
    }

}

class LinkedList1{
    private Node1 head;

    LinkedList1(){
        head = null;
    }

    void insertAtEnd(int value){
        Node1 newNode = new Node1(value);
        if(head==null){
            head = newNode;
        } else{
            Node1 temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void deleteByValue(int value){
        if(head==null) return;
        if(head.data == value){
            head = head.next;
            return;
        }

        Node1 temp = head;
        while(temp.next!=null && temp.next.data !=value){
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }

    }

    void display(){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}

public class Task03 {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Linked List: ");
        list.display();
        list.deleteByValue(20);
        System.out.println("After deleting 20");
        list.display();
    }
}
