public class Bst {

    static Node pesquisar(Node root, int k)
    {
        if (root == null || root.k == k)
            return root;
        if (root.k < k)
            return pesquisar(root.right, k);

        return pesquisar(root.left, k);
    }

}
