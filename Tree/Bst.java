class Node {
    int data;
    Node right,left;

    Node(int data){
        this.data = data;
        this.right = null;
        this.left  = null; 
    }
}

class Bst{
    Node root;

    Bst(){
        this.root = null;
    }

    //insert 
    void insert(int data){
        root = insertRec(root,data);
    }

    Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insertRec(root.left,data);
        }else if(data > root.data){
            root.right = insertRec(root.right,data);
        }

        return root;
    }

    //delete
    void delete(int data){
        root = deleteRec(root,data);
    }

    Node deleteRec(Node root,int data){
        if(root == null) return root;

        if(data < root.data){
            root.left = deleteRec(root.left,data);
        }else if(data > root.data){
            root.right = deleteRec(root.right,data);
        }else{
            if(root.left == null){
                return root.left;
            }else if(root.right == null){
                return root.right;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right,data);
        }
        return root;
    }

    int minValue(Node root){
        int minV = root.data;
        while(root.left != null){
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    } 

    boolean search(int data){
        return searchRec(root,data);
    }

    boolean searchRec(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        return data < root.data ? searchRec(root.left,data) : searchRec(root.right,data);
    }

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.data + " ");
            inorderRec(root.right);
        }
    }

    void preorder(){
        preorderRec(root);
    }

    void preorderRec(Node root){
        if(root != null){
            System.out.println(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder(){
        postorderRec(root);
    }

    void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.data +  " " );
        }
    }

    void display(){
        displayRec(root);
    }

    void displayRec(Node root){
        if(root == null){
            return;
        }
        displayRec(root.right);   
        System.out.println(root.data);
        displayRec(root.left);
    }
    

    public static void main(String []args){
        Bst bst = new Bst();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        bst.display();
    }
}