class Stack{
    int size;
    int[] arr;
    int top;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // push
    void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }else{
            top = top +1;
            arr[top] = data;
        }

    }

    // pop => delete last inserted item
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int x;
        x = arr[top];
        top = top -1;
        return x;        
    }

    // isFull
    boolean isFull(){
        if(top == size-1){
            return true;
        }else{
            return false;
        }
    }

    // isEmpty
    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    // peek
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }        
        return arr[top];        
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
                
        stack.pop();  
        
        stack.printStack();

        System.out.println("\npeek element: " + stack.peek());
    }
}