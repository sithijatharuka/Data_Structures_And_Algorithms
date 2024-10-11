class Circular{
    int rear,front,size;
    int arr[];

    Circular(int size){
        this.size = size;
        rear = -1;
        front = -1;
        arr = new int[size];
    }

    void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }else if(isEmpty()){
            rear = front = 0;           
        }else{
           rear = (rear+1)%size;
        }
        arr[rear] = data;
    }

    int deQueue(){
        int x = 0;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else if(rear==front){
            rear = front = -1;
        }else{
            x = arr[front];
            front = (front + 1)%size;
        }
        return x;
    }

    boolean isFull(){
        if((rear+1)%size == front){
            return true;
        }else {
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

    void print(){
        for(int i = front; i<= rear;i++){
               System.out.print(arr[i]+" ");
        }
    }

    int peek(){
        return arr[front];
    }

    public static void main(String[] args){
        Circular c = new Circular(5);
        c.enQueue(10);
        c.enQueue(20);
        c.enQueue(30);
        c.enQueue(40);
        c.enQueue(50);
        c.deQueue();
        c.print();
        System.out.println("\nPeek Element: "+c.peek());
    }

}