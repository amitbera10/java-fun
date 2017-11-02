package algo;


public class MyBinaryTree {
    Node root = null;

    public void insert(int data){
        if (root ==null){
            root = insert(root,data);
        }else {
            if (root.getLeft()==null){
                insert(root.getLeft(),data);
            }else if (root.getRight()==null){
                insert(root.getRight(),data);
            }
        }
    }

    public void inorder(){
        System.out.println(root.data);

    }

    private Node insert(Node node,int data){
        if (node == null){
            node = new Node(data);
        }
        return node;
    }



    /*Node structure*/
    private class Node{
        private Node left;
        private Node right;
        int data = 0;
        Node(int data){
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}

