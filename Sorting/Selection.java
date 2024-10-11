class Selection{
    void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {10,4,70,50, 40,1};
        Selection s = new Selection();
        s.selectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}