class Bubble{
    void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {10,4,70,50, 40,1};
        Bubble b = new Bubble();
        b.bubbleSort(arr);

        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}