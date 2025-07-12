package PracticeSet.atlaslearnings.day17;

 class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        int data;
        Node left, right, parent;
        boolean color;

        Node(int data) {
            this.data = data;
            color = RED;
        }
    }

    private Node root;

    public void insert(int data) {
        Node node = new Node(data);
        root = bstInsert(root, node);
        fixInsert(node);
    }

    private Node bstInsert(Node root, Node node) {
        if (root == null) return node;
        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    private void rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    private void rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null) y.right.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.right) x.parent.right = y;
        else x.parent.left = y;
        y.right = x;
        x.parent = y;
    }

    private void fixInsert(Node k) {
        while (k != root && k.parent.color == RED) {
            if (k.parent == k.parent.parent.left) {
                Node u = k.parent.parent.right;
                if (u != null && u.color == RED) {
                    k.parent.color = BLACK;
                    u.color = BLACK;
                    k.parent.parent.color = RED;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.right) {
                        k = k.parent;
                        rotateLeft(k);
                    }
                    k.parent.color = BLACK;
                    k.parent.parent.color = RED;
                    rotateRight(k.parent.parent);
                }
            } else {
                Node u = k.parent.parent.left;
                if (u != null && u.color == RED) {
                    k.parent.color = BLACK;
                    u.color = BLACK;
                    k.parent.parent.color = RED;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.left) {
                        k = k.parent;
                        rotateRight(k);
                    }
                    k.parent.color = BLACK;
                    k.parent.parent.color = RED;
                    rotateLeft(k.parent.parent);
                }
            }
        }
        root.color = BLACK;
    }

    public void delete(int data) {
        Node node = search(root, data);
        if (node == null) return;
        deleteNode(node);
    }

    private Node search(Node root, int data) {
        if (root == null || root.data == data) return root;
        return data < root.data ? search(root.left, data) : search(root.right, data);
    }

    private void transplant(Node u, Node v) {
        if (u.parent == null) root = v;
        else if (u == u.parent.left) u.parent.left = v;
        else u.parent.right = v;
        if (v != null) v.parent = u.parent;
    }

    private Node minimum(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    private void deleteNode(Node z) {
        Node y = z;
        boolean yOriginalColor = y.color;
        Node x;

        if (z.left == null) {
            x = z.right;
            transplant(z, z.right);
        } else if (z.right == null) {
            x = z.left;
            transplant(z, z.left);
        } else {
            y = minimum(z.right);
            yOriginalColor = y.color;
            x = y.right;
            if (y.parent == z) {
                if (x != null) x.parent = y;
            } else {
                transplant(y, y.right);
                y.right = z.right;
                if (y.right != null) y.right.parent = y;
            }
            transplant(z, y);
            y.left = z.left;
            if (y.left != null) y.left.parent = y;
            y.color = z.color;
        }
        if (yOriginalColor == BLACK) fixDelete(x);
    }

    private void fixDelete(Node x) {
        if (x == null) return;

        while (x != root && getColor(x) == BLACK) {
            if (x == x.parent.left) {
                Node w = x.parent.right;
                if (getColor(w) == RED) {
                    w.color = BLACK;
                    x.parent.color = RED;
                    rotateLeft(x.parent);
                    w = x.parent.right;
                }
                if (getColor(w.left) == BLACK && getColor(w.right) == BLACK) {
                    w.color = RED;
                    x = x.parent;
                } else {
                    if (getColor(w.right) == BLACK) {
                        if (w.left != null) w.left.color = BLACK;
                        w.color = RED;
                        rotateRight(w);
                        w = x.parent.right;
                    }
                    w.color = x.parent.color;
                    x.parent.color = BLACK;
                    if (w.right != null) w.right.color = BLACK;
                    rotateLeft(x.parent);
                    x = root;
                }
            } else {
                Node w = x.parent.left;
                if (getColor(w) == RED) {
                    w.color = BLACK;
                    x.parent.color = RED;
                    rotateRight(x.parent);
                    w = x.parent.left;
                }
                if (getColor(w.right) == BLACK && getColor(w.left) == BLACK) {
                    w.color = RED;
                    x = x.parent;
                } else {
                    if (getColor(w.left) == BLACK) {
                        if (w.right != null) w.right.color = BLACK;
                        w.color = RED;
                        rotateLeft(w);
                        w = x.parent.left;
                    }
                    w.color = x.parent.color;
                    x.parent.color = BLACK;
                    if (w.left != null) w.left.color = BLACK;
                    rotateRight(x.parent);
                    x = root;
                }
            }
        }
        if (x != null) x.color = BLACK;
    }

    private boolean getColor(Node node) {
        return node != null && node.color == RED;
    }

    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(10);
        tree.insert(5);
        tree.insert(1);
        tree.inorder();
        tree.delete(10);
        tree.delete(15);
        tree.inorder();
    }
}

