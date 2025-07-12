package PracticeSet.atlaslearnings.day17;

class AVLTree {


    class Node {
        int key;
        int height;
        Node left, right;

        Node(int data) {
            key = data;
            height = 1;
        }
    }

    private Node root;


    public void insert(int key) {
        root = insert(root, key);
    }


    private Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;


        node.height = 1 + Math.max(height(node.left), height(node.right));


        int balance = getBalance(node);


        if (balance > 1 && key < node.left.key)
            return rightRotate(node);


        if (balance < -1 && key > node.right.key)
            return leftRotate(node);


        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }


        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }


    private int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.height;
        }
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return leftHeight - rightHeight;
        }
    }



    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;


        x.right = y;
        y.left = T2;


        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }


    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;


        y.left = x;
        x.right = T2;


        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }


    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }


    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        int[] keys = { 10, 20, 30, 40, 50, 25 };
        for (int key : keys) {
            tree.insert(key);
        }

        System.out.print("Inorder traversal: ");
        tree.inorder();
    }
}

