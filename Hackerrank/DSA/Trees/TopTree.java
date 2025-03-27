import java.util.*;
import javafx.util.Pair;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TopTree {

    /*
     * 
     * class Node
     * int data;
     * Node left;
     * Node right;
     */
    public static void topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            print(ans);
        }
        ;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();

    }

    public static void print(ArrayList<Integer> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i) + " ");
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}
