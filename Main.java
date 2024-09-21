public class Main {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(1204);
        root.left.left = new Node(222);
        root.left.right = new Node(1240);
        root.right.left = new Node(1102);
        root.right.right = new Node(17);

        System.out.println(Bst.pesquisar(root, 29) != null ? "Found" : "Not Found");

        System.out.println(Bst.pesquisar(root, 22) != null ? "Found" : "Not Found");

        Node.treePrint(root);
        System.out.println("Hello world!");
    }
}