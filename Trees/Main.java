public class Main {
    public class Node {
        int val;
        Node left;
        Node right;

        public Node(int item) {
            val = item;
            right = left = null;
        }
    }

    public class Tree {
        Node root;

        public Tree() {
            root = null;
        }

        public void insert(int val) {
            root = insertVal(root, val);
        }

        private Node insertVal(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                return root;
            }

            if (val < root.val) {
                root.left = insertVal(root.left, val);
            } else if (val > root.val) {
                root.right = insertVal(root.right, val);
            }

            return root;
        }

        public void inOrder() {
            inOrderTraversal(root);
        }

        public void postOrder() {
            postOrderTraversal(root);
        }

        public void preOrder() {
            preOrderTraversal(root);
        }

        private void inOrderTraversal(Node root) {
            if (root != null) {
                inOrderTraversal(root.left);
                System.out.print(root.val + " ");
                inOrderTraversal(root.right);

            }
        }

        private void preOrderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.val + " ");
                preOrderTraversal(root.left);
                preOrderTraversal(root.right);

            }
        }

        private void postOrderTraversal(Node root) {
            if (root != null) {
                postOrderTraversal(root.left);
                postOrderTraversal(root.right);
                System.out.print(root.val + " ");

            }
        }

    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        Tree t = mainInstance.new Tree();

        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.insert(7);

        System.out.println("In-order traversal");
        t.inOrder();

        System.out.println("\n\nPre-order traversal ");
        t.preOrder();

        System.out.println("\n\nPost-order traversal ");
        t.postOrder();
    }
}
