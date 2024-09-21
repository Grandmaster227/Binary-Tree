public class Node {
    int k;
    Node left, right;

    public Node(int k) {
        this.k = k;
        right = null;
        left = null;
    }

    private Node addRecursiva(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }
        if (valor < atual.k) {
            atual.left = addRecursiva(atual.left, valor);
        }
        else if (valor > atual.k) {
            atual.right = addRecursiva(atual.right, valor);
        }
        return atual;
    }

    public void add(int valor) {
        addRecursiva(this, valor);
    }

    public static int getcol(int height) {
        return(int) Math.pow(2, height) - 1;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void printarTree(int[][] M, Node root, int col, int row, int height) {
            if (root == null)
                return;
            M[row][col] = root.k;
            printarTree(M, root.left, col - (int)Math.pow(2, height - 2), row + 1, height - 1);
            printarTree(M, root.right, col + (int)Math.pow(2, height - 2), row + 1, height - 1);
    }

    public static void treePrint(Node root) {
        int h = height(root);
        int col = getcol(h);
        int[][] M = new int[h][col];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                M[i][j] = 0;
            }
        }

        root.printarTree(M, root, col / 2, 0, h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0)
                    System.out.print("   ");
                else
                    System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
