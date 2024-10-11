class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SingleLinked{
    Node head;
    int size;

    SingleLinked(){
        this.head = null;
        this.size =0;
    }

    void insertFirst(int data){
        Node newNode = new Node(data);
        size = size +1;
        if(head==null){
            head = newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    int removeFirst(){
        if(head == null){
            System.out.println("Single Linked List is Empty");
            return -1;
        }else{
            int x;
            x = head.data;
            head = head.next;
            return x;
        }
    }

    void print(){
        if(head==null){
            System.out.println("Single Linked List is Empty");
        }else{
            Node currentNode = head;
            while(currentNode.next != null){
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data);
        }
    }

    public static void main(String[] args){
        SingleLinked sl = new SingleLinked();
        sl.insertFirst(10);
        sl.insertFirst(20);
        sl.insertFirst(30);
        sl.insertFirst(40);
        sl.insertFirst(50);
        sl.print();
        sl.removeFirst();
        System.out.println("");
        sl.print();
    }
}