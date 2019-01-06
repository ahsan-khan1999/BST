public class Implementation {
    Node root;
    private Node insert(Node root , int data){
        if (root == null){
           root = new Node(data);

        }
//        if (root!=null || root.left!=null)
        else if (data < root.data){
            root.left = insert(root.left,data);
//            return root.left;
        }
        else if (data>root.data){
            root.right = insert(root.right,data);
//            return root.right;
        }
        else {
            return root;
        }

//        return 0;
        return root;
    }
    void add(int data){
        this.root = insert(this.root,data);
    }



    private void getBST(Node root){
        if (root != null){
            getBST(root.left);
            System.out.print(root.data+"-->");
            getBST(root.right);
        }

//            if (root.left !=null && root.right!=null){
//            print(root.left.left);
//            System.out.println(root.data);
//            print(root.right.right);
//        }
    }
    void print(){
        getBST(this.root);
    }
    private Node search(Node root ,int data){
        if ( root==null || root.data == data ){
//            if (root!=null)
//            root = null;
            return root;

        }
        if (root.data>data){
            System.out.println("a");
            return search(root.left,data);
        }
        System.out.println("b");
        return search(root.right,data);
    }
    public void get(int data){
//        search(this.root,data);
        System.out.println(search(this.root,data));
    }
        private Node delete(Node n,int data){
                if (n==null || n.data==data){
//                    Node nn=n;
                    n=null;
                    return n;
                }
                else if (n.data > data){
                    n.left =delete(n.left,data);
//                    return delete(n.left,data);
//                    return n.left;
                }
                else {
                    n.right =delete(n.right,data);
//                    return delete(n.right,data);
                }
            return n;
    }
        void deleteNode(int data){
                delete(this.root,data);
//            return null;
        }
    private void inorderSuccesor(Node root){
        if (root !=null){
//            System.out.print("-->");
            getBST(root.left);
//            System.out.print("-->");
            System.out.print(root.data+"-->");
            getBST(root.right);
//            System.out.print("-->");
        }
        System.out.println("-1");
    }
    void printInorderSuccesor(){
        inorderSuccesor(this.root);
    }


}



//        if (root.left == null){
//            root.left =new Node(data);
//        }
//
//        else if (root.right==null){
//            root.right= new Node(data);
//        }


//        if (root.left!=null && root.right!= null) {
//            root.left.left=new Node();
//            root.right.right = new Node(data);
//            if (data < root.left.data) {
//                root.left.left.data = data;
//            }
//            else {
//                root.right.right.data=data;
//            }