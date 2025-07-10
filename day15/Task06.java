package PracticeSet.atlaslearnings.day15;

 class BinarySearchTree1 {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;


    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }


    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        if (key < node.data) return searchRec(node.left, key);
        else return searchRec(node.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree1 bst = new BinarySearchTree1();


        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Search 60: " + bst.search(60));
        System.out.println("Search 25: " + bst.search(25));
    }
}

