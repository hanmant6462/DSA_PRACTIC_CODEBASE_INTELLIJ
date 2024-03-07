package Practice;

public class PrintBinaryTree {

    public static void main(String[] args) {
        // Create a sample binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node1(4);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(6);
        tree.root.left.left = new Node1(1);
        tree.root.left.right = new Node1(3);
        tree.root.right.left = new Node1(5);
        tree.root.right.right = new Node1(7);

        // Print the numbers in the binary tree
        tree.printTreeNumbers();
    }
}

    class Node1 {
        int value;
        Node1 left;
        Node1 right;

        Node1(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    class BinaryTree {
        Node1 root;

        BinaryTree() {
            root = null;
        }

        void printTreeNumbers() {
            printTreeNumbers(root);
        }

        private void printTreeNumbers(Node1 node) {
            if (node == null)
                return;

            // Traverse the left subtree
            printTreeNumbers(node.left);

            // Print the value of the current node
            System.out.print(node.value + " ");

            // Traverse the right subtree
            printTreeNumbers(node.right);
        }
    }





