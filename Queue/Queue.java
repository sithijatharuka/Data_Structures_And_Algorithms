class Queue{
    int rear;
    int front;
    int arr[];
    int size;

    Queue(int size){
        this.size = size;
        front = -1;
        rear = -1;
        arr =new int[size];
    }

    void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
        }else if(isEmpty()){
            rear = front = 0;
        }else{
            rear++;
        }
        arr[rear] = data;
    }

    int deQueue(){
        int x=0;
        if(isEmpty()){
            System.out.print("Queue is empty");
        }else if(rear == front){
            front = rear = -1;
        }else{
            x = arr[front];
            front++;
        }
        return x;
    }

    boolean isFull(){
        if(rear == size-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(rear == -1 && front == -1){
            return true;
        }else{
            return false;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            return arr[front];
        }
    }

    void print(){
        for(int i = front; i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        q.deQueue();
        q.print();

        System.out.println("\nPeek element is: "+q.peek());
    }
}