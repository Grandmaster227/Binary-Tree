public class Main {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.add(11);
        root.add(213);
        root.add(1204);
        root.add(16);
        root.add(1102);
        root.add(333);


        System.out.println(Bst.pesquisar(root, 29) != null ? "Found" : "Not Found");

        System.out.println(Bst.pesquisar(root, 22) != null ? "Found" : "Not Found");

        System.out.println("\nÁrvore inicial:");
        Node.treePrint(root);

        root = Node.removeNode(root, 213);
        System.out.println("\nÁrvore depois de remover o valor 213:");
        Node.treePrint(root);

        root = Node.removeNode(root, 16);
        System.out.println("\nÁrvore depois de remover o valor 16:");
        Node.treePrint(root);


        System.out.println("Hello world!");
    }
}